package test;

import java.util.Scanner;

//JPA408 ���j�r��ϦV
//(1) �Шϥλ��j�]�p�@�����O��k�A����k����N�r��ϦV�C
//(2) �{������ɡA��ܡiInput a string: �j�n�D��J�r��C
//(3) �s�����⦸�A�p���浲�G�Ѧҵe���N�r��ϦV�L�X�C
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

