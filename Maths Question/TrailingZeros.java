import java.util.Scanner;
//Trailing zeros are those which comes at the end of a number
class TrailingZeros{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int zeros=0;
       while(n>0){
        n=n/5;
        zeros=zeros+n;
       }
        System.out.println("Trailing Zeros of number is "+ "  "+zeros);
    }
}