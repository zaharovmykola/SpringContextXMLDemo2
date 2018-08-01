package org.tyaa.springcontextdemo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.tyaa.springcontextdemo2.builder.Unit;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context =
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Unit warriorUnit = (Unit) context.getBean("warrior_unit");
		Unit peasantUnit = (Unit) context.getBean("peasant_unit");
		
		warriorUnit.testActions();
		peasantUnit.testActions();
	}

}
