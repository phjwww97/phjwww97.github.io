package Ch05진단문제;

import java.util.*;

public class Ch05Ex02_06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char a[] = {'A', 'P', 'P', 'L', 'E', '!'};
		char b = scanner.next().charAt(0);
		
		if(b=='A') {
			System.out.println(" 0 ");
		}else if(b=='P') {
			System.out.println(" 1,2 ");
		}else if(b=='L') {
			System.out.println(" 3 ");
		}else if(b=='E') {
			System.out.println(" 4 ");
		}else if(b=='!') {
			System.out.println(" 5 ");
		}else {
			System.out.println(" none ");
		}

	}

}
