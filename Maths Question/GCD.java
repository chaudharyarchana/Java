import java.util.Scanner;
class GCD{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numbers a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd=1;

        if(a>b){
          for(int i=2;i<=b;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
          }
        }
        else if(a<b){
            for(int i=2;i<=a;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
          }
        }
        else{
            gcd=a;
        }
       
        System.out.println("GCD of numbers is "+ gcd);
    }
}