package Ch04진단문제;

import java.util.*;

public class Ch04Ex02_14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int i;
		int j;
		
		int c;
		int d;
		
		for(i=a;i>=b;i--) {
			for(j=1;j<=9;j++) {
				for(i=a;i>=b;i--) {
							System.out.printf("%3d * %d = %3d   ",i ,j ,i*j);	
				}
				System.out.printf("\n");
			}
			
		}

	}

}
