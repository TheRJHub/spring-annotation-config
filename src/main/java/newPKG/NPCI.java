package newPKG;

import org.springframework.stereotype.Component;

@Component
public class NPCI extends UPI{
@Override
public void payment() {
	// TODO Auto-generated method stub
	System.out.println("From NPCI");
}
}
