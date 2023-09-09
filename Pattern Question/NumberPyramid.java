public class NumberPyramid{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int s=5;s>i;s--){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				if(j%2==0)
					System.out.print(" ");
				else
					System.out.print(i);
			}
			System.out.println();
		}
	}
}