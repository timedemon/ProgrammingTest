package huawei;
//bw
import java.util.Scanner;

public class T3 {
public static void main(String[] args) {
	//1.输入m和k
	Scanner sc = new Scanner(System.in);
	int m = sc.nextInt();
	int k = sc.nextInt();
	int[] input = new int[m];
	for(int i = 0; i<m ; i++) {
		input[i] = sc.nextInt();
	}
	solute(input, k);
}

public static void solute(int[] value,int m) {
	if(value == null || value.length == 0) {
		return;
	}
	
	//求平均值
	int sum = 0;
	for (int i = 0; i < value.length; i++) {
		sum += value[i];
	}
	//System.out.println("hello");
	//
	int mid = sum/m;
	sum = 0;
	for(int i = 0;i<value.length; i++) {
		if(sum>=mid) {
			System.out.print("/ ");
			sum = 0;
		}
		sum+=value[i];
		System.out.print(value[i]);
		if(i!=value.length - 1) {
			System.out.print(" ");
		}
	}
	//System.out.println("hello");
}
}
