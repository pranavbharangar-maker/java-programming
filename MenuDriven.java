import java.io.*;
public class MenuDriven {
    public static void main(String[] args) throws IOException{
        int n,n1;
        String opr;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first num : ");
        n = Integer.parseInt(br.readLine());
        System.out.print("Enter second num : ");
        n1 = Integer.parseInt(br.readLine());
        System.out.print("select operator \n 1: addition\n 2: subtraction\n 3: multiple\n 4: divide\n   Enter operator : ");
        opr = br.readLine();
        switch(opr){
            case("+"):
                int ans = n + n1;x
                System.out.print("addition : "+ans);
                break;
            case("-"):
                System.out.print("subtraction : "+(n1-n));
                break;
            case("*"):
                System.out.print("multiple : "+n1*n);
                break;
            case("/"):
                System.out.print("division : "+n1/n);
                break;
            default:
                System.out.print("invalid operator !!!!!!!");
        }
    }
}