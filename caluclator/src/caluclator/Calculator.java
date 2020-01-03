package caluclator;




/**
 * This is caluclator class having three methods for performing different operations like 
 * Finding the maximum of three numbers
 * finding the square of a number
 * finding the cube of a number 
 * @author Acer
 *
 */

public class Calculator {

	/**
	 * Basically this method is used for finding maximum between three integers 
	 * @param num1 is the 1st integer entered by user
	 * @param num2 is the 2nd integer parameter
	 * @param num3 is the 3rd integer parameter 
	 * @return return the finded maximum number enter by user between three integers
	 */
	public int findMax(int num1, int num2, int num3) {
		
		int[] arr = { num1, num2, num3 };
		int max = 0;
		for (int i = 1; i < arr.length; i++) {
		if (arr[i] > max)
		max = arr[i];
		}
		return max;
		}

	
	/**
	 * This method is used for finding the square of INTEGER number
	 * @param num is the number for which we want to find square
	 * @return return the square of number 
	 * @throws IllegalArgumentException throws exception of parameter sequence is not matched
	 */
	public int square(int num) throws IllegalArgumentException {
		int result = 0;
		if (num > 0 && num < 10) {
		result = num * num;
		} else
		throw new IllegalArgumentException();
		return result;
		}
	

	/**
	 * Actually, this method is used for finding the cube of INTEGER number
	 * @param num is the INTEGER number
	 * @return return the cube of number
	 */
	public int cube(int num) {
		return num*num*num;
	}
	
	
	
}
