package Ch05진단문제;

import java.util.*;

public class Ch05Ex02_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[10];
		int odd=0, even=0;
		
		for(int i=0;i<a.length;i++) {
			a[i] = scanner.nextInt();
			if(i%2==0) {
				odd += a[i];
			}else {
				even += a[i];
			}
		}
		System.out.printf("odd : %d\neven : %d",odd ,even);
	}

}
