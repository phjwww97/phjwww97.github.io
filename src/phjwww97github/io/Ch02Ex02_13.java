package phjwww97github.io;

import java.util.*;

public class Ch02Ex02_13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int sum=0, avg=0;
		
		sum = a+b+c;
		avg = (a+b+c)/3;
		
		System.out.printf("sum = %d\navg = %d",sum , avg );

	}

}
