package test;

import java.util.Scanner;

//JPA310 �j�饿���Ƭۥ[
//(1) �{������ɡA�e����ܡi�п�J n ����(n > 0�A�B������)�G�j�A�ШϥΪ̿�J�@�ӥ����ơC
//(2) �էQ�� do-while�A�p�� 2 + 4 + 6 + �K + n ���`�M�A�䤤 n ���@����L��J�������ơA
//  �Y��J�����O�����ơA�h�{���|�n�D�ϥΪ̦A����J�A�����J���ƬO�����Ƭ���C
//(3) �p�� 2 + 4 + 6 + �K + n ���`�M�A��ܦp���浲�G�Ѧҵe�� (2)�C
//------------------------------------------------------------------------------------
//�п�J n ����(n > 0�A�B������)�G3
//�п�J n ����(n > 0�A�B������)�G-2
//�п�J n ����(n > 0�A�B������)�G10
//2+4+...+10=30
public class JPA310 {
	 static boolean test(int sc) {
		int temp=0;
		 if(sc%2==0 && sc>0) {
			 for(int x=2;x<=sc;x+=2) {
				 temp+=x;
				 if(x!=sc) {
				 System.out.print(x+"+");
				}else {
					System.out.print(x+"="+temp);
				}
			 }
			 return false;
		}else {
					
					 return true; 
				}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=false;
		do {
			System.out.print("�п�J n ����(n > 0�A�B������)�G");
			int sc=new Scanner(System.in).nextInt();
			flag=test(sc);
			
		}while(flag!=false );
	//	System.out.println("="+x);
	}

}
