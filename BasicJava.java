import java.util.ArrayList;
import java.util.Arrays;
public class BasicJava{
	//Write a method that prints all the numbers from 1 to 255.
	public Integer oneToThis(int start, int ending){
		System.out.println("Print 1-255");
		while(start <= ending){
			System.out.println(start);
			start++;
		}
		return 0;
	}

	//Write a method that prints all the odd numbers from 1 to 255.
	public Integer oddNumbers(int fromThisNumber, int toThisNumber){
		System.out.println("Print odd numbers between 1-255");
		for(int i = fromThisNumber; i <= toThisNumber; i++){
			if(i % 2 == 1){
				System.out.println(i);
			}
		}
		return 1;
	}

	/*Write a method that prints the numbers from 0 to 255, 
	but this time print the sum of the numbers that have been printed so far.*/
	public Integer sumLogic(int startingNumber, int endingNumber){
		System.out.println("Print Sum from this number");
		int sum = 0;
		for(int x = startingNumber; x <= endingNumber; x++){
			sum = sum + x;
			System.out.println("New number is: " + x + " sum: " + sum);
		}
		return 0;
	}

	/*Given an array X, say [1,3,5,7,9,13], write a method that would iterate 
	through each member of the array and print each value on the screen. 
	Being able to loop through each member of the array is extremely important.*/
	public Integer iterate(int[] arr1){
		for(int b = 0; b < arr1.length; b++){
			System.out.println(arr1[b]);
		}
		return 0;
	}

	/*Write a method (sets of instructions) that takes any array and prints 
	the maximum value in the array. Your method should also work with a given array 
	that has all negative numbers (e.g. [-3, -5, -7]), or even a mix of positive numbers, negative numbers and zero.*/
	public Integer findMax(int[] arr2){
		if(arr2.length < 2){
			System.out.println(arr2[0]);
			return 0;
		}
		int max = arr2[0];
		for(int c = 1; c < arr2.length; c++){
			if(arr2[c] > max){
				max = arr2[c];
			}else{
				continue;
			}
		}
		System.out.println(max);
		return 0;
	}

	/*Write a method that takes an array, and prints the AVERAGE of the values in the array.
	For example for an array [2, 10, 3], your method should print an average of 5. Again, 
	make sure you come up with a simple base case and write instructions to solve that base case first,
	then test your instructions for other complicated cases.*/
	public Integer average(int[] arr3){
		System.out.println("Get Average");
		int sum = 0;
		for(int d = 0; d < arr3.length; d++){
			sum += arr3[d];
		}
		System.out.println(sum/arr3.length);
		return 0;
	}

	/*Write a method that creates an array 'y' that contains all the odd numbers between 1 to 255.
	When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 255].*/
	public Integer arrayOddNumbers(int[] arr4){
		ArrayList<Integer> oddArray = new ArrayList<Integer>();
		for(int f = 0; f < arr4.length; f++){
			if(arr4[f] % 2 == 1){
				oddArray.add(arr4[f]);
			}
		}
		System.out.println(oddArray);
		return 0;
	}

	/*Write a method that takes an array and returns the number of values in that array whose 
	value is greater than a given value y. For example, if array = [1, 3, 5, 7] and y = 3, after 
	your method is run it will print 2 (since there are two values in the array that are greater than 3).*/
	public Integer findGreaterMethod(int[] arr5, int compare){
		int greaterThanCount = 0;
		for(int a = 0; a < arr5.length; a++){
			if(arr5[a] > compare){
				greaterThanCount += 1;
			}
		}
		System.out.println(greaterThanCount);
		return 0;
	}
	
	/*Given any array x, say [1, 5, 10, -2], write a method that replaces any negative number
	with the value of 0. When the method is done, x should have no negative values, say [1, 5, 10, 0].*/
	public Integer eliminate(int[] arr7){
		for(int f = 0; f < arr7.length; f++){
			if(arr7[f] < 0){
				arr7[f] = 0;
			}
		}
		System.out.println(Arrays.toString(arr7));
		return 0;
	}
}








