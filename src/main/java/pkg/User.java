package pkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
	@Autowired
	Payment payment;
	
public void display() {
	payment.pay();
}
}
