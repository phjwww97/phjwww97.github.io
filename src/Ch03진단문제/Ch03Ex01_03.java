package Ch03진단문제;

import java.util.*;

public class Ch03Ex01_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.printf("%d %d %d",++a ,--b ,--a*b);

	}

}
