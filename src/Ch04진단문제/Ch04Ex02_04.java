package Ch04진단문제;

import java.util.*;

public class Ch04Ex02_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int b = 0;
		int c = 0;
		
		for(;;) {
			int a = scanner.nextInt();
			b+=a;
			c++;
			if(a>=100) {
				break;
			}
				
		}System.out.printf("%d\n%.1f",b ,(float)b/c);

	}

}
