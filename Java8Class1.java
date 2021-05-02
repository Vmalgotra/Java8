package vipul;
import java.util.List;
public class test {
	
	public static void main(String args[]) {
	
//	List <Integer> num = List.of(1,21,3,22,12,2,3,4,5,5);
//	printall(num);
//	even(num);
	
		
//	List <String> num = List.of("Aws","Docker","Microservice","Azure");
//	printcourses(num);
//	printcourseslengthgreaterthan4(num);
	
//	List <Integer> num = List.of(1,21,3,22,12,2,3,4,5,5);	
//	printsquareOfeven(num);
//	List <String> course = List.of("Aws","Docker","Microservice","Azure");	
//	characterineachcourse(course);
		
	List <Integer> num = List.of(1,21,3,22,12,2,3,4,5,5);
	System.out.print(sumList(num));
	System.out.print(sumList1(num));
	
}
	
	private static void printall (List<Integer> a) {
		
		a.stream().forEach(System.out::println);
	}
	
	
  private static void even (List<Integer> a) {
		
		a.stream() // converts to a stream
 		.filter(x -> x%2==0) // lambda expression to find even. Lambda expresssion defines what needs to be don eon each element
	//	.filter(test::isEven)
		.forEach(System.out::println);
	}
	
  private static boolean isEven(int a) {
	  return a%2==0;
  }
  private static void printcourses (List<String> a) {
		
		a.stream() // converts to a stream
		//.filter(x -> x%2==0) // lambda expression to find even. Lambda expresssion defines what needs to be don eon each element
	//	.filter(test::isEven)
		.forEach(System.out::println);
	}
  private static void printcourseslengthgreaterthan4 (List<String> a) {
		
		a.stream() // converts to a stream
		.filter(x -> x.length()>4) // lambda expression to find even. Lambda expresssion defines what needs to be don eon each element
		.forEach(System.out::println);
	}
  private static void printsquareOfeven (List<Integer> a) {
		
		a.stream() // converts to a stream
		.filter(x -> x%2==0)
		.map(x-> x*x)// lambda expression to find even. Lambda expresssion defines what needs to be don eon each element
		.forEach(System.out::println);
	}
  private static void characterineachcourse (List<String> a) {
		
		a.stream() // converts to a stream
		.map(x-> x.length())// lambda expression to find even. Lambda expresssion defines what needs to be don eon each element
		.forEach(System.out::println);
	}
  private static int sumList (List<Integer> a) {
	  return a.stream()
	  .reduce(0, test:: sum); // it does a reduction on the elements of the stream. First value is identity value/ startitng value and second arg
	  // is acculmulating function (sum in this case)
	  }
  private static int sumList1 (List<Integer> a) {
	  return a.stream()
	  .reduce(0, (x,y) -> x+y); // it does a reduction on the elements of the stream. First value is identity value/ startitng value and second arg
	  // is acculmulating function (sum in this case)
	  }
  private static int sum (int a, int b) {
	  return a+b;
  }
	
}
