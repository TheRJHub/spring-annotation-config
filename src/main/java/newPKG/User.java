package newPKG;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User extends UPI {
	@Autowired
	@Qualifier("NPCI")
	Payment p;

	public void r() {
		p.payment();
	}
}
