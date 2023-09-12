//using XOR bitwise approach to solve this problem in this problem an array is given with n values in which every value has its pair find the single element [2,2,1] o/p=1

class SingleNumber{
    public static void main(String[] args){
        int[] arr={2,2,3,1,3};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=ans^arr[i];
        }
        System.out.println(ans);
    }
}