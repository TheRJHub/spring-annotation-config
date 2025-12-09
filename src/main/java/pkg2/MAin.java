package pkg2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MAin {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DemoConfig.class);
//ac.close();
				Emp b = ac.getBean(Emp.class);
	}
}