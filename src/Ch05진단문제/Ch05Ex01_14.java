package Ch05진단문제;

import java.util.*;

public class Ch05Ex01_14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a[][] = new int[2][4];
		int b[][] = new int[2][4];
		
		System.out.println("fisrt array");
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		System.out.println("second array");

		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				b[i][j] = scanner.nextInt();
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.printf("%4d",a[i][j] * b[i][j]);
			}
			System.out.printf("\n");
		}
	}

}
