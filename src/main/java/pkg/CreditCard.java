package pkg;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
//@Primary
public class CreditCard implements Payment{

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("from CreditCard");
	}

}
