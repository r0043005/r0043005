package test;
//JPA504 �O���
//(1) �O��� (Fibonacci sequence) �i�ϥΩ�ؿv�]�p�A�O��ƦC�� 0�B1�B1�B2�B3�B5�B8�B13�B21�B34�B55�B�K�A
// �Ĥ@�ӼƬ� 0�A�ĤG�Ӭ� 1�A�䥦���Ƭ��e����Ӽƪ��M�C
//(2) �Хΰ}�C�覡�g�X�O��� 0�B1�B1�B2�B3�B5�B8�B13�B21�B34 ���{���C
//(3) �Шƥ��ŧi�@�Ӥj�p�� 10 ����ư}�C�A�N�̫e����Ӱ}�C���w�O��ƪ���l�ȡA�çQ�Ϊ�l�Ȩӭp���l���O��ơC
//(4) �H����覡�A��ܦ��O��ƪ��e 10 �ӼƭȡC
public class JPA504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry1=new int[10];
		arry1[0]=0;
		arry1[1]=1;
		for(int x=2;x<10;x++) {
			arry1[x]=arry1[x-2]+arry1[x-1];
		}
		for(int x:arry1) {
			
			System.out.println(x);
		}
	}

}
