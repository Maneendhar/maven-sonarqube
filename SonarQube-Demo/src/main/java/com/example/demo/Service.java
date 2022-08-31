package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

@org.springframework.stereotype.Service
public class Service {

	public String getMessage() {
		String str = "Hello Human";
		Object obj = getObject();
		obj.toString();
		return str;
	}

	private Object getObject() {
		Object obj = new Object();
		obj.equals("Tat");
		return obj;
	}

	public String getDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(new Date());

	}

}
