package huawei;
//���Եڶ���   �������籨�ĵı������
//Ҫ��  �� 1.��ⱨ���Ƿ�����T���ĵĸ�ʽҪ��  ������ʼ��  ��������ת���   �����г��ȼ���
//    2.������T���ĸ�ʽ��ͨ�����ȼ������ȷ����������ļ�
//    3.
import java.util.Scanner;


public class T2 {
	public static void main(String[] args) {
		//1.���뱨��
		Scanner sc = new Scanner(System.in); 
		while(sc.hasNextLine()) {
			String string = sc.nextLine();
			//System.out.println(string);
			solute(string);	
		}
		
	}
	
	public static void solute(String str) {
		if(str == null || str == "") {
			return;
		}
		String[] strs = str.split(" ");
		int start = 0;
		int count = 0;
		
		boolean flag = false;
		//1.�����ַ�������
		for(int i=0;i<strs.length;i++) {
			if(i != 0 && "5a".equals(strs[i])) {
				//����У��
				if(str2int(strs[i-1]) == count -1) {
					//У��ɹ�  ���д�ӡ
					print(strs,start,i);
					flag = true;
				}
				//���¿�ʼ
				start = i;
				count = 0;
				
			}else if(!"5b".equals(strs[i]) && !"5a".equals(strs[i])) {
				count++;
			}
		}
		
		//��ӡ���һ��5a
		if(flag) {
			System.out.println("5a");
		}
	}// endVerify
	
	private static int str2int(String str) {
		int result = 0;
		if(str.length() == 1) {
			result = str.charAt(0) - '0';
		}else {
			result = (str.charAt(0) - '0')*10 + str.charAt(1) - '0';
		}
		return result;
	}// endstr2int
	
	private static void print(String[] strs, int start, int end) {
		for (int i = start; i < end; i++) {
			if(strs[i].length()==2) {
				System.out.print(strs[i] + " ");
			}else {
				System.out.print("0" + strs[i]+" ");
			}
		}
	}//endprint
}
