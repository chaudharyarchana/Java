import java.util.Scanner;
class PrimeNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int prime=0;
      
          for(int i=2;i<n;i++){
            if(n%i == 0){
                 prime++;
                 break;
            }
          }
          if(prime>0){
              System.out.println(" not Prime number");
          }
          else{
             System.out.println("Prime number");
          }
           
      
    }
}