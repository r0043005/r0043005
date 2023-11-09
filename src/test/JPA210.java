package test;

import java.util.Scanner;

//JPA210 鍵盤字元判斷
//(1) 請使用 switch 完成編輯區中 test() 的程式。
//(2) 程式執行時，畫面顯示【Input a character:】，請使用者輸入一個英文字母。
//(3) 若輸入 a 或 b，顯示【You entered a or b】。
//(4) 若輸入 x顯示【You entered x】；若輸入 y，顯示【You entered y】。
//(5) 若皆非上述所列英文字母，則顯示【You entered something else.】。
//--------------------------------------------------------------------------------
//Input a character:
//a
//You entered a or b
//Input a character:
//b
//You entered a or b
//Input a character:
//x
//You entered x
//Input a character:
//y
//You entered y
//Input a character:
//c
//You entered something else.
public class JPA210 {
	public static void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a character:");
		String text = sc.next();
		switch (text) {
		case "a":
		case "b": {
			System.out.println("You entered a or b");
			break;
		}
		case "x": {
			System.out.println("You entered x");
			break;
		}
		case "y": {
			System.out.println("You entered y");
			break;
		}
		default:
			System.out.println("You entered something else.");
	}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		test();
		test();
		test();
		test();
	}

}
