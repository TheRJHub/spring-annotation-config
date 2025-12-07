package newSpring.com;

import java.util.HashMap;
import java.util.LinkedList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import jakarta.persistence.EntityManagerFactory;


public class Driver2 {
public static void main(String[] args) {
	ApplicationContext ac=new AnnotationConfigApplicationContext(DemoConfig.class);
	Person p=ac.getBean(Person.class);
	System.out.println(p);
	System.out.println(p.getAge());
	System.out.println(p.getName());
 	System.out.println(p.getMob());
 	
 	System.out.println(ac.getBean(LinkedList.class));
 	System.out.println(ac.getBean(HashMap.class));
 	
 	System.out.println(ac.getBean(EntityManagerFactory.class));
}
}
