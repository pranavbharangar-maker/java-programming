public class Factorial {
    public static void main(String[] args) {
        int n = 0;

        if(n==0) {
            System.out.println("1");
            return;
        }
        if(n<0) {
            System.out.println("undefined");
        }

        int fact = 1;

        for(int i=1;i<=n;i++) {
            fact = fact * i;
        }

        System.err.println("the factorial is : "+fact);
    }
}