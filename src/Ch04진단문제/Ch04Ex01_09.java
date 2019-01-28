package Ch04진단문제;

import java.util.*;

public class Ch04Ex01_09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int d = (a<b) ? a : b;
		d = (d<c) ? d : c;
		
		System.out.printf("%d",d);

	}

}
