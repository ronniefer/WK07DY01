
public class WhatIsTheOutput {

	/*
	 * This was admittedly tricky and I didn't realize I was wrong until
	 * I pasted the code onto eclipse. I then went through the loop manually
	 * using pen and paper and the additional code I added below shows how I
	 * got to the correct index output.
	 */
	
	public static void main(String[] args) {
		
        double[ ] exampleArray = {1,5,6,5,4,1};

        double maximum = exampleArray[0];

        int index = 0;
        
        // Extra code - start
        String maximumBefore;
        // Extra code - end

        for (int i = 1; i<exampleArray.length; i++){
        	
        	 // Extra code - start
        	 System.out.print("exampleArray[" + i + "]: " + exampleArray[i] );
        	 System.out.print(" index(before): " + index);
        	 maximumBefore = " maximum(before): " + maximum;
        	 // Extra code - end

             if (exampleArray[ i ] > maximum) {

                  maximum = exampleArray[ i ];

                  index = i;

             }
             
             // Extra code - start
             System.out.print(" index(after): " + index);
             System.out.print(maximumBefore);
             System.out.println(" maximum(after): " + maximum);
             // Extra code - end

        }

        System.out.println(index);

	}

}
