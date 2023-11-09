package test;

import java.util.Scanner;

//JPA310 迴圈正偶數相加
//(1) 程式執行時，畫面顯示【請輸入 n 的值(n > 0，且為偶數)：】，請使用者輸入一個正偶數。
//(2) 試利用 do-while，計算 2 + 4 + 6 + … + n 的總和，其中 n 為一由鍵盤輸入的正偶數，
//  若輸入的不是正偶數，則程式會要求使用者再次輸入，直到輸入的數是正偶數為止。
//(3) 計算 2 + 4 + 6 + … + n 的總和，顯示如執行結果參考畫面 (2)。
//------------------------------------------------------------------------------------
//請輸入 n 的值(n > 0，且為偶數)：3
//請輸入 n 的值(n > 0，且為偶數)：-2
//請輸入 n 的值(n > 0，且為偶數)：10
//2+4+...+10=30
public class JPA310 {
	 static boolean test(int sc) {
		int temp=0;
		 if(sc%2==0 && sc>0) {
			 for(int x=2;x<=sc;x+=2) {
				 temp+=x;
				 if(x!=sc) {
				 System.out.print(x+"+");
				}else {
					System.out.print(x+"="+temp);
				}
			 }
			 return false;
		}else {
					
					 return true; 
				}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=false;
		do {
			System.out.print("請輸入 n 的值(n > 0，且為偶數)：");
			int sc=new Scanner(System.in).nextInt();
			flag=test(sc);
			
		}while(flag!=false );
	//	System.out.println("="+x);
	}

}
