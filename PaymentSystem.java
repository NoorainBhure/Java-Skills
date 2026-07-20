public class PaymentSystem {
    public static void main(String[] args) {

        int paymentMethod = 2;
        double balance = 5000.0;
        double amount = 1500.0;

        switch (paymentMethod) {

            case 1:
                System.out.println("Cash Payment");
                break;

            case 2:
               balance= balance - amount;
                System.out.println("Card Payment");
                System.out.println("Remaining Balance: " + balance);

            case 3:
                System.out.println("UPI Payment");
                break;

            default:
                System.out.println("Invalid Payment Method");
        }
    }
}