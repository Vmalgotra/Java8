package vipul;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterface1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		List <Integer> num = List.of(1,21,3,22,12,2,3,4,5,5);
		//Function Interface -- They have only one abstract method and that method is called function descriptor. For every operation we write on stream, there is a functional interface
		//Using lambda expression we pass a logic to a functional interface
		
	// Actual Implementation	
		num.stream()
		.filter(x -> x%2==0)
		.map(x -> x*x)
		.forEach(System.out::println);
		
	// Internal Implementation	
		Predicate<Integer> evenpredicate = x -> x%2==0; // These are functional interface (have anly one abstract method)
		Function< Integer,  Integer> squarefunction = x -> x*x;
		Consumer<Integer> Sysoutconsummer = System.out::println;
		num.stream()
		.filter(evenpredicate)
		.map(squarefunction)
		.forEach(Sysoutconsummer);
		
	//Actual Internal Implementation
		//Predicate --> takes an input and retuens boolean
		Predicate<Integer> evenpredicate1 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer x) {
				// TODO Auto-generated method stub
				return x%2==0;
			}
		};
		//Function takes 2 input and returns one output
		Function< Integer,  Integer> squarefunction1 = new Function< Integer,  Integer>() {
			@Override
			public Integer apply(Integer x) {
				// TODO Auto-generated method stub
				return  x*x;
			}
		};
		//Consumer takes an input and returns no result/void
		Consumer<Integer> Sysoutconsummer1 = new Consumer<Integer> () {
			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		};
		num.stream()
		.filter(evenpredicate1)
		.map(squarefunction1)
		.forEach(Sysoutconsummer1);
//Actual internal Implementation of x -> x%2==0		
//		boolean isEven(int x) {
//			return x%2==0;
//		}
//Actual internal Implementation of (x -> x*x
//		int square(int x) {
//			return x*x;
//		}
//		
	}
}
