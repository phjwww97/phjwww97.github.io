package Ch05진단문제;

import java.util.*;

public class Ch05Ex02_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[100];
		
		for(int i=0;i<a.length;i++) {
			a[i] = scanner.nextInt();
			if(a[i]==-1) {
				System.out.printf("%d %d %d",a[i-3] ,a[i-2] ,a[i-1]);
				break;
			}
		}

	}

}
