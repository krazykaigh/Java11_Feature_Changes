//  https://www.journaldev.com/24601/java-11-features

import java.util.*;

public class Example_isBlank {
    public static void main(String[] args)  {
        int a = 0;
        
        System.out.println(" ".isBlank()); //true
        
        String s = "Anupam";
        System.out.println(s.isBlank()); //false
        String s1 = "";
        System.out.println(s1.isBlank()); //true
    }
}