package test;

import java.util.Scanner;

//(1) �м��g�@�ӵ{���A����L��J�ǥͪ��H�ơA�ھکҿ�J���ǥͤH�ơA�ʺA���ͤ@�ӲŦX�j�p���B�I�ư}�C�C
//(2) �N�ҿ�J���C��ǥͦ��Z�s���}�C��(�������J���p���I���)�C
//(3) �{������ɡA��ܡi�п�J�ǥͤH�ơG�j�A�n�D��J�ǥͤH�ơC
//(4) ����n�D��J�� 1 �Ӧܲ� n �Ӿǥͪ����Z�An �O��~�ҿ�J���ǥͤH�ơC
//(5) �p��X�H�ơB�`���Υ����� (������p���I���)�A��ܦp���浲�G�Ѧҵe�� (3)�C
//  ���ܡG���D�ݨϥ� float ���g�{���C
//--------------------------------------------------------------------------------------------
//�п�J�ǥͤH�ơG5
//��1�Ӿǥͪ����Z�G81.24
//��2�Ӿǥͪ����Z�G56.14
//��3�Ӿǥͪ����Z�G92.84
//��4�Ӿǥͪ����Z�G42.96
//��5�Ӿǥͪ����Z�G64.37
//�H�ơG5
//�`���G337.55
public class JPA502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		float avg=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("�п�J�ǥͤH��:");
		int x=sc.nextInt();
		float[] scort=new float[x];
		for(int s=0;s<scort.length;s++) {
			System.out.printf("��%d�Ӿǥͪ����Z:",s+1);
			scort[s]=sc.nextFloat();
		}
		for(float qw:scort) {
			count+=1;
			sum+=qw;
			
		}
		avg=sum/count;
		System.out.println("�H��:"+count);
		System.out.println("�`��:"+sum);
		System.out.println("����:"+avg);
	}

}
