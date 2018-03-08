package com;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.business.bean.HotelBean;
import com.business.bean.HotelDealsFilter;
import com.business.bean.SearchableField;
import com.business.exception.BusinessException;
import com.business.handler.HotelsDealsHandler;

/**
 * This class represents the entry point for the application and contains all
 * the exposed API's to the client.
 * 
 */
@Controller
@SessionAttributes({ Entry.FILTER })
@SpringBootApplication
public class Entry {

	private HotelsDealsHandler hotelsDealsHandler;
	public static final String FILTER = "filter";
	public static final String INDEX_PAGE = "index";
	public static final String ERROR_PAGE = "error";

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Entry.class, args);
	}

	@PostConstruct
	void init() {
		hotelsDealsHandler = new HotelsDealsHandler();
	}

	/**
	 * Handles the client request and as Entry point.
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/")
	String index(Map<String, Object> model) {

		HotelDealsFilter filter = hotelsDealsHandler.getHotelDealsFilter();
		model.put(FILTER, filter);
		return INDEX_PAGE;
	}

	/**
	 * Searches on the hotel deals based on the passed request parameters
	 * 
	 * @param request
	 * @param model
	 * 
	 * @return page name
	 * @throws BusinessException
	 */
	@RequestMapping("/search")
	String search(HttpServletRequest request, Map<String, Object> model) throws BusinessException {

		if (request.getSession(false) == null) {
			return "redirect:/";
		}
		updateFilterValues(request);
		HotelDealsFilter filter = (HotelDealsFilter) request.getSession().getAttribute(FILTER);
		List<HotelBean> hotels = hotelsDealsHandler.getHotelsDeals(filter);
		model.put("hotels", hotels);
		return INDEX_PAGE;
	}

	/**
	 * Updates the filter values from the sent request parameters.
	 * 
	 * @param request
	 */
	private void updateFilterValues(HttpServletRequest request) {

		HotelDealsFilter filter = (HotelDealsFilter) request.getSession().getAttribute(FILTER);
		List<SearchableField> fields = filter.getSearchableFields();
		for (SearchableField searchableField : fields) {
			searchableField.setValue(request.getParameter(searchableField.getName()));
		}
		filter.setSearchableFields(fields);
	}

	/**
	 * Handles the business Exceptions
	 * 
	 * @param ex
	 * @param model
	 * @return
	 */
	@ExceptionHandler(BusinessException.class)
	public String handleCustomException(BusinessException exception, Map<String, Object> model) {
		model.put("messege", exception.getMessage());
		return ERROR_PAGE;

	}

}