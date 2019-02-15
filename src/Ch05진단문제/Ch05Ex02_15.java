package Ch05진단문제;

import java.util.*;

public class Ch05Ex02_15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a[][] = new int[4][3];
		int b=0, c=0, d=0, e=0;
		
		for(int i=0;i<a.length;i++) {
			System.out.printf("%dclass? ",i+1);
			for(int j=0;j<a[i].length;j++) {
				a[i][j] = scanner.nextInt();
			}
		}
			for(int j=0;j<3;j++) {
				b += a[0][j];
				c += a[1][j];
				d += a[2][j];
				e += a[3][j];
			}
		System.out.printf("1class : %d\n"
				+ "2class : %d\n"
				+ "3class : %d\n"
				+ "4class : %d\n",b ,c, d, e);
	}

}
