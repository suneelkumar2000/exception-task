package simpleCalculator;

import java.util.Scanner;

class InvalidOperatorException extends Exception
{
    public InvalidOperatorException(String s)
    {
       super(s);
    }
}
class Operator {
	char operator;
    Double number1, number2, result;
	Double operator(String operator,Double number1,Double number2) throws InvalidOperatorException{

	     
	      if(operator.equals("+")||operator.equals("-")||operator.equals("/")||operator.equals("*")) 
	      {
	        if(operator.equals("+")) 
	        {
	        	result = number1 + number2;
	        	return (result);
	        }
	        else if(operator.equals("-")) 
	        {
	        	result = number1 - number2;
	        	return (result);
	        }
	        else if(operator.equals("*")) 
	        {
	        	result = number1 * number2;
	        	return (result);
	        }
	        else  
	        {
	        	result = number1 / number2;
	        	return (result);
	        }
	      }
	      else 
	      {
	    	  throw new InvalidOperatorException("invalid operator");
	      }
	}
}
public class Calculator {
  public static void main(String[] args) {

    String operator;
    Double number1, number2;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Choose an operator: +, -, *, or /");
    operator = sc.nextLine();
    System.out.println("Enter first number");
    number1 = sc.nextDouble();

    System.out.println("Enter second number");
    number2 = sc.nextDouble();
    
   
    
    Operator ob=new Operator();
    try {
    System.out.println(number1 + operator + number2 + " = " +ob.operator(operator,number1,number2) );
    }
    catch(InvalidOperatorException oe) {
    	System.out.println(oe);
    }
  }
}
