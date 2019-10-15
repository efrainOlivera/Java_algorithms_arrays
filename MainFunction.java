public class MainFunction{
	public static void main(String[] args){
		BasicJava classCall = new BasicJava();
		//Write a method that prints all the numbers from 1 to 255.
		int result = classCall.oneToThis(1,255);

		//Write a method that prints all the odd numbers from 1 to 255.
		int odd = classCall.oddNumbers(1,255);

		//Print Sum
		int sum = classCall.sumLogic(0,255);

		//Iterating through an array
		int[] myArray = {2,4,6,8};
		int array = classCall.iterate(myArray);

		//Find Max
		int[] myArray2 = {-9,-2,6,-2,-1};
		int array2 = classCall.findMax(myArray2);

		//Get Average
		int[] arr3 = {1,2,3,4};
		int averageArgument = classCall.average(arr3)

		//Array with Odd Numbers
		int[] arr4 = {1,3,4,5,6,7,8,9,0};
		int findOdd = classCall.arrayOddNumbers(arr4);

		//Greater Than Y
		int[] arr5 = {1,2,5,8,3,6};
		int toCompare = 2;
		int biggerCount = classCall.findGreaterMethod(arr5,toCompare);

		//Eliminate Negative Numbers
		int[] array7 = {1,-3,3,-2};
		int squaredArray = classCall.eliminate(array7);
	}
}




