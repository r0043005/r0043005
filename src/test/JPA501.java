package test;

import java.util.Scanner;

//JPA501 �}�C�p��
//(1) �м��g�@�ӵ{���A����L��J 10 �Ӿ�ơA�æs���@�Ӱ}�C�C
//(2) �{������ɡA��ܦp���浲�G�Ѧҵe�� (1)�A��ܡi�п�J10�Ӿ�ơG�j����ܡi��1�Ӿ�ơG�j�A�n�D��J�� 1 �Ӿ�ơC
//(3) �̧ǭn�D��J�� 1 �Ӧܲ� 10 �Ӿ�ơA��ܦp���浲�G�Ѧҵe�� (2)�C
//(4) �P�_��J 10 �Ӿ�ƫ�A�p��}�C���j�� 60 ���X�ӡA�o�Ǥj�� 60 ���ƭ��`�X�Υ����ȡA��ܦp���浲�G�Ѧҵe�� (3)�C
//�п�J10�Ӿ�ơG
//��1�Ӿ�ơG88
//��2�Ӿ�ơG59
//��3�Ӿ�ơG66
//��4�Ӿ�ơG46
//��5�Ӿ�ơG92
//��6�Ӿ�ơG74
//��7�Ӿ�ơG52
//��8�Ӿ�ơG58
//��9�Ӿ�ơG69
//��10�Ӿ�ơG81
//�}�C���j��60����6��
//�`�X��470
//�����Ȭ�	78.33333333333333
public class JPA501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		double avg=0;
		int temp=0;
		Scanner sc=new Scanner(System.in);
		int[] s=new int[10];
		for(int x=0;x<s.length;x++) {
			System.out.printf("��%d�Ӿ�ơG",x+1);
			s[x]=sc.nextInt();
		}
		for(int q:s) {
			
			if(q>60) {
				count+=1;
				temp+=q;
			}
			
			
		}
		avg=(double)temp/count;
		System.out.printf("�}�C���j��60����%d��\n",count);
		System.out.printf("�`�X��%d\n",temp);
		System.out.print("�����Ȭ�"+avg);
	}

}
