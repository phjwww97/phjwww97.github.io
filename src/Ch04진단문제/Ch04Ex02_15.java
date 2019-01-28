package Ch04진단문제;

import java.util.*;

public class Ch04Ex02_15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b;
		int c;
		
		for(b=1;b<=a;b++) {
				for(c=1;c<=b;c++) {
					System.out.printf("*");
			}
				System.out.printf("\n");
		}
		for(b=1;b<=a;b++) {
			for(c=b;c<=a-1;c++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}
