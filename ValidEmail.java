package javavalidationprj.validate;

public class ValidEmail extends ValidDeco {
	public ValidEmail(ValidationService service) {
		super(service);
	}
	
	public void valid(String email) throws Exception  {
		if(!email.contains("@")) {
			throw new Exception();
		}
	}
	
	public static void main(String args[]) {
		ValidateImpl v = new ValidateImpl();
		
		ValidationService s = new ValidDeco(new ValidEmail(v));
		try {
			s.valid("glenndsilva@gmail.com");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
