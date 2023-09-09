import java.util.Scanner;
class PalindromNumber{
   public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enetr a Number");
    int n=sc.nextInt();
    // reverse the number and then compare 
    int temp=n;
    int reversenum=0;
    while(n!=0){
        reversenum=(reversenum*10) + (n%10);
        n=n/10;
    }
     if(temp==reversenum){
        System.out.println("Palindrom");
     }
     else{
        System.out.println("Not Palindrom");
     }
   
   }
}