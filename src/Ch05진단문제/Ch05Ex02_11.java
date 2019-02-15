package Ch05진단문제;

import java.util.*;

public class Ch05Ex02_11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[10];
		int one=0, two=0, three=0, four=0, five=0, six=0;
		
		for(int i=0;i<a.length;i++) {
			a[i] = scanner.nextInt();
			
			if(a[i]==1) {
				one++;
			}else if(a[i]==2){
				two++;
			}else if(a[i]==3) {
				three++;
			}else if(a[i]==4) {
				four++;
			}else if(a[i]==5) {
				five++;
			}else if(a[i]==6) {
				six++;
			}
		}
		System.out.printf("1 : %d\n2 : %d\n3 : %d\n4 : %d\n5 : %d\n6 : %d",one ,two ,three ,four ,five ,six);
	}

}
