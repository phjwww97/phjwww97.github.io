package Ch03진단문제;

import java.util.*;

public class Ch03Ex01_07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		System.out.printf("%b ",a>b || a>c);
		System.out.printf("%b ",a==b || a==c);

	}

}
