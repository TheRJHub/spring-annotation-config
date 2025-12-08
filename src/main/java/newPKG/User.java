package newPKG;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User extends UPI {
	@Autowired
	Payment payment;

}
