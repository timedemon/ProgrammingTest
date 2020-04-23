package huawei;
//华为常规批实习生笔试    date:2020.04.22
//要求：    输入一段字符串  输出其中的数字字符   并将数字大小从小到大排序  重复数字不合并


import java.util.Scanner;


public class T1 {  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		String str = sc.next();
		solute(str);
	}	
	public static void solute(String str) {
		//1.判断str是否为空
		if(str == null ||str =="") {
			return;
		}
		//辅助数组
		int[] assist = new int[10];
		//2.遍历字符串
		for(int i = 0;i<str.length();i++) {
			//判断输入的是否为数字
			if((str.charAt(i)-'0')>=0 && (str.charAt(i)-'0')<=9){
				assist[str.charAt(i)-'0']++;
			}		
		}//end for
		
		//3.向屏幕输出结果
		for(int i=0;i<10;i++) {
			while(assist[i]>0) {
				System.out.print(i);
				assist[i]--;
			}
		}
	}
}
