package daily.coding.problem_2;

//Given an array of integers, return a new array such that each element at index i of the new array
//is the product of all the numbers in the original array except the one at i.
//For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. 
//If our input was [3, 2, 1], the expected output would be [2, 3, 6].

public class ProductOfNumbersExceptCurrentIndex {
          
	
     int temp = 1;
	
	public void productOfNumbersInArray(int[] inputArray){
		 int lengthOfInputArray = inputArray.length;
		for(int i=0; i<lengthOfInputArray; i++){
			temp= inputArray[i]* temp;
		}
		for(int j=0; j<lengthOfInputArray; j++){
				 int result = temp/inputArray[j];
					System.out.println(result);

					 }
		 }
	
	
		 
			 
	}
	

	

