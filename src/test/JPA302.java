package test;
//JPA302 �_���j��
//(1) �@�ӥ~�j��]��@�өΦh�Ӥ��j��٤����_���j��A�C������~�j��ɡA���׶i�J���j��A���ư���C
//(2) ���]�~�j�魫�ƤF 3 ���A�Ӥ��j�魫�ƤF 2 ���A�h���j�餺���ԭz�N�|���� 3 * 2 ���C
//(3) �Ч��� JPD03.java �ɮפ����{���A�� count ���Ȭ� 27�C
//(4) ��ܦp���浲�G�Ѧҵe���C
//-------------------------------------------------------------------------------
//count = 27
//-------------------------------------------------------------------------------
//import java.util.Scanner;
//public class JPD03 {
//  public static void main(String[] args) {
//      int i = 1, j = 1, count = 0;
//      for (i = 1; i <= 3; i++) {        //�Ĥ@�Ӱj��Ai�q1��3
//          ...
//          }
//      }
//      System.out.printf("count = %d\n", count);
//  }
//}
public class JPA302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i = 1, j = 1, count = 0;
	      for (i = 1; i <= 3; i++) {        //�Ĥ@�Ӱj��Ai�q1��3
	          for(j=1;j<=9;j++) {
	        	  count+=1;
	          }
	          }
	   
	      System.out.printf("count = %d\n", count);
	     }
	

}
