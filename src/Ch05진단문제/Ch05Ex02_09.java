package Ch05진단문제;

import java.util.*;

public class Ch05Ex02_09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[100];
		
		for(int i=0;i<a.length;i++) {
			a[i] = scanner.nextInt();
			if(a[i]==0) {
				break;
			}else if(a[i]%2==0) {
				System.out.printf("%3d",a[i]/2);
			}else {
				System.out.printf("%3d",a[i]*2);
			}
		}
	}
}


