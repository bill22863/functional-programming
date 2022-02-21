package udemy.bill.functional_programming;

import java.util.List;

/**
 * Hello world!
 *
 */
public class FP01Functional 
{
    public static void main( String[] args )
    {
    	List<Integer> numberList = List.of(12,9,13,4,6,2,4,12,15);
//    	printAllNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
//    	printEvenNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
    	printSquareOfEvenNumbersInListFunctional(numberList);
    }

    private static boolean isEven(int num) {
    	return num % 2 == 0;
    }
    
	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().forEach(System.out::println); //Method reference
	}
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
			.filter(number -> number % 2 == 0) //Lambda Expression
			.forEach(System.out::println);  //Method reference
	}
	
	private static void printSquareOfEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
			.filter(number -> number % 2 == 0) //Lambda Expression
			//mapping - x -> x * x
			.map(number -> number * number)
			.forEach(System.out::println);  //Method reference
	}
}
