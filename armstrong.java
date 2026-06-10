import java.util.Scanner;

// Armstrong Number
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[] = new int[n];
        
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            
            int num = arr[i];
            int sum = 0;
            int temp = num;

            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + (digit * digit * digit);
                temp = temp / 10;
            }


            if (num == sum) {
                System.out.println(num + " is an Armstrong number");
            } else {
                System.out.println(num + " is not an Armstrong number");
            }
        }
    }
}
