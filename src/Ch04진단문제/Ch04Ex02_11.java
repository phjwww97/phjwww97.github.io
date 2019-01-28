package Ch04진단문제;

import java.util.*;

public class Ch04Ex02_11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char q;
		
		for(;;) {
			System.out.printf("Base = ");
			int a = scanner.nextInt();
			System.out.printf("Height = ");
			int b = scanner.nextInt();
			System.out.printf("Triangle area = %.1f\n",(float)a*b/2);
			System.out.printf("Continue? ");
			q = scanner.next().charAt(0);
		if (q=='Y'||q=='y') {
				
			}else {
				break;
			}
			
		}

	}

}
