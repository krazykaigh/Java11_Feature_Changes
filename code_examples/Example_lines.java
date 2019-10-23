import java.util.stream.Collectors;

public class Example_lines {
    public static void main(String[] args) throws Exception {
        
        String str = "JD\nJD\nJD"; 
        System.out.println(str);
        System.out.println(str.lines().collect(Collectors.toList()));
    }
}