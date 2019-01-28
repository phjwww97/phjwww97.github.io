package Ch04진단문제;

import java.util.*;

public class Ch04Ex01_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if (a>b) 
			System.out.printf("%d",a-b);
		else 
			System.out.printf("%d",b-a);

	}

}
