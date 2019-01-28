package Ch04진단문제;

import java.util.*;

public class Ch04Ex02_08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int odd = 0;
		int even = 0;
		
		for(;;) {
			int a = scanner.nextInt();
			if(a%2==0) {
				even++;
			}else {
				odd++;
			}
			if (a==0) {
				System.out.printf("odd : %d\neven : %d",odd ,--even);
				break;
			}
		}

	}

}
