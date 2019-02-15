package Ch05진단문제;

import java.util.*;

public class Ch05Ex02_18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char a[][] = new char[3][5];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j] = scanner.next().charAt(0);
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j] >= 'A' && a[i][j] <= 'Z') {
					a[i][j] = (char)(a[i][j]+('a'-'A'));
				}
				System.out.printf("%2c",a[i][j]);
			}
			System.out.printf("\n");
		}
	}
}
