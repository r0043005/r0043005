package test;

import java.util.ArrayList;
import java.util.Arrays;

//JPA505 ����}�C
//(1) �{�������@�}�C {��A��, ��B��, ��C��, ��D��, ��E��, ��F��, ��G��, ��H��, I��, ��J��}�C
//(2) �Хΰ}�C�覡�g�X����}�C���{���A��� {��J��, ��I��, ��H��, ��G��, ��F��, ��E��, ��D��, ��C��, ��B��, ��A��}�C
//(3) ��ܦp���浲�G�Ѧҵe���C
//-----------------------------------------------------------------------------------------
//����}�C��Ƥ��e�G A B C D E F G H I J 
//����}�C��Ƥ���G J I H G F E D C B A 
public class JPA505 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a={"A","B","C","D","E","F","G","H","I","J"};
		StringBuilder st=new StringBuilder();
		for(int x=0;x<a.length;x++) {
			st.append(a[x]);
		}
		st.reverse();
		
		String str=st.toString();
		char[] b=str.toCharArray();
		System.out.println("����}�C��Ƥ���G"+print(b));
		System.out.println(st.toString());
	}

	private static String print(char[] b) {
		// TODO Auto-generated method stub
		String st="";
		for(int x=0;x<b.length;x++) {
			st+=b[x]+" ";
		}
		
		return st;
	}
	
}
