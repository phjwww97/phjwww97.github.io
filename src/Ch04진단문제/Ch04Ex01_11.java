package Ch04진단문제;

import java.util.*;

public class Ch04Ex01_11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		if(a>0) {
			System.out.println("plus");
		}else if (a<0) {
			System.out.println("minus");
		}else if(a==0) {
			System.out.println("zero");
		}

	}

}
