package com.kepler.demo.main;

import junit.framework.Assert;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kepler.demo.start.QuickStart;

public class Client {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("kepler-client.xml");
		QuickStart start =(QuickStart) context.getBean("quickStartImport");

		for(int i=0;i<1;i++){
			System.out.println(start.hi("Kepler").hello());
			//Assert.assertEquals("Hello Kepler", start.hi("Kepler").hello());
		}
		context.close();
	}
}
