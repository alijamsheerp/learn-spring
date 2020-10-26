package jam.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Triangle triangle1 = context.getBean("triangle", Triangle.class);
		triangle1.printSomething();
		
	}

}
