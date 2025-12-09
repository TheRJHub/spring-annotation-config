package pkg2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Emp {
	Emp(){
		System.out.println("Hi");
	}
	@PostConstruct
	public void postConstruct() {
	System.out.println("Post Construct");
}
	@PreDestroy
	public void preDestroy() {

		System.out.println("Pre Destroyed");
}
}
