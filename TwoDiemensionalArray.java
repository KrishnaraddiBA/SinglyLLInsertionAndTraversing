import java.util.Scanner;

public class TwoDiemensionalArray {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int m=scan.nextInt();
		System.out.println("Enter the number of columns");
		int n=scan.nextInt();
		int[][]a=new int[m][n];
		
		for (int i = 0; i <m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Enter the value for "+i+" row and "+j+" column");		
				a[i][j]=scan.nextInt();
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j]+" ");
			}
			
		}
	}

}
