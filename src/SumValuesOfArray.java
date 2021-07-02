
public class SumValuesOfArray {

	public static void main(String[] args) {
		
		int sum = 0;
		
		int[] valuesArray = { 10, 20, 30, 40 , 50 };
		
		for (int i : valuesArray)
		{
			sum += i;
		}
		
		System.out.println("The Sum of values in the Array is : " + sum);

	}

}
