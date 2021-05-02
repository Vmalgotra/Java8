package programming;

import java.util.List;
import java.util.function.Supplier;

public class FP03MethodReferences {
	
	private static void print(String str) {
		System.out.println(str);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", 
					"AWS", "PCF", "Azure", "Docker",
					"Kubernetes");
		
    // Method refernce can be used for both static and instance methoids
    
		courses.stream()
		 //.map(str -> str.toUpperCase())
		 .map(String::toUpperCase) // toUpperCase is an instance method in string class
		 .forEach(FP03MethodReferences::print); //print is static methos
		
    
  //  Method refernece can be used for constructors. This is called constructor reference
    
    Supplier<String> supplier = () -> new String();
    
		Supplier<String> supplier = String::new;

	}
}
