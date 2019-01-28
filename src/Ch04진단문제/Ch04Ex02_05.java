package Ch04진단문제;

import java.util.*;

public class Ch04Ex02_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for(;;) {
			int a = scanner.nextInt();
			if(a%3==0) { 
				System.out.printf("%d\n",a/3);
			} else if (a==-1){
				break;
			}
		}
	}
}



