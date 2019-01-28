package Ch04진단문제;

import java.util.*;

public class Ch04Ex02_09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int avg = 0;
		int b = 0;
		for(;;) {
			int a = scanner .nextInt();
						
			if(a<0 || a>100) {
				System.out.printf("sum : %d\navg : %.1f",sum ,(float)avg/b);
				break;
			}
			sum+=a;
			avg=sum;
			b++;

			
		}

	}

}
