package pkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {
	@Autowired
	@Qualifier("UPI")
	Payment payment;
	
public void display() {
	payment.pay();
}
}
