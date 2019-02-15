package Ch05진단문제;

import java.util.*;

public class Ch05Ex01_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int b[] = new int[100];
		int a=0;
		
		for(int i=0;i<b.length;i++) {
			b[i] = scanner.nextInt();
			if(b[i]==0) {
				a--;
				break;
			}
		a++;
		}for(int i=a;i>=0;i--) {
			System.out.printf("%3d",b[i]);
		}
	}
			
}

	


