package test;

import java.util.Scanner;

//JPA305 �j�鶥���p��
//(1) �г]�p�@�{���p�� n �������C
//(2) n ���ϥΪ̥��N��J����ƭȡAn �Ƚd�򤶩� 1 �� 10 �����C
//(3) �{������ɡA�e����ܡiPlease enter one value:�j�A�����P�_ n �ȬO�_���� 1 �� 10 �����A
//  �Y�ˮֳq�L�A�h��X�����p��ᤧ�ƭȡF�Y�S������ 1 �� 10 �����A�h��ܡiError, the value is out of range.�j�C
//(4) ���ư���T���A��ܦp���浲�G�Ѧҵe���C
//----------------------------------------------------------------------------------------
//Please enter value:
//0
//Error, the value is out of range.
//Please enter value:
//12
//Error, the value is out of range.
//Please enter value:
//6
//6!: 720
public class JPA305 {
	public static void test() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter value:");
		int n=sc.nextInt();
		int temp=1;
		if(n>=1 && n<=10) {
			for(int x=1;x<=n;x++) {
				temp*=x;
			}
			System.out.printf("%d!:%d\n",n,temp);
		}else {
			System.out.println("Error, the value is out of range.\n");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		test();
		test();
	}

}
