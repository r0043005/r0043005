package test;

public class JPA107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//JPA107 �B�ʦ��Z
		//(1) ���D�ϥΨ�L���O�w�q�����O��k�C
		//(2) ���]�Ѯv�b�p��B�ʦ��Z�����ƮɡA�ʧ@�� 1 ���A�ޥ��� 2 ���A�ζ����{�� 3 ���C
		//(3) basketball �����ƭp��覡���G�ʧ@ (action) + �ޥ� (skill) + �ζ����{ (teamgame)�F
//		    baseball �����ƭp��覡���G10 + �ޥ� (skill) + �ζ����{ (teamgame)�C
		//(4) JPD01.java ���w���� basketball �P baseball ������O�Φ��Z���p��覡�A
//		    ���̦U���@�� calGrade ��k�A�бN����k�� basketball �P baseball ������O���ɤW�C
		//-------------------------------------------------------------------------------------------
		//public class JPD01 {
		//public static void main(String argv[]) {
//		    int action = 1, skill = 2, teamgame = 3;
//		    System.out.println("The basketball grade is " + Basketball.calGrade(_____________________));
//		    System.out.println("The baseball grade is " + _______________(________________________));
		//}
		//}
		//class Basketball {
		//......   {
//		    return a + s + t;
		//}
		//}
		//class Baseball {
		//......   {
//		    return 10 + s + t;
		//}
		//}
		//---------------------------------------------------------------------------------------------
		//(5) �{������ɪ����p�⦨�Z�A�ÿ�X basketball �� baseball �����Z�A��ܦp���浲�G�Ѧҵe���C
		//-----------------------------------------------------------------------------------------
		// The basketball grade is 6
		// The baseball grade is 15
		Basketball Basketball=new Basketball();
		Baseball Baseball=new Baseball();
		    int action = 1, skill = 2, teamgame = 3;
		    System.out.println("The basketball grade is " + Basketball.calGrade(action,skill,teamgame));
		    System.out.println("The baseball grade is " +Baseball.calGrade(skill,teamgame));
		}
		}
		class Basketball {
		 int calGrade(int a,int s, int t){
			 
	    return a + s + t;
		}
		}
		class Baseball {
		int calGrade(int s,int t) {
		    return 10 + s + t;
		}
		
	}

