package Ch05진단문제;

import java.util.*;

public class Ch05Ex01_15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a[][] = new int[5][4];
		int b=0, c=0, d=0, e=0, f=0, q=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j] = scanner.nextInt();		
			}
		}
		for(int j=0;j<4;j++) {
			b += a[0][j];
			c += a[1][j];
			d += a[2][j];
			e += a[3][j];
			f += a[4][j];
		}
		if(b/4>=80) {
			q++;
			System.out.printf("pass\n");
		}else {
			System.out.printf("fail\n");
		}if(c/4>=80) {
			q++;
			System.out.printf("pass\n");
		}else {
			System.out.printf("fail\n");
		}if(d/4>=80) {
			q++;
			System.out.printf("pass\n");
		}else {
			System.out.printf("fail\n");
		}if(e/4>=80) {
			q++;
			System.out.printf("pass\n");
		}else {
			System.out.printf("fail\n");
		}
		if(f/4>=80) {
			q++;
			System.out.printf("pass\n");
		}else {
			System.out.printf("fail\n");
		}
		System.out.printf("Successful : %d",q);

	}

}

