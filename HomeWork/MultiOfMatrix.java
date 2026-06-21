package HomeWork;

public class MultiOfMatrix {
    public static void main(String[] args) {
        int[][] arr1={{1,2},{3,4}};
        int[][] arr2={{5,6},{7,8}};

        int[][] arr=new int[2][2];

        //Addition of matrix

        for (int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                for(int k=0;k<2;k++){
                arr[i][j]+=arr1[i][k] * arr2[k][j];
            }}}


        for(int i=0;i<2;i++) {

            for (int j = 0; j < 2; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

    }
}
