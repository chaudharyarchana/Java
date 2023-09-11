import java.util.*;
class LinearSearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter key to search"); 
        int key=sc.nextInt();
        for(int i=0;i<n;i++){
            if(nums[i]==key){
                System.out.println("element found");
                break;
            }
        }

    }
}