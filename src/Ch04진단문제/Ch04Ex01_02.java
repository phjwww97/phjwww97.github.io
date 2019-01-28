package Ch04진단문제;

import java.util.*;

public class Ch04Ex01_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int c = b+100-a;
		
		System.out.printf("%d\n",c);
		
		if (c>0) {
			System.out.println("Obesity");
		}

	}

}
