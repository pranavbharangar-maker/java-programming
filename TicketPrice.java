public class TicketPrice {
    public static void main(String[] args) {
        int age = 10;
        int discount = 2;
        int price = 1;
        if(age<12) {
            System.out.println(price*5);
        }
        else if(age>=12 && age<65) {
            System.out.println(price*7);
        }
        else {
            System.out.println(price*5);
        }

        boolean membership = true;

        if(membership==true) {
            System.out.println(price-discount);
        }
        else {
            System.out.println(price);
        }
    }
}