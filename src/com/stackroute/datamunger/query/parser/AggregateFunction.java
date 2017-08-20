package com.stackroute.datamunger.query.parser;

//this class is used to store Aggregate Function
public class AggregateFunction {
	
	private String field;
	private int result;
	private String function;
	private int aggregateFieldIndex;
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	public int getAggregateFieldIndex() {
		return aggregateFieldIndex;
	}
	public void setAggregateFieldIndex(int aggregateFieldIndex) {
		this.aggregateFieldIndex = aggregateFieldIndex;
	}
	@Override
	public String toString() {
		return "AggregateFunction [field=" + field + ", result=" + result + ", function=" + function
				+ ", aggregateFieldIndex=" + aggregateFieldIndex + "]";
	}
	
	
	
}
