package programming;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FP05Files {

	public static void main(String[] args) throws IOException {
		
		// Files.lines(Paths.get("file.txt")). // returns a stream of file and reads line by line
		// .map(str -> str.split(" "))
		// .flatMap(Arrays::stream)
		// .distinct()
		// .sorted()
		// .forEach(System.out::println);
		
		// returns unique words from file
		
		Files.list(Paths.get(".")). // returns a stream of list of files in root 
			.filter(Files::isDirectory) // filters directories and removes files
			.forEach(System.out::println);

	}

}
