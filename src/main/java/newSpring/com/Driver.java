package newSpring.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext a=new AnnotationConfigApplicationContext(DemoConfig.class);
		Student s=a.getBean(Student.class);
		System.out.println(s);
		
		Emp e=a.getBean(Emp.class);
		System.out.println(e.getName());
		System.out.println(e.getId());
		System.out.println(e.getDept());
	}

}
