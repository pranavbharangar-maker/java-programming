
public class maxOfThree {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 10;


        int max = Math.max(a, Math.max(b, c));
        System.out.println(max);
        // if(a>b && a>c) {
        //     System.out.println("a is greater");
        // }
        // else if(b>a && b>c) {
        //     System.out.println("b is greater");
        // }
        // else {
        //     System.out.println("c is greater");
        // }
    }
}