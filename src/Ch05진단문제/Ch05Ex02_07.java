package Ch05진단문제;

import java.util.*;

public class Ch05Ex02_07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[100];
		int max=0, min=0;
		
		for(int i=0;i<a.length;i++) {
			a[i] = scanner.nextInt();
			if(a[i]==999) {
				System.out.printf("max : %d\nmin : %d",max ,min);
				break;
			}else if(a[i]<min) {
				min = a[i];
			}else if(a[i]>max) {
				max = a[i];
			}
		}

	}

}
