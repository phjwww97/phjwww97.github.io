package Ch05진단문제;

import java.util.*;

public class Ch05Ex01_13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a[][] = {
				{5, 8, 10, 6, 4},
				{11, 20, 1, 13, 2},
				{7, 9, 14, 22, 3}
				};
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					System.out.printf("%2d   ",a[i][j]);
				}
				System.out.printf("\n");
			}
		
		}

	}


