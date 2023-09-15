import java.util.*;
class Matrix{
    public static void main(String[] args){
        int[][] matrix=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter elements in matix 3*3");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
               for(int[] a : matrix){
                System.out.print(Arrays.toString(a));
               }
    }
}