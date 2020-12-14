package App;

import java.util.Iterator;

public class App {
	public static void main(String[] args) {
		
		long sum=0;
		for (int i = 0; i <2147483647; i++) {
		if (i%2==0) {
			sum=i+sum;	
		}
		}
		System.out.println("1+3+5+7+...+2147483647奇数为："+sum);
	}

}
