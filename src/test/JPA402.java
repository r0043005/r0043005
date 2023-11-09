package test;

import java.util.Scanner;

//JPA402 ���ݻ��j�����p��
//(1) ���ݻ��j�{���]�p���S�ʬO�H�t�~�ǤJ���ѼƨӲ֭p���j�����סC
//(2) �мg�@�ӵ{�������J�@�Ӽ� n�A�ЭӧO�ϥΧ��ݻ��j�{���]�p�ΰj��A�p�� n �������A���� n ��J���ƭȬO 999 ����C
//(3) �{������ɡA��ܡiInput n (0 <= n <= 16):�j�n�D��J�ƭȡC
//(4) ��ܦp���浲�G�Ѧҵe���C
//-----------------------------------------------------------------------------------------
//Input n (0 <= n <= 16):6
//6 �����h(���ݻ��j) = 720
//6 �����h(�j��) = 720
//Input n (0 <= n <= 16):8
//8 �����h(���ݻ��j) = 40320
//8 �����h(�j��) = 40320
//Input n (0 <= n <= 16):999
public class JPA402 {
	static int recursion(int s,int x){
		if(s==1) {
			return x;
		}
			return recursion(s-1, x*=s);
		
	}
	static int loop(int s,int y) {
		for(int x=1;x<=s;x++) {
			y*=x;
		}
			
		return y;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sc=0;
		
		do {
			int x=1;
			int y=1;
			System.out.print("Input n (0 <= n <= 16):");
			sc=new Scanner(System.in).nextInt();
			if(sc>0 && sc<=16) {
				x=recursion(sc, x);
				y=loop(sc,y);
				System.out.println(sc+"�����h(���ݻ��j)="+x);
				System.out.println(sc+"�����h(�j��)="+y);	
			}
			
		}while(sc!=999);
	}

}
