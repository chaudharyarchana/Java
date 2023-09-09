public class PalindromicPattern{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int s=5;s>i;s--){
				System.out.print(" ");
			}
			for(int k=i;k>1;k--){
				System.out.print(k);
			}
			for(int k=1;k<=i;k++){
				System.out.print(k);
			}
			System.out.println();
		}
	}
}