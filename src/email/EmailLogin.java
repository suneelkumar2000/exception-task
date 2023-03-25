package email;

 
import java.lang.Exception;
import java.util.Scanner;  

class InvalidException extends Exception
{
    public InvalidException(String s)
    {
       super(s);
    }
}
  
class Login{
	private String email;
	private String password;
	static String login(String email,String password) throws InvalidException {
			if((email.equals("validuser@gmail.com"))&& (password.length()<=6)) {
				return ("welcome");
			}
			else {
				throw new InvalidException("invalid email and password");
			}
	}
}
public class EmailLogin  
{  
    public static void main(String arg[])  
    {  
    	String email,password;
    	Scanner sc= new Scanner(System.in);
    	System.out.println("enter the email id");
    	email=sc.nextLine();
    	System.out.println("enter the password");
    	password=sc.nextLine();
    	Login ob=new Login();
        try  
        {  
        	System.out.println(ob.login(email,password));
        }  
        catch(InvalidException ie)  
        {     
        	System.out.println(ie);
        }  
    }  
}

