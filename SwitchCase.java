
public class SwitchCase {
    public static void main(String[] args) {
        char ch = 'a';

        switch (ch) {
           case 'a' -> System.out.println("sunday");
            case 'b' -> System.out.println("monday");
            case 'c' -> System.out.println("tuesday");
            case 'd' -> System.out.println("wednesday");
            case 'e' -> System.out.println("thursday");
            case 'f' -> System.out.println("friday");
            case 'g' -> System.out.println("saturday");
            default -> System.out.println("invalid day");        
        }
    }
}