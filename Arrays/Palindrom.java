//Using two pointer approch
class Palindrom{
    public static void main(String[] args){
        char[] array={'w','o','w'};
        int i=0;
        int j=array.length-1;
        int palindrom=0;
        while(i<=j){
            if(array[i]!=array[j]){
                palindrom++;
                
                break;
            }
            i++;
            j--;
        }
        if(palindrom>0){System.out.println("Not palindrom") ;}
        else System.out.println("palindrom");
       
        
    }
}