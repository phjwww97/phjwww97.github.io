package Ch04진단문제;

import java.util.*;

public class Ch04Ex02_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int b = 0;
		
		for(;;) {
			int a = scanner.nextInt();
			if(a%3==0) {
				b--;
			}else if (a%5==0) {
				b--;
			}
			b++;
			if (a==0) {
				System.out.printf("%d",b);
				break;
			}
		}

	}

}
