package test;

import java.util.Scanner;

//JPA208 ���ƨ��
//(1) �мg�X�@�ӥi�H��J�ǥͤ��ơA�çP�_���Ƶ��Ū��{���C
//(2) �����>=90���A���Ŭ� A�A��ܡiYour grade is A�j�C
//(3) ����Ƥ��� 90 ���� 80 �������A�Ҧp 90 �� > ���� >= 80 ���A���Ŭ� B�A��ܡiYour grade is B�j�C
//(4) ����Ƥ��� 80 ���� 70 �������A�Ҧp 80 �� > ���� >= 70 ���A���Ŭ� C�A��ܡiYour grade is C�j�C
//(5) ����Ƥ��� 70 ���� 60 �������A�Ҧp 70 �� > ���� >= 60 ���A���Ŭ� D�A��ܡiYour grade is D�j�C
//(6) ����Ƥp�� 60 ���H�U�A�Ҧp 60 �� > ���ơA���Ŭ� F�A��ܡiYour grade is F�j�C
//(7) �{������ɡA�e����ܡiInput:�j�A�ШϥΪ̿�J�@�Ӿ�ơC
//(8) ���ư��椭���A��ܦp���浲�G�Ѧҵe���C
//---------------------------------------------------------------------------------------------
//Input:
//92
//Your grade is A
//Input:
//80
//Your grade is B
//Input:
//79
//Your grade is C
//Input:
//60
//Your grade is D
//Input:
//59
//Your grade is F
public class JPA208 {
	public static void test() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Input:");
		int score=sc.nextInt();
		if(score>=90) {
			System.out.println("Your grade is A");
		}else if(score>=80 ) {
			System.out.println("Your grade is B");
		}else if(score>=70) {
			System.out.println("Your grade is C");
		}else if(score>=60) {
			System.out.println("Your grade is D");
		}else if(score<60) {
			System.out.println("Your grade is F");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		test();
		test();
		test();
		test();
	}

}
