package test;

import java.util.ArrayList;
import java.util.Arrays;

//JPA505 反轉陣列
//(1) 程式內有一陣列 {“A”, “B”, “C”, “D”, “E”, “F”, “G”, “H”, I”, “J”}。
//(2) 請用陣列方式寫出反轉陣列的程式，顯示 {“J”, “I”, “H”, “G”, “F”, “E”, “D”, “C”, “B”, “A”}。
//(3) 顯示如執行結果參考畫面。
//-----------------------------------------------------------------------------------------
//反轉陣列資料之前： A B C D E F G H I J 
//反轉陣列資料之後： J I H G F E D C B A 
public class JPA505 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a={"A","B","C","D","E","F","G","H","I","J"};
		StringBuilder st=new StringBuilder();
		for(int x=0;x<a.length;x++) {
			st.append(a[x]);
		}
		st.reverse();
		
		String str=st.toString();
		char[] b=str.toCharArray();
		System.out.println("反轉陣列資料之後："+print(b));
		System.out.println(st.toString());
	}

	private static String print(char[] b) {
		// TODO Auto-generated method stub
		String st="";
		for(int x=0;x<b.length;x++) {
			st+=b[x]+" ";
		}
		
		return st;
	}
	
}
