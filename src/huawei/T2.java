package huawei;
//笔试第二题   关于网络报文的编码解码
//要求  ： 1.检测报文是否满足T报文的格式要求  包括开始符  结束符和转义符   并进行长度检验
//    2.将满足T报文格式且通过长度检验的正确报文输出到文件
//    3.
import java.util.Scanner;


public class T2 {
	public static void main(String[] args) {
		//1.输入报文
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
		//1.遍历字符串数组
		for(int i=0;i<strs.length;i++) {
			if(i != 0 && "5a".equals(strs[i])) {
				//进行校验
				if(str2int(strs[i-1]) == count -1) {
					//校验成功  进行打印
					print(strs,start,i);
					flag = true;
				}
				//更新开始
				start = i;
				count = 0;
				
			}else if(!"5b".equals(strs[i]) && !"5a".equals(strs[i])) {
				count++;
			}
		}
		
		//打印最后一个5a
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
