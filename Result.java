import java.util.*;

public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        System.out.println("total marks : "+total);
        int average = total / 3;
        System.out.println("average : "+average);


        if(average>=90) {
            System.err.println("grade a");
        }
        else if(average<90 && average>=80) {
            System.out.println("grade b");
        }
        else if(average<80 && average>=70) {
            System.out.println("grade c");
        }
        else if(average<70 && average>=60) {
            System.out.println("grade d");
        }
        else {
            System.out.println("grade e");
        }

    }
}