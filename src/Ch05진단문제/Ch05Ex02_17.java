package Ch05진단문제;

import java.util.*;

public class Ch05Ex02_17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a[][] = new int[4][2];
		int b=0, c=0, d=0, e=0, f=0, g=0, h=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j] = scanner.nextInt();
				
				h += a[i][j];
			}
		}for(int i=0;i<=3;i++) {
			f += a[i][0];
			g += a[i][1];
		}
		for(int i=0;i<2;i++) {
			b += a[0][i];
			c += a[1][i];
			d += a[2][i];
			e += a[3][i];
		}
		System.out.printf("%d %d %d %d\n%d %d\n%d",b/2 ,c/2 ,d/2 ,e/2 ,f/4 ,g/4, h/8);
	}

}
