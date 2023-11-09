package test;

import java.util.Scanner;

//JPA406 遞迴字串計算
//(1) 請使用遞迴撰寫一個類別方法，可計算一個字串內有幾個 A，大小寫有所區別。
//(2) 程式執行時，顯示【Input a string: 】要求輸入字串。
//(3) 連續執行兩次，如執行結果參考畫面，顯示【輸入的字串 has X As】。
//  將計算此字串內有幾個 A，代入 X 中。
//-------------------------------------------------------------------------------------
//Input a string: COMPUTER SKILLS FOUNDATION
//COMPUTER SKILLS FOUNDATION has 1 As
//Input a string: java
//java has 0 As
public class JPA406 {
	static int substring(String st,char c) {
		if(st.isEmpty()) {
			return 0;
		}
		char ch=st.charAt(0);
		if(ch==c) {
			return 1+substring(st.substring(1),c );
		}
		
	return 	substring(st.substring(1),c);
	}
	public static void test() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("輸入搜索的字");
		String input=sc.next();
		System.out.println("輸入搜索的字");
		char ch=sc.next().charAt(0);
		int count=substring(input,ch);
		System.out.println("java has "+count+" As");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
}
}
