package net.umapath;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
		Question te = (Question) context.getBean("si");
		
		te.displayInfo();
		//te.setName("what is Depnedancy Injection");
		//te.displayInfo();
		
	}

}
