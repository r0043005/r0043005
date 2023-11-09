package test;

import java.util.Scanner;

//JPA408 遞迴字串反向
//(1) 請使用遞迴設計一個類別方法，此方法能夠將字串反向。
//(2) 程式執行時，顯示【Input a string: 】要求輸入字串。
//(3) 連續執行兩次，如執行結果參考畫面將字串反向印出。
//----------------------------------------------------------------------------------------
//Input a string: computer
//retupmoc
//Input a string: skills
//slliks

public class JPA408 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Input a string: computer");
	String st=sc.nextLine();
	String temp="";
	System.out.printf("Input a string:\n%s" ,recursion(st,temp));
	}

	private static String recursion(String st, String temp) {
		// TODO Auto-generated method stub
		if(st.isEmpty()) 
		{
				return temp;
		}else {
			return recursion(st.substring(1), st.substring(0,1)+temp);
		}
	}
	}

