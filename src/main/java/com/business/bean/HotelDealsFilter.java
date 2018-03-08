package com.business.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * This Class Represents the filter details (fields) which will be drown on the
 * UI , these fields details loaded from the serchableFields.properties
 * file(name , label).
 *
 */

public class HotelDealsFilter {

	private List<SearchableField> searchableFields;
	public static final String FIELDS_CONFIG_FILE = "serchableFields";
	public static final String FIELD_NAME_PREFIX = "Field_";
	public static final String NUMBER_OF_FIELDS = "NUMBER_OF_FIELDS";

	public HotelDealsFilter() {
		searchableFields = new ArrayList<SearchableField>();
		init();
	}

	/**
	 * Initializes the filter fields by load the field's attributes from the
	 * serchableFields.properties file.
	 * 
	 * The missing key will be ignored
	 * 
	 */
	private void init() {
		ResourceBundle bundle = ResourceBundle.getBundle(FIELDS_CONFIG_FILE);
		int numberOfFields = Integer.valueOf(bundle.getString(NUMBER_OF_FIELDS));
		for (int i = 1; i <= numberOfFields; i++) {
			String fieldname = FIELD_NAME_PREFIX + i;
			String[] fieldInfo = null;
			try {
				fieldInfo = bundle.getString(fieldname).split(":");
			} catch (MissingResourceException e) {
				e.printStackTrace();
				continue;
			}
			SearchableField field = new SearchableField();
			field.setName(fieldInfo[0]);
			field.setLable(fieldInfo[1]);
			addSearchableField(field);
		}
	}

	public List<SearchableField> getSearchableFields() {
		return new ArrayList<>(searchableFields);
	}

	public void setSearchableFields(List<SearchableField> searchableFields) {
		this.searchableFields = searchableFields;
	}

	public void addSearchableField(SearchableField searchableField) {
		this.searchableFields.add(searchableField);
	}

	/**
	 * Resets the fields values.
	 */
	public void reset() {
		for (SearchableField searchableField : searchableFields) {
			searchableField.setValue("");
		}
	}
}
