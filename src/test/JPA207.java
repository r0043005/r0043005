package test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//JPA207 三角形邊長判斷
//(1) 請寫一個判斷三角形的程式：當三個邊長能夠構成三角形時，再判斷該三角形為鈍角、銳角或是直角三角形，
//  否則請顯示【不可以構成三角形】。
//(2) 構成三角形存在條件：任兩邊相加大於第三邊，且皆不可為 0。
//(3) 直角三角形：其中有兩個邊的平方和等於第三邊的平方。
//(4) 鈍角三角形：其中有兩個邊的平方和小於第三邊的平方。
//(5) 銳角三角形：任兩邊的平方和大於第三邊的平方。
//(6) 程式執行時，畫面顯示【請輸入三個整數：】要求輸入三邊的邊長。
//(7) 重複執行四次，顯示如執行結果參考畫面。
//-------------------------------------------------------------------------------------------
//請輸入三個整數:3 4 5
//直角三角形
//請輸入三個整數:3 4 6
//鈍角三角形
//請輸入三個整數:4 4 3
//銳角三角形
//請輸入三個整數:2 4 7
//不可以構成三角形
public class JPA207 {
	public static void test() {
		int[] a=new int [3];
		int[] b=new int [3];
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入三個整數:");
		for(int k=0;k<a.length;k++) {
			a[k]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		for(int x=0;x<a.length;x++) {
			
			for(int y=0;y<a.length;y++) {
			
				
				if(a[x]<a[y]) {
					
					int temp=a[x];
					a[x]=a[y];
					a[y]=temp;
					
				}
			}
		}
		if(a[0]==0 && (a[0]+a[1])<a[2]) {
			System.out.println("不可以構成三角形");
			
		}else {
			double aa=Math.pow(a[0], 2);
			double bb=Math.pow(a[1], 2);
			double cc=Math.pow(a[2], 2);
			if(aa+bb==cc) {
				System.out.println("直角三角形");
				
			}else if(aa+bb<cc) {
				System.out.println("鈍角三角形");
				
			}else if(aa+bb>cc) {
				System.out.println("銳角三角形");
				
			}
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		test();
		test();
		test();
	}

}
