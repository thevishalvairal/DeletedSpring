package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjuctionTest {

	public static void main(String[] args) {
		System.out.println("SetterInjuctionTest.main()");
Resource res=null;
BeanFactory factory=null;
WishMessageGenerator generator;
Object obj=null,obj1=null,obj2=null;
String result=null;

		// hold name and location of spring bean cfg file
res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");

// create bean factory IOC container
factory=new XmlBeanFactory(res);

// get target bean class object
obj=factory.getBean("wmg");
obj1=factory.getBean("wmg");
obj2=factory.getBean("wmg");
System.out.println(obj.hashCode()+" "+obj1.hashCode()+" "+obj2.hashCode());

/*
//typecasting
generator=(WishMessageGenerator)obj;
// invoke the method
result=generator.generateWishMessage("vishal");
System.out.println("message::"+result); */

	}// main

}//class
