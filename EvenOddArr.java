import java.util.Scanner;

public class EvenOddArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0; i<4; i++){
            arr[i]=sc.nextInt();

        }

        for (int i =0; i<arr.length; i++){
            if(arr[i]%2==0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
            System.out.println(arr[i]);
        }


    }
}
