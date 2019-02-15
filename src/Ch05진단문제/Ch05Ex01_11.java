package Ch05진단문제;

import java.util.*;

public class Ch05Ex01_11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[100];
		int one=0, two=0, three=0, four=0, five=0, six=0, seven=0, eight=0, nine=0, zero=0;
		
		for(int i=0;i<a.length;i++) {
			a[i] = scanner.nextInt();
			if(a[i]==0) {
				if(zero>0) {
					System.out.printf("0 : %d\n",zero);
				}if(one>0) {
					System.out.printf("1 : %d\n",one);
				}if(two>0) {
					System.out.printf("2 : %d\n",two);
				}if(three>0) {
					System.out.printf("3 : %d\n",three);
				}if(four>0) {
					System.out.printf("4 : %d\n",four);
				}if(five>0) {
					System.out.printf("5 : %d\n",five);
				}if(six>0) {
					System.out.printf("6 : %d\n",six);
				}if(seven>0) {
					System.out.printf("7 : %d\n",seven);
				}if(eight>0) {
					System.out.printf("8 : %d\n",eight);
				}if(nine>0) {
					System.out.printf("9 : %d\n",nine);
				}
				break;
			}if(a[i]/10==0) {
				zero++;
			}else if(a[i]/10==1) {
				one++;
			}else if(a[i]/10==2){
				two++;
			}else if(a[i]/10==3) {
				three++;
			}else if(a[i]/10==4) {
				four++;
			}else if(a[i]/10==5) {
				five++;
			}else if(a[i]/10==6) {
				six++;
			}else if(a[i]/10==7) {
				seven++;
			}else if(a[i]/10==8) {
				eight++;
			}else if(a[i]/10==9) {
				nine++;
				}
			}
	}
}