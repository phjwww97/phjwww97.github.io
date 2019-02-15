package Ch05진단문제;

import java.util.*;

public class Ch05Ex02_14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a[][] = { 
				{3, 5, 9},
				{2, 11, 5},
				{8, 30, 10},
				{22, 5, 1}
		};
		int b=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				b += a[i][j];
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}	System.out.printf("%3d",b);

	}

}
