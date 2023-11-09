package test;

public class JPA108 {
	public static int add(int a,int b) {
		int sum=a+b;
		return sum;
	}
	public static double add(double a,double b) {
		double sum=a+b;
		return sum;
	}
	public static String add(String a,String b) {
		String sum=a+b;
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//JPA108 覆載方法
		//(1) 請在同一個類別中，使用覆載 (OverLoad) 撰寫三個同樣名為 add 的方法。
		//(2) 宣告 main 方法，分別提供以下 a、b、c 等參數。
		//a. add(2, 3);
		//b. add(5.2, 4.3);
		//c. add(“I Love “, “Java!!”);
		//(3) 方法一：傳入兩個整數 (int, int)，計算兩個整數的和 (int)。程式執行時，列出【Adding two integers: i,j】，
//		    請呼叫 main 方法中的 add(2, 3)，將參數代入 i,j 內。
		//(4) 方法二：傳入兩個浮點數 (double, double)，計算兩個浮點數的和 (double)。程式執行時，列出【Adding two doubles: i,j】，
//		    請呼叫 main 方法中的 add(5.2, 4.3)，將參數代入 i,j 內。
		//(5) 方法三：傳入兩個字串(String, String)，計算合併後的兩個字串 (String)。程式執行時，列出【Adding two strings: i,j】，
//		    請呼叫 main 方法中的 add(“I Love “, “Java!!”)，將參數代入 i,j 內。
		//(6) 最後依序顯示此三個方法所計算出的列印值，顯示如執行結果參考畫面。
		//-------------------------------------------------------------------------------------------------------------------
		//  Adding two integers: 2,3
		//  Adding two doubles: 5.2,4.3
		//  Adding two strings: I love ,java!!
		//  5 9.500000 I love Java!!
		//--------------------------------------------------------------------------------------------------------------------
		//class JPD01 {

		System.out.printf("【Adding two integers:%s\n","2, 3");
		System.out.printf("【Adding two integers:%s\n","5.2, 4.3");
		System.out.printf("【Adding two integers:%s\n","I Love ,Java!!");
		System.out.printf("%d %f %s",add(2, 3),add(5.2, 4.3),add("I Love ", "Java!!"));
		
	}

}
