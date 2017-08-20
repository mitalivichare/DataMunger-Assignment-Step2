package com.stackroute.datamunger.query.parser;

public class QueryParser {

	private QueryParameter queryParameter = new QueryParameter();
	public QueryParameter parseQuery(String queryString) {
		
		//this method will parse the queryString and will return the object of QueryParameter
		//class
		queryParameter.setFile(getFile(queryString));
		queryParameter.setBaseQuery(getBaseQuery(queryString));
		//queryParameter.setFields(getFields(queryString));
		return queryParameter;
	}
	
	// parse the queryString into words and display
		public String[] getSplitStrings(String queryString) {
		
			String[] words=queryString.split(" ");
			for(String word : words)
			{
				System.out.println(word);
			}
			
			return words;
		}

		// get and display the filename
		public String getFile(String queryString) {
			
			String fileName=queryString.split("from")[1].split(" ")[1];
			System.out.println(fileName);
			return fileName;
		}
		
		// getting the baseQuery and display
		public String getBaseQuery(String queryString) {
			
			String baseQuery=queryString.split("order by")[0].split("group by")[0].split("where")[0];
			System.out.println(baseQuery);
			return baseQuery;

		}
		
		// get and display the where conditions part(if where condition exists)
		public String getConditionsPartQuery(String queryString) {
			
			queryString=queryString.toLowerCase();
			if(queryString.contains("where"))
			{
				String whereCondition=queryString.split("order by")[0].split("group by")[0].split("where")[1];
				System.out.println(whereCondition);
				return whereCondition;
			}
			else
			{
			return null;
			}

		}
		
		//get the required fileds
		public String[] getFields(String queryString) {
			
			String[] requiredfields = queryString.split("select")[1].trim().split("from")[0].split("[\\s,]+");
			for(String field : requiredfields)
			{
				System.out.println(field);
			}
			return requiredfields;
			
		}
}
