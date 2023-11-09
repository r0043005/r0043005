package test;

import java.util.Scanner;

//(1) 請使用尾端遞迴及迴圈撰寫一個類別方法，此方法能夠計算一個數字字串內所有數字的和。
//(2) 程式執行時，顯示【Input a string of numbers: 】要求輸入數字字串。
//(3) 連續執行兩次，如執行結果參考畫面，列出以「尾端遞迴」及「迴圈」計算後之數字總和。
//Input a string of numbers: 1234
//尾端遞迴：10
//迴圈：10
//Input a string of numbers: 3456
//尾端遞迴：18
//迴圈：18
public class JPA407 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a string of numbers:");
		String abs=sc.next();
		int count1=counta(abs);
		System.out.println("尾端遞迴:"+count1);
		int count2=countb(abs);
		System.out.println("迴圈:"+count2);
	}

	static int countb(String abs) {
		// TODO Auto-generated method stub
		int temp=0;
		if(!abs.isEmpty()) {
			for(int x=0;x<abs.length();x++)
			{
				temp+=Character.getNumericValue(abs.charAt(x));
			}
			
		}
		return temp;
	}

	static int counta(String abs) {
		// TODO Auto-generated method stub
		 int temp=0;

		 if(abs.isEmpty()) {
			 return temp;
		 }else {
			 int a=Character.getNumericValue(abs.charAt(0));
			 temp+=a;

			 
			return temp+counta(abs.substring(1));
		 }
		 
	}

}
