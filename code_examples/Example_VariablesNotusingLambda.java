//Variable without using lambda expression 
import java.util.stream.*;

public class Example_VariablesNotusingLambda { 
public static void main(String[] args) { 
	IntStream.of(1, 2, 3, 5, 6, 7) 
			.filter(i -> i % 2 == 0) 
			.forEach(System.out::println); 
} 
} 
