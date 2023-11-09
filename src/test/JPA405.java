package test;

import java.util.Scanner;

//JPA405 ���j���
//(1) �ЧQ�ΤU���������A���g���j��� sum2�G
//  a. sum2(1) = 2
//  b. sum2(n) = sum2(n �V 1) + 2 * n
//(2) �{������ɡA��ܡiInput the number n:�j�n�D��J n (n >= 1)�A�ñN n �ȥN�J��Ƥ��C
//(3) ��ܦp���浲�G�Ѧҵe���C
//------------------------------------------------------------------------------------
//Input the number n: 50
//Ans: 2550
public class JPA405 {
	
	static int loop(int n){
		
		if(n==1) {
			return 2;
		}else {
			
			return loop(n-1)+2*n;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("Input the number n:");
		int n=sc.nextInt();
		System.out.print("Ans:"+loop(n));
		
	}
}
