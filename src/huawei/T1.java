package huawei;
//��Ϊ������ʵϰ������    date:2020.04.22
//Ҫ��    ����һ���ַ���(�ַ������� �м䲻���ո� ���������Ŀû�и���  ��������)  
//       ������е������ַ�   �������ִ�С��С��������  �ظ����ֲ��ϲ�


import java.util.Scanner;


public class T1 {  
	public static void main(String[] args) {
		//����   ����Ļ�����뱣�浽�ַ���str��
		Scanner sc = new Scanner(System.in);	
		String str = sc.next();
		//�������
		solute(str);
	}	
	public static void solute(String str) {
		//1.�ж�str�Ƿ�Ϊ��
		if(str == null ||str =="") {
			return;
		}
		//��������
		int[] assist = new int[10];
		//2.�����ַ���
		for(int i = 0;i<str.length();i++) {
			//�ж�������Ƿ�Ϊ����
			if((str.charAt(i)-'0')>=0 && (str.charAt(i)-'0')<=9){
				assist[str.charAt(i)-'0']++;
			}		
		}//end for
		
		//3.����Ļ������
		for(int i=0;i<10;i++) {
			while(assist[i]>0) {
				System.out.print(i);
				assist[i]--;
			}
		}
	}
}
