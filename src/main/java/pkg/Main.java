package pkg;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DemoConfig.class);
	User u=ac.getBean(User.class);
	u.display();
}
}
