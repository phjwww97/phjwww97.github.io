package phjwww97github.io;

import java.util.*;

public class Ch02Ex02_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		
		double yd = 91.44;
		double in = 2.54;
		
		System.out.printf("%4.1fyd = %5.1fcm\n",a ,yd*a);
		System.out.printf("%4.1fin = %5.1fcm\n",b ,in*b);

	}

}
