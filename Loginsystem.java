
import java.util.Scanner;

public class Loginsystem {
    static int pass = 4545;
    static int t = 3;

    public static void main(String[] args) {
        again();
    }
    static void again() {
        if(t==0) {
            System.out.println("you use your all attempts");
        }
        
        
        while(t-->0) {
            Scanner sc = new Scanner(System.in);
            int pass1 = sc.nextInt();
            if(pass1==pass) {
                System.out.println("login successfull");
                return;
            }
            else {
                again();
            }
        }
    }
}