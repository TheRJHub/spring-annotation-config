package newPKG;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DemoConfig.class);
	User user = ac.getBean(User.class);
	user.r();
}
}
