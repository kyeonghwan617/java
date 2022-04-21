package com.pcwk.api.string;

import org.apache.log4j.Logger;

public class StringValueOfMain {
	final static Logger LOG = Logger.getLogger(StringValueOfMain.class);
	public static void main(String[] args) {
		String numStr = "100";
		LOG.debug("numStr="+numStr); //numStr=100
		int num = Integer.parseInt(numStr);
		int num02 = Integer.valueOf(numStr);
		LOG.debug(numStr+1);//문자열+1 -> 1001
		LOG.debug(num+1);//101
		LOG.debug(num02+1);//101
		
		String doubleStr = "200.1";
		Double doubleNum = Double.parseDouble(doubleStr);
		Double doubleNum02 = Double.valueOf(doubleStr);
		LOG.debug(doubleNum+1);//201.1
		LOG.debug(doubleNum02+1);//201.1
		
	}

}
