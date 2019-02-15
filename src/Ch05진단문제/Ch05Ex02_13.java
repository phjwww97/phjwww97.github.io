package Ch05진단문제;

import java.util.*;

public class Ch05Ex02_13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[10];
		
		int b=0, c=0;
		a[0] = scanner.nextInt();
		a[1] = scanner.nextInt();
		
		b = a[0];
		c = a[1];
		
		for(int i=2;i<a.length;i++) {
			a[i] = b + c;
			b = c;
			c = a[i];
		}for(int i=0;i<a.length;i++) {
			if(a[i]>=10) {
				System.out.printf("%3d",a[i]%10);
			}else {
				System.out.printf("%3d",a[i]);
			}
			
		}

	}

}
