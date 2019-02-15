package Ch05진단문제;

import java.util.*;

public class Ch05Ex02_08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[100];
		int c=0, sum=0;
		double avg=0;
		
		for(int i=0;i<a.length;i++) {
			a[i] = scanner.nextInt();
			if(a[i]==0) {
				System.out.printf("Multiples of 5 : %d\nsum : %d\navg : %.1f",c ,sum ,avg/c);
				break;
			}if(a[i]%5==0) {
				c++;
				sum += a[i];
				avg += a[i];
		}
		}

	}

}
