package test;

import java.util.Scanner;

//JPA306 �j�馸��p��
//(1) �г]�p�@�{���A�����J��Ӽ� m�Bn�Am �P n �����H�Źj����j�A�åH�@�����O��k�� while loop
//  �p�� m �� n ����A�����J m=999 ����C
//(2) ��ܦp���浲�G�Ѧҵe���C
//-------------------------------------------------------------------------------------------
//Input:
//2 2
//4
//Input:
//100 7
//276447232
//Input:
//999 10
public class JPA306 {
		
	public static void test() {
		Scanner sc=new Scanner(System.in);
		
		
		
		int m=0,n;
		System.out.println("Input");
		m=sc.nextInt();
		//n=sc.nextInt();
		int temp=1;
		while (m!=999) {
			n=sc.nextInt();
			
			for(int y=1;y<=n;y++) {
			temp*=m;	
					
		}
			System.out.printf("M=%d N=%d\n%d\n",m,n,temp);
			System.out.println("Input");
			m=sc.nextInt();
			temp=1;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		
	}

}
