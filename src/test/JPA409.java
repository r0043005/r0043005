package test;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthToolTipUI;

//(1) 請使用遞迴撰寫一個類別方法，此方法能夠將一個字串內的某個字元移除。
//(2) 程式執行時，顯示【Input a string: 】要求輸入字串。
//(3) 輸入完畢，顯示【Input a character: 】要求輸入「欲移除」的字元。
//(4) 連續執行兩次，顯示如執行結果參考畫面，將字元從字串中移除。
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
