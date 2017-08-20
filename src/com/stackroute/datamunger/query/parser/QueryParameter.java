package com.stackroute.datamunger.query.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
//this class contains the parameters and accessor/mutator methods of QueryParameter
public class QueryParameter {
	
	private String queryString;
	private String file;
	private String baseQuery;
	private String QUERY_TYPE;
	private ArrayList<String> fields;
	private ArrayList<Restriction> restrictions;
	private ArrayList<String> logicalOperators;
	private ArrayList<AggregateFunction> aggregateFunctions;
	private ArrayList<String> orderByField;
	private ArrayList<String> groupByField;
	public String getQueryString() {
		return queryString;
	}
	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getBaseQuery() {
		return baseQuery;
	}
	public void setBaseQuery(String baseQuery) {
		this.baseQuery = baseQuery;
	}
	public String getQUERY_TYPE() {
		return QUERY_TYPE;
	}
	public void setQUERY_TYPE(String qUERY_TYPE) {
		QUERY_TYPE = qUERY_TYPE;
	}
	public ArrayList<String> getFields() {
		return fields;
	}
	public void setFields(ArrayList<String> fields) {
		this.fields = fields;
	}
	public ArrayList<Restriction> getRestrictions() {
		return restrictions;
	}
	public void setRestrictions(ArrayList<Restriction> restrictions) {
		this.restrictions = restrictions;
	}
	public ArrayList<String> getLogicalOperators() {
		return logicalOperators;
	}
	public void setLogicalOperators(ArrayList<String> logicalOperators) {
		this.logicalOperators = logicalOperators;
	}
	public ArrayList<AggregateFunction> getAggregateFunctions() {
		return aggregateFunctions;
	}
	public void setAggregateFunctions(ArrayList<AggregateFunction> aggregateFunctions) {
		this.aggregateFunctions = aggregateFunctions;
	}
	public ArrayList<String> getOrderByField() {
		return orderByField;
	}
	public void setOrderByField(ArrayList<String> orderByField) {
		this.orderByField = orderByField;
	}
	public ArrayList<String> getGroupByField() {
		return groupByField;
	}
	public void setGroupByField(ArrayList<String> groupByField) {
		this.groupByField = groupByField;
	} 

			
}
