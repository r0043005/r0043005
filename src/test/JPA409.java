package test;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthToolTipUI;

//(1) �Шϥλ��j���g�@�����O��k�A����k����N�@�Ӧr�ꤺ���Y�Ӧr�������C
//(2) �{������ɡA��ܡiInput a string: �j�n�D��J�r��C
//(3) ��J�����A��ܡiInput a character: �j�n�D��J�u�������v���r���C
//(4) �s�����⦸�A��ܦp���浲�G�Ѧҵe���A�N�r���q�r�ꤤ�����C
//-------------------------------------------------------------------------------
//Input a string: java se8
//Input a character: a
//jv se8
//Input a string: computer
//Input a character: p
//comuter
public class JPA409 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test();
		test();
	}

	private static void test() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Input a string:");
		String st=sc.nextLine();
		System.out.print("Input a character:");
		String ch=sc.nextLine();
		
		System.out.println(recursion(st,ch));
	}

	private static String recursion(String st, String ch) {
		// TODO Auto-generated method stub
		if(st.isEmpty()) {
			return "";
		}else if(st.substring(0,1).equals(ch.subSequence(0, 1))){
				
			return recursion(st.substring(1), ch);
		}else {
			return st.substring(0,1)+recursion(st.substring(1), ch);
		}
	}
	

}
