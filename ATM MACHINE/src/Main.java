import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        AtmInterf op = new Atmimplements();

        int a = 12345;
        int b = 123;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ATM number : ");
        int atm_no = sc.nextInt();
        System.out.println("Enter the ATM pin");
        int atm_pin = sc.nextInt();
        if (atm_pin == b && atm_no == a) {
            do {
                System.out.println("---------------------------------------");
                System.out.println("Welcome to dherai-Do ATM Center");
                System.out.println("---------------------------------------");
                System.out.println("1.check Available Balance \n" +
                        "2.withdraw Amount\n" +
                        "3.Deposite Amount \n" +
                        "4.view Mini Statement \n" +
                        "5.Exit\n");
                System.out.println("Enter Your Choice :");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        op.viewBalance();

                        break;

                    case 2:
                        System.out.println("Enter the balance you want to withdraw : ");
                        double withdraw = sc.nextDouble();
                        op.withdrawAmount(withdraw);
                        break;

                    case 3:
                        System.out.println("Enter the amount you want to deposite ");
                        double depAmount = sc.nextDouble();
                        op.depositeAmount(depAmount);
                        break;
                    case 4:
                        op.viewminiStatement();
                        break;
                    case 5:
                        System.out.println("Thanks for cheaking out !!!");
                        System.exit(0);

                }

            }

            while (true);
        }
        else{
            System.out.println("Enter a Correct Pin please !!!!");
        }
    }
}