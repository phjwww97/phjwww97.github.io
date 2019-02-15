package Ch05진단문제;

import java.util.*;

public class Ch05Ex02_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[5];
		
		for(int i=0;i<a.length;i++) {
			a[i] = scanner.nextInt();
		}
		System.out.printf("%d",a[0] + a[2] + a[4]);
	}

}
