package test;

import java.util.Scanner;
//JPA106 �ƾǨ��
		//(1) ���@�ƾǨ�� f(x) = 3(x ^ 3) + 2x �V 1�C
		//(2) �м��g�@��� f �ΨӶǦ^ f(x) ���ȡA�ä��O�p�� f(-3.2)�Bf(-2.1)�Bf(0) �P f(2.1)�C
		//(3) ��� f(x) �Ȩ���p�Ʋĥ|��C
		//(4) �̦��ƾǨ�ƭp��A���O��X���|�ӭp��ȡA��ܦp���浲�G�Ѧҵe���C
		//------------------------------------------------------------------------------------
//		    f(-3.2) = -105.7040
//		    f(-2.1) = -32.9830
//		    f(0) = -1.0000
//		    f(2.1) = 30.9830
public class JPA106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.printf( "f(%.1f) = %.4f\n",-3.2,f(-3.2));
		System.out.printf( "f(%.1f) = %.4f\n",-2.1,f(-2.1));
		System.out.printf( "f(%d) = %.4f\n",0,f(0));
		System.out.printf( "f(%.1f) = %.4f\n",2.1,f(2.1));
		
		
	}
	
	public static double f(double x) {
						
			 return 3*Math.pow(x, 3)+2*x-1;	
	}

}
