package washingmachine;

import java.util.InputMismatchException;
import java.util.Scanner;

class CapacityException extends InputMismatchException
{
    public CapacityException(String s)
    {
       super(s);
    }
}
interface Motor{
	int getCapacity() throws CapacityException;
	void run();
	void consume();
}
class WashingMachine implements Motor{
	private int capacity;
	public WashingMachine(int capacity) {
		this.capacity = capacity;
	}
	public int getCapacity()throws CapacityException {
		if(capacity==(int)capacity) {
		return capacity;
		}
		throw new CapacityException("invalid datatype");
		
	}
	public void run() {
		 System.out.println("Washing machine is running.");
	}
	public void consume() {
		System.out.println("consuming");
	}
}
public class MotorProgram {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter capacity: ");
		int capacity = sc.nextInt();
		WashingMachine wm = new WashingMachine(capacity);
		try 
		{
			System.out.println("Capacity: " + wm.getCapacity());
		}
		catch(CapacityException ce)
		{
			 System.out.println(ce);
		}
		wm.run();
		wm.consume();
	 }

}
