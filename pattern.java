public class pattern {

	public static void main(String[] args) {          
n=5:                                 
		int star=n+1;                                        
		int space=1;
		for(int i=1; i<=n;i++) {
			//System.out.print(space+" "+star);
			for (int j=1;j<=star/2;j++) {
				
				System.out.print("* ");
			}
			for(int k=1;k<=space;k++) {
				System.out.print("  ");
			}
			for(int l=star/2+1;l<=star;l++) {
				System.out.print("* ");
			}
			if(i<=n/2) {
				star-=2;
				space+=2;
			}else {
				star+=2;
				space-=2;
			}
			System.out.println();
		}
	}
}
