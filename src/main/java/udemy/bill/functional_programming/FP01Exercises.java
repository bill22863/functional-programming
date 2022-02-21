package udemy.bill.functional_programming;

import java.util.List;

/**
 * Hello world!
 *
 */
public class FP01Exercises 
{
    public static void main( String[] args )
    {
    	List<Integer> numberList = List.of(12,9,13,4,6,2,4,12,15);
    	List<String> courseList = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
    	//exercise 1
//    	printOddNumbersInListFunctional(numberList);
    	
    	//exercise 2
//    	printAllCoursesInListFunctional(courseList);

    	//exercise 3
//    	printCoursesWithSubStringInListFunctional(courseList);
    	
    	//exercise 4
//    	printCoursesByLetterLengthInListFunctional(courseList);
    	
    	//exercise 5
//    	printCubeOfOddNumbersInListFunctional(numberList);
    			
    	//exercise 6 
    	printNumOfCourseCharacterInListFunctional(courseList);
    	
    }

    
 	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
			.filter(number -> number % 2 == 1)
			.forEach(System.out::println);
	}
 	
 	private static void printAllCoursesInListFunctional(List<String> courses) {
 		courses.stream()
 			.forEach(System.out::println);
 	}
 	
 	private static void printCoursesWithSubStringInListFunctional(List<String> courses) {
 		courses.stream()
 			.filter(s -> s.contains("Spring"))
 			.forEach(System.out::println);
 	}
 	
 	private static void printCoursesByLetterLengthInListFunctional(List<String> courses) {
 		courses.stream()
 		.filter(s -> s.length() > 3)
 		.forEach(System.out::println);
 	}
 	
 	private static void printCubeOfOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
			.filter(number -> number % 2 == 1) //Lambda Expression
			//mapping - x -> x * x
			.map(number -> number * number * number)
			.forEach(System.out::println);  //Method reference
	}
 	
 	private static void printNumOfCourseCharacterInListFunctional(List<String> courses) {
 		courses.stream()
 			.map(course -> course + " , " +  course.length())
 			.forEach(System.out::println);
 	}
 	
}
