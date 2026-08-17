
public class SwitchCase {
    public static void main(String[] args) {
        char ch = 'a';

        switch (ch) {
           case 'a':
                System.out.println("sunday");
                break;
            case 'b':
                System.out.println("monday");
                break;
            case 'c':
                System.out.println("tuesday");
                break;
            case 'd':
                System.out.println("wednesday");
                break;    
            case 'e':
                System.out.println("thursday");
                break;    
            case 'f':
                System.out.println("friday");
                break;    
            case 'g':
                System.out.println("saturday");
                break;
            default:
                System.out.println("invalid day");
                break;        
        }
    }
}