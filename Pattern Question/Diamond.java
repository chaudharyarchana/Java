public class Diamond{
	public static void main(String[] args){
		int n=4;
		for(int i=1;i<=4;i++){
			for(int s=i;s<4;s++){
				System.out.print(" ");
			}
			for(int j=1;j<2*i;j++){
               System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<n;i++){
			for(int s=1;s<=i;s++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*(n-i)-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}