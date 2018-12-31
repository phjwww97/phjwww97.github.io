package phjwww97github.io;

import java.util.*;

public class Ch02Ex02_14 {

	public static void main(String[] args) {
		double yd = 91.44;
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("yard? ");
		double a = scanner.nextDouble();
		
		System.out.printf("%.1fyard = %.1fcm",a ,a*yd);
	}

}
