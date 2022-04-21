package com.pcwk.api.string;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import org.apache.log4j.*;

public class StringEncoding {
	final static Logger  LOG = Logger.getLogger(StringEncoding.class);


	public static void main(String[] args) {
		String str = "가";
		
		try {
			byte[] bArr = str.getBytes("UTF-8");
			byte[] bARrrMS = str.getBytes("CP949");
					
			LOG.debug("UTF-8 brr:"+Arrays.toString(bArr)); //- UTF-8 brr:[-22, -80, -128]
			LOG.debug("UTF-8 :"+new String(bArr)); //- UTF-8 brr:가
			
			//한글 : 2byte
			LOG.debug("CP949 bArrMS:"+Arrays.toString(bARrrMS)); //- CP949 bArrMS:[-80, -95]
			LOG.debug("CP949 :"+new String(bARrrMS, "CP949")); //- CP949: 가
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}

}
