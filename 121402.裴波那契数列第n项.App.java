package App;

import java.util.Iterator;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int n=scanner.nextInt();
		int fn =num(n);
		System.out.println("裴波那契数列的第n项为:"+fn);
	}

	
	public static int num(int n) {
		int fn=0;
		if (1<=n&n<=40) {
			fn=2;
		}
		return fn;


	}
}
