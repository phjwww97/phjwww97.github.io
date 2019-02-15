package Ch05진단문제;

import java.util.*;

public class Ch05Ex02_16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a[][] = new int[2][3];
		int b[][] = new int[2][3];
		int c[][] = new int[2][3];
		
		System.out.printf("first array\n");
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		System.out.printf("second array\n");
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				b[i][j] = scanner.nextInt();
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				c[i][j] = a[i][j] * b[i][j];
				System.out.printf("%3d",c[i][j]);
			}
			System.out.printf("\n");
		}
	}

}
