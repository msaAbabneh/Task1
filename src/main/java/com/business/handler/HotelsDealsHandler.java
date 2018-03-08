package com.business.handler;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.business.bean.HotelBean;
import com.business.bean.HotelDealsFilter;
import com.business.bean.SearchableField;
import com.business.exception.BusinessException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Deals;
import com.pojo.Hotel;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

/**
 * 
 * This class represent handler for the hotels and expose all needed methods
 * which used from the controller.
 * 
 */
public class HotelsDealsHandler {

	public static final String BASE_URL = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=fooo&uid=1223&productType=Hotel";

	/**
	 * Returns list of hotels by sending HTTP request to external API which
	 * query search criteria built from the passed filter fields values.
	 * 
	 * @param filter
	 * @return List of Hotels which represent the response of the External API.
	 * @throws BusinessException
	 */
	public List<HotelBean> getHotelsDeals(HotelDealsFilter filter) throws BusinessException {

		OkHttpClient client = new OkHttpClient();
		HttpUrl.Builder urlBuilder = HttpUrl.parse(BASE_URL).newBuilder();

		for (SearchableField field : filter.getSearchableFields()) {
			if (field==null || field.getValue()==null || StringUtils.isEmpty(field.getValue().trim())) {
				continue;
			}
			urlBuilder.addQueryParameter(field.getName(), field.getValue());
		}

		Request request = new Request.Builder().url(urlBuilder.build().toString()).build();
		Deals deals = null;
		try {
			Response response = client.newCall(request).execute();
			String json = response.body().string();
			ObjectMapper mapper = new ObjectMapper();
			deals = mapper.readValue(json, Deals.class);
		} catch (Exception e) {
			e.printStackTrace();
			throw new BusinessException(BusinessException.GENERAL_ERROR);
		}
		List<HotelBean> hotels = new ArrayList<>();

		for (Hotel hotel : deals.getOffers().getHotel()) {

			HotelBean bean = new HotelBean();
			bean.setHotelName(hotel.getHotelInfo().getHotelName());
			bean.setHotelImageUrl(hotel.getHotelInfo().getHotelImageUrl());
			bean.setIndex(hotels.size());
			bean.setCity(hotel.getDestination().getCity());
			bean.setContry(hotel.getDestination().getLongName());
			bean.setRate(hotel.getHotelInfo().getHotelStarRating());
			bean.setStreetAddress(hotel.getHotelInfo().getHotelStreetAddress());
			hotels.add(bean);
		}
		return hotels;
	}

	/**
	 * Returns Hotel filter contains the searchable fields which loaded from the
	 * serchableFields.properties
	 * 
	 * @return HotelDealsFilter
	 */
	public HotelDealsFilter getHotelDealsFilter() {
		return new HotelDealsFilter();
	}

}
