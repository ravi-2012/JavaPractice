package practice.java;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pascalTriangle(10);
	}
	
	public static void pascalTriangle(int row) {
		int coef=1;
		for(int i=0;i<row;i++) {
			for(int s=1;s<row-i;s++) {
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++) {
				if(j==0||i==0)
					coef=1;
				else
					coef=coef*(i-j+1)/j;
				System.out.printf("%4d",coef);
			}
			System.out.println();
		}
	}

}
