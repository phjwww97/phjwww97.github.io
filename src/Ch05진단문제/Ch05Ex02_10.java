package Ch05진단문제;

import java.util.*;

public class Ch05Ex02_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int b = scanner.nextInt();
		int d = 0;
		if(b<=20) {
			d = b;
		}
		int a[] = new int[d];
		int c = 0;
		
		for(int i=0;i<a.length;i++) {
			a[i] = scanner.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j] > a[i]) {
					c = a[j];
					a[j] = a[i];
					a[i] = c;
				}
			}	
		}
		for(int i=0;i<a.length;i++) {
			System.out.printf("%d\n",a[i]);
		}
	}
}

