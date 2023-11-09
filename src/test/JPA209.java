package test;

import java.util.Scanner;

//JPA209 象限座標
//(1) 請撰寫程式，輸入 x、y 座標值，判斷該點位於何象限或是在哪個座標軸上。
//(2) 程式執行時，畫面顯示【請輸入x座標：】要求輸入 x 座標。
//  舉例：若輸入的座標值為 (3.0, -2.5)，輸出【座標值 + 在第四象限】；
//  若輸入的座標值為 (4.5, 0.0)，輸出【座標值 + 在 x 軸上】。
//(3) 重複執行四次，顯示如執行結果參考畫面 (2)。
//----------------------------------------------------------------------------------
//請輸入x座標：4.5
//請輸入y座標：0
//(4.50,0.00)在x軸上
//請輸入x座標：0
//請輸入y座標：3.2
//(0.00,3.20)在y軸上
//請輸入x座標：-5.5
//請輸入y座標：-3.8
//(-5.50,-3.80)在第三象限
//請輸入x座標：-4.3
//請輸入y座標：7.2
//(-4.30,7.20)在第二象限
public class JPA209 {
	public static void test() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入X座標:");
		double x = scanner.nextDouble();
		System.out.print("請輸入Y座標:");
		double y = scanner.nextDouble();

		if (x >= 0 && y >= 0) {
			if (y == 0) {
				System.out.println("在X軸上");
			} else if (x == 0) {
				System.out.println("在Y軸上");
			} else {
				System.out.printf("(%.2f,%.2f)在第一象限\n",x,y);
			}
		} else if (x >= 0 && y <= 0) {
			if (y == 0) {
				System.out.println("在X軸上");
			} else if (x == 0) {
				System.out.println("在Y軸上");
			} else {
				System.out.printf("(%.2f,%.2f)在第四象限\n",x,y);
			}

		} else if (x <= 0 && y >= 0) {
			if (y == 0) {
				System.out.println("在X軸上");
			} else if (x == 0) {
				System.out.println("在Y軸上");
			} else {
				System.out.printf("(%.2f,%.2f)在第二象限\n",x,y);
			}
		} else if (x <= 0 && y <= 0) {
			if (y == 0) {
				System.out.println("在X軸上");
			} else if (x == 0) {
				System.out.println("在Y軸上");
			} else {
				System.out.printf("(%.2f,%.2f)在第三象限\n",x,y);
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
