package vipul;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class FP04Behavioural {
	
	
	public static void main(String[] args) {
		
		
    	 List <Integer> number = List.of(1,21,3,22,12,2,3,4,5,5);
		
   	 number.stream().filter( x -> x%2==0).forEach(System.out::println);
    
	 number.stream().filter( x -> x%2!=0).forEach(System.out::println);
		
	//Steps to use behaviour paramterization in eclipse
		
	//select the lambda function and click refactor --> extract variable
        //then select the complete line of code 'number.strema().....foreach() and then right click extract method.
        // now select the functional interface name and refactor --> inline
        //through behaviour parameterization	
		
        // So apart from behaviour i.e. the logic, everything is duplicate. So we can use behaviour parameterization to avoid
        // duplicate code. here the logic/behaviour of the method as an arguement to the method
   
	filterAndPrint(number, x -> x%2==0);
     	filterAndPrint(number, x -> x%2!=0);
		
		
	// without behaviour parameterization
        number.stream().map( x -> x*x).collect(Collectors.toList());
        number.stream().map( x -> x*x*x).collect(Collectors.toList());

        multiandprint(number, x -> x*x*x);
        multiandprint(number, x -> x*x);	
		
	}
	
	private static void filterAndPrint(List<Integer> number, Predicate<Integer> evenpredicate) {
		number.stream()
		 .filter(evenpredicate)
		 .forEach(System.out::println);
	}
	

	}
	
        private static List<Integer> multiandprint(List<Integer> number, Function<Integer, Integer> mapper) {
		return number.stream()
		 .map( mapper)
		 .collect(Collectors.toList());
	}
	
	
	
	
}
///behaviur parameterization -- passing behaviour as a arguement of function
