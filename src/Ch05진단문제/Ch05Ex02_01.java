package Ch05진단문제;

import java.util.*;

public class Ch05Ex02_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char a[] = new char[10];
		String b = scanner.nextLine();
		
		for(int i=0;i<a.length;i++) {
			a[i] = b.charAt(i);
		}
		for(int j=9;j>=0;j--) {
			System.out.printf("%c",a[j]);
		}
	}

}
