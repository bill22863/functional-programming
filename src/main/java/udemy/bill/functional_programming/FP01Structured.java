package udemy.bill.functional_programming;

import java.util.List;

/**
 * Hello world!
 *
 */
public class FP01Structured 
{
    public static void main( String[] args )
    {
//    	printAllNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
    	printEvenNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
    }

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		for(Integer number : numbers) {
			System.out.println(number);
		}
	}
	
 	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		for(Integer number : numbers) {
			if(number % 2 == 0) {
				System.out.println(number);
			}
		}
	}
}
