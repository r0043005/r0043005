package test;

import java.util.Scanner;

//(1) �ШϥΧ��ݻ��j�ΰj�鼶�g�@�����O��k�A����k����p��@�ӼƦr�r�ꤺ�Ҧ��Ʀr���M�C
//(2) �{������ɡA��ܡiInput a string of numbers: �j�n�D��J�Ʀr�r��C
//(3) �s�����⦸�A�p���浲�G�Ѧҵe���A�C�X�H�u���ݻ��j�v�Ρu�j��v�p��ᤧ�Ʀr�`�M�C
//Input a string of numbers: 1234
//���ݻ��j�G10
//�j��G10
//Input a string of numbers: 3456
//���ݻ��j�G18
//�j��G18
public class JPA407 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a string of numbers:");
		String abs=sc.next();
		int count1=counta(abs);
		System.out.println("���ݻ��j:"+count1);
		int count2=countb(abs);
		System.out.println("�j��:"+count2);
	}

	static int countb(String abs) {
		// TODO Auto-generated method stub
		int temp=0;
		if(!abs.isEmpty()) {
			for(int x=0;x<abs.length();x++)
			{
				temp+=Character.getNumericValue(abs.charAt(x));
			}
			
		}
		return temp;
	}

	static int counta(String abs) {
		// TODO Auto-generated method stub
		 int temp=0;

		 if(abs.isEmpty()) {
			 return temp;
		 }else {
			 int a=Character.getNumericValue(abs.charAt(0));
			 temp+=a;

			 
			return temp+counta(abs.substring(1));
		 }
		 
	}

}
