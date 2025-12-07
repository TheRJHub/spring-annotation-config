package newSpring.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Value("Rjt")
	private String name;
	@Value("69")
	private int age;
//	@Autowired
	private Mobile mob;//field Injecction
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Mobile getMob() {
		return mob;
	}
	//@Autowired  //setter Injection
	public void setMob(Mobile mob) {
		this.mob = mob;
	}
	@Autowired  //constr injection
	public Person(Mobile mob) {
		super();
		this.mob = mob;
	}
	
	
}
