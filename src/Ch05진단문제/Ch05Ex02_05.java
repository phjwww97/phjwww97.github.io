package Ch05진단문제;

import java.util.*;

public class Ch05Ex02_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a[] = new double[6];
		double b=0;
		
		for(int i=0;i<a.length;i++) {
			a[i] = scanner.nextDouble();
			b += a[i];
		}
		System.out.printf("%.1f",b/6);
	}

}
