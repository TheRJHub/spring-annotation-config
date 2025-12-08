package pkg;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Primary
@Component
public class UPI implements Payment{

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("from UPI");
	}
	

}
