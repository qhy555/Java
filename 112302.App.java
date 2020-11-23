package pac;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws InterruptedException {	
		int array[][]={{500,600},
		{888,777},
		{7,9},
		{5,20},
		
};
		while (true) {
			Thread.sleep(2000);	
			System.out.println("两秒一个坐标");
			int num=(int)(Math.random()*10%4);
		System.out.println("("+array[num][0]+","+array[num][1]+")");
		
		}
		
	}   
}
	
