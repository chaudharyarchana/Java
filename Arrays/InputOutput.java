import java.util.Scanner;
import java.util.Arrays;
class InputOutput{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] array=new int[5];
    System.out.println("Enter array values");
    for(int i=0;i<array.length;i++){
        array[i]=sc.nextInt();
    }
    
        System.out.println(Arrays.toString(array));
    
}
}