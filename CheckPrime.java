import java.util.Scanner;

//check prime number in array
public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=1; i<4; i++){
            arr[i]=sc.nextInt();

        }

        for (int i =0; i<arr.length; i++){
            if(isPrime(arr[i])){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }
        }
    }

   
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    
}
