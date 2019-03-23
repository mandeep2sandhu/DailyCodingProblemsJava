package daily.coding.problem_1;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target k.
//For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

public class TwoNumbersSumEqualsTarget {
	  
	public void ReturnTwoIndicesOfNumbers(int[] input, int k){
		
		//getting length of the input array
		int lengthOfInputArray = input.length;
		for(int i=0; i<lengthOfInputArray; i++){
			for(int j=i+1; j<lengthOfInputArray; j++){
				int temp = input[i] + input[j];
				if(temp == k){
					
					//printing the indices where sum of two numbers is equal to the target
			           System.out.println(i + "," + j);
					
				}
			}
		}
		
	}

}
