package test;

import java.util.Scanner;

//JPA307 �j��̤j���]��
//(1) �г]�p�@�{���A�����J��Ӽ� m�Bn�Am �P n �����H�Źj����j�A�åH�@�����O��k�� while loop 
//    �p�� m �P n ���̤j���]�ơA�����J m=999 ����C
//(2) �����J��Ӽ� m�Bn�A��ܦp���浲�G�Ѧҵe���A��U���X����ƪ��̤j���]�ơC
// Input:
// 8
// 12
// 4
// Input:
// 13
// 19
// 1
// Input:
// 7
// 49
// 7
// Input:
// 999
//-------------------------------------------------------------------------------
public class JPA307 {
	static void sj(int m, int n) {
		
		
		int temp=0;
		
		while (n!=0) {
				
				temp=m%n;
				m=n;
				n=temp;
		}
	
		System.out.println(m);
		}
			
			
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=0,n=0;
		System.out.println("Input");
		m=sc.nextInt();
		while (m!=999) {
			
		
			n=sc.nextInt();
			sj(m,n);
			System.out.println("Input");
			m=sc.nextInt();
		}
		
	}

}
