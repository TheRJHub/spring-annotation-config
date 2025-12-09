package newPKG;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class UPI implements Payment {

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("FRom UPI");
	}

}
