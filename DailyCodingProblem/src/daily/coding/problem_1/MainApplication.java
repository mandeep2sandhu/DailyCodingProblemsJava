package daily.coding.problem_1;

public class MainApplication {

	public static void main(String[] args) {
           int[] inputList = {10, 15, 3, 7};
           int target = 17;
           //creating object of the classnamed 'TwoNumbersSumEqualsTarget'
           TwoNumbersSumEqualsTarget obj = new TwoNumbersSumEqualsTarget();
           
           //Calling the method of class named 'TwoNumbersSumEqualsTarget'
           obj.ReturnTwoIndicesOfNumbers(inputList, target);
           
	}

}
