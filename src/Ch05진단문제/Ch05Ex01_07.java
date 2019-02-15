package Ch05진단문제;

import java.util.*;

public class Ch05Ex01_07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[10];
		int b=0;
		int c=10_000;
		int d=0;
		
		for(int i=0;i<a.length;i++) {
			a[i]=scanner.nextInt();
			if(!(a[i]<=1000 && a[i]>=1)) {
				a[i]=100;
			}
		}
			for(int i=0;i<a.length;i++) {
				if(a[i]<100) {
					if(a[i]>b) {
						b=a[i];
					}
				}else if(a[i]>100) {
					if(a[i]<c) {
						c=a[i];
					}
				}
			}System.out.printf("%d %d",b ,c);
		}
	}


