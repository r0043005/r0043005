package test;

import java.util.Scanner;

//JPA210 ��L�r���P�_
//(1) �Шϥ� switch �����s��Ϥ� test() ���{���C
//(2) �{������ɡA�e����ܡiInput a character:�j�A�ШϥΪ̿�J�@�ӭ^��r���C
//(3) �Y��J a �� b�A��ܡiYou entered a or b�j�C
//(4) �Y��J x��ܡiYou entered x�j�F�Y��J y�A��ܡiYou entered y�j�C
//(5) �Y�ҫD�W�z�ҦC�^��r���A�h��ܡiYou entered something else.�j�C
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
