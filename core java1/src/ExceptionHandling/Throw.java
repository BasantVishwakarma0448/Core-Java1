package ExceptionHandling;

import javax.security.auth.login.LoginException;

public class Throw {
	public static void main(String[] args) {
	try {
		authenticate("trapti");
	}catch(LoginException e){
		System.out.println("Invalid id/Password");
	}
	}
	public static void authenticate(String login) throws LoginException{
		if(!"admin".equals(login)) {
			LoginException e = new LoginException();
			throw e;
		}
		else {
			System.out.println("Welcome User");
		}
	}
}
