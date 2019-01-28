package Ch04진단문제;

import java.util.*;

public class Ch04Ex02_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = 0;
		
		if(a<100) {
			while(a>=1) {			
			b+=a;
			--a;
		}
		System.out.printf("%d",b);
		}
		
	}

}
