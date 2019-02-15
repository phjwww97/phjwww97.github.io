package Ch05진단문제;

import java.util.*;

public class Ch05Ex01_12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[100];
		int b = scanner.nextInt();
		a[0] = 100;
		a[1] = b;
		int c = a[0];
		int qq = 2;
		for(int i=2;i<a.length;i++) {
			qq++;
			a[i] = c - b; 
			c = b;
			b = a[i];
			if(a[i] < 0) {
				for(int j=0;j<qq;j++) {
					System.out.printf("%3d",a[j]);
				}
				break;
			}
		}
	}
}
