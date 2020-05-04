package huawei;
//华为常规批实习生笔试    date:2020.04.22
//要求:    输入一段字符串(字符串连续 中间不含空格 这个条件题目没有给出  是隐含的)  
//       输出其中的数字字符   并将数字大小从小到大排序  重复数字不合并
//
//思路  这题是对数字按大小进行排序   要参与排序的其实只有0-9十个数字
//所以可以使用统计排序  用数组中的元素a[i]来记录大小为i的数字的个数
import java.util.Scanner;


public class T1 {  
	public static void main(String[] args) {
		//输入   将屏幕的输入保存到字符串str中
		Scanner sc = new Scanner(System.in);	
		String str = sc.next();
		//处理并输出
		solute(str);
	}	
	public static void solute(String str) {
		//1.判断str是否为空
		if(str == null ||str =="") {
			return;
		}
		//辅助数组  ***** 基于桶排序的思想
		int[] assist = new int[10];
		//2.遍历字符串
		for(int i = 0;i<str.length();i++) {
			//判断输入的是否为数字
			//if((str.charAt(i)-'0')>=0 && (str.charAt(i)-'0')<=9){
			if((str.charAt(i)>='0') && (str.charAt(i)<='0')){
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
