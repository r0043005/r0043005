package test;
import java.util.Scanner;
public class JPA104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//
		//JPA104 �Z���p��
		//(1) Math �M�� (package) �����\�h�ƾǤW�`�Ϊ���ơC
		//(2) �Шϥ� Math.pow �� Math.sqrt ���g�{���A��ܡi��J��1�ժ�x�My�y�СG�j�A���ܨϥΪ̭�����J�Ĥ@�ծy�� (x1, y1)
//		    �Ax �P y �y�Ъ���J�H�@�Źj����j�A���ƫ��A�Ҭ�����ơC
		//(3) �n�D��J��2�ծy�� (x2, y2)�C
		//(4) ��ծy�п�J�����A��X��ծy�Ф������Z���A��ܦp���浲�G�Ѧҵe�� (3)�C
		//-----------------------------------------------------------------------------------------------------------
		//(1) ���ܨϥΪ̭�����J�Ĥ@�ծy�� (x1, y1)�C
//		    ��J��1�ժ�x�My�y�СG     ex: 1 5
		//(2) �n�D��J�ĤG�ծy�� (x2, y2)�C
//		    ��J��2�ժ�x�My�y�СG     ex: 10 22
		//(3) ��ծy�п�J�����A��X��ծy�Ф������Z���C
//		    ex: ����(1.00,5.00)�M(10.00,22.00)�������Z���O19.25
		Scanner sc=new Scanner(System.in);
		System.out.print("��J��1�ժ�X�MY�y��:");
		double x1=sc.nextInt();
		double y1=sc.nextInt();
		System.out.print("��J��2�ժ�X�MY�y��:");
		double x2=sc.nextInt();
		double y2=sc.nextInt();
		System.out.printf("����(%.2f,%.2f)�M(%.2f,%.2f)�������Z���O%.2f",x1,y1,x2,y2,Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2)));

	}
}
