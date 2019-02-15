package Ch05진단문제;

import java.util.*;

public class Ch05Ex01_09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[10];
		int b=0;
		
		for(int i=0;i<a.length;i++) {
			a[i] = scanner.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
			if(a[j] > a[i]) {
				b = a[j];
				a[j] = a[i];
				a[i] = b;	
			}
		}
		}for(int i=0;i<a.length;i++) {
			System.out.printf("%4d",a[i]);
		}
	}
}
