//package HomeWork;
//
//import java.util.Scanner;
//
//public class Bank {
//
//
//
//    public class Bank{
//        double bal=paise;
//
//
//        void deposit(double amt){
//            bal=bal+amt;
//            System.out.println("DEPOSIT AMOUNT: "+amt);
//            System.out.println("TOTAL BALANCE: "+bal);
//        }
//
//        void withdraw(double amt){
//            if(amt<=bal){
//                bal=bal-amt;
//                System.out.println("WITHDRAW: "+ amt);
//                System.out.println("TOTAL BALANCE: "+bal);
//            }
//            else{
//                System.out.println("INSUFFICIENT BALANCE.......");
//                System.out.println("You have become Garib....");
//            }
//        }
//    }
//
//    public class Main {
//        public static void main(String[] args) {
//
//            Scanner sc = new Scanner(System.in);
//
//            System.out.print("Enter initial balance: ");
//            double paise = sc.nextDouble();
//
//            Bank b = new Bank(paise);
//
//            b.deposit(500);
//            b.withdraw(200);
//            b.withdraw(2000);
//        }
//
//
//}
