package test;

import java.util.Scanner;

//JPA401 ���j�����p��
//(1) �мg�@�ӵ{�������J�@�Ӽ� n�A�ϥλ��j�p�� n �������A���� n ��J���ƭȬO 999 ����C
//(2) �{������ɡA��ܡiInput n (0 <= n <= 16):�j�n�D��J�ƭȡC
//(3) ��ܦp���浲�G�Ѧҵe���C
//--------------------------------------------------------------------------------------
//Input n (0 <= n <= 16):6
//6 �����h = 720
//Input n (0 <= n <= 16):10
//10 �����h = 3628800
//Input n (0 <= n <= 16):999

public class JPA401 {
	static int test(int s ,int x) {
		if(s==1) {
			return x;
		}
		x*=s;
		return test(s-1,x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sc=0;
		
		do {
			int x=1;
			System.out.print("Input n (0 <= n <= 16):");
			 sc=new Scanner(System.in).nextInt();
			 if(sc>0 && sc<=16) { 
			x = test(sc,x);
			System.out.println(sc+"�����h"+x);
			}
		}while(sc!=999);
	}

}
