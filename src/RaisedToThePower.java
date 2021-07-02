import java.util.Arrays;
import java.util.Scanner;

public class RaisedToThePower {
	
	public static int[] toPower(int size, int power) {

		int[] arrayInt = new int[size];
		
		for (int i = 0; i < size; i++) {
			
			arrayInt[i] = i;
			
			for (int j = 1; j < power; j++) {
				arrayInt[i] = arrayInt[i] * i;
			}			
		}	
		return arrayInt;		
	}
	
	public static void main(String[] args) {
		
		int inputSize;
		int inputPower;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size:");
		inputSize =  input.nextInt();
		
		System.out.println("Enter Power:");
		inputPower =  input.nextInt();
		
		int[] powerArray = RaisedToThePower.toPower(inputSize, inputPower); 
		
		System.out.println("Array created is : " + Arrays.toString(powerArray));

	}

}
