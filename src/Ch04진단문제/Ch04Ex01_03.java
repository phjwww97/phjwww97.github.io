package Ch04진단문제;

import java.util.*;

public class Ch04Ex01_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		if (a>20) {
			System.out.println("adult");
		}
		else {
			System.out.printf("%d years later",-(a-20));
		}
		
	}

}
