package test;

import java.util.Scanner;

//JPA410 ���j�r�����
//(1) �Шϥλ��j���g�@�����O��k�A����k����N�@�Ӧr�ꤺ���Y�Ӧr�������t�@�Ӧr���C
//  �Ҧp��J�r��iwindows�j�A�N�r�ꤤ w �ȴ����� g �ȡA��X�r�ꬰ�igindogs�j�C
//(2) �{������ɡA��ܡiInput a string: �j�n�D��J�r��A������ܡiInput a character: �j
//  �n�D��J�u�Q�����v���r���A�̫���ܡiInput another character: �j�n�D��J�����r���C
//(3) �ЧQ�� replace() ��ƶi��r������A��ܦp���浲�G�Ѧҵe���C
//----------------------------------------------------------------------------------
//Input a string: windows
//Input a character: w
//Input another character: g
//gindogs
public class JPA410 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	test();
}

	private static void test() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Input a string:");
		String st=sc.nextLine();
		System.out.print("Input a character:");
		String ch=sc.nextLine();
		System.out.print("Input another character:");
		String cg=sc.nextLine();
		System.out.println(recursion(st,ch,cg));
		
	}

	private static String recursion(String st, String ch, String cg) {
		// TODO Auto-generated method stub
		if(st.isEmpty()) {
			return "";
		}else if (st.subSequence(0, 1).equals(ch)) {
			return cg.substring(0,1)+recursion(st.substring(1), ch, cg);
		}else {
			return st.substring(0,1)+recursion(st.substring(1), ch, cg);
		}
	}
}