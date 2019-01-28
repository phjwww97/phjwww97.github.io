package Ch04진단문제;

import java.util.*;

public class Ch04Ex02_13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c;
		int d;
		int e;
		
		for(c=1;c<=b;c++) {
			System.out.printf("%3d",c);
		}
		System.out.printf("\n");
		for(d=2;d<=8;d+=2) {
			System.out.printf("%3d",d);
		}
		System.out.printf("\n");
		for(e=a;e<=12;e+=a) {
			System.out.printf("%3d",e);
		}
		System.out.printf("\n");
		
	}

}
