package test;

import java.util.Scanner;

//JPA410 遞迴字串替換
//(1) 請使用遞迴撰寫一個類別方法，此方法能夠將一個字串內的某個字元換成另一個字元。
//  例如輸入字串【windows】，將字串中 w 值替換成 g 值，輸出字串為【gindogs】。
//(2) 程式執行時，顯示【Input a string: 】要求輸入字串，接續顯示【Input a character: 】
//  要求輸入「被替換」的字元，最後顯示【Input another character: 】要求輸入替換字元。
//(3) 請利用 replace() 函數進行字串替換，顯示如執行結果參考畫面。
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