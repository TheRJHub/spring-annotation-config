package newSpring.com;

import java.util.HashMap;
import java.util.LinkedList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sun.org.apache.xerces.internal.impl.XMLEntityManager;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@Configuration
@ComponentScan(basePackages = "newSpring.com")
public class DemoConfig {
	@Bean
	public LinkedList getLL() {
		return new LinkedList();
	}
	@Bean
	public HashMap getHM() {
		return new HashMap();
	}

	@Bean
	public EntityManagerFactory getEMF() {
	    return Persistence.createEntityManagerFactory("myPU");
	}
}
