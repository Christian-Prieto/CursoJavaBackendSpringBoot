package com.Chriscode.SpringBootChris;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Chriscode.SpringBoot.Beans.Mundo;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main( String[] args ) {
		 ApplicationContext appContext = new
		ClassPathXmlApplicationContext("com/Chriscode/Springboot/xml/beans.xml");
		 Mundo m = (Mundo)appContext.getBean("mundo");
		 System.out.println(m.getSaludo());
		 ((ConfigurableApplicationContext)appContext).close();
		 }
}
