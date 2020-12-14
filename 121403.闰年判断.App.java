package App;

import java.util.Iterator;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("输入年份:");
		int year=scan.nextInt();
		if(year==0){
			System.out.println("公元分界线，既不是平年也不是闰年");
		}
		if(year<0){
		
			year=-year;
			if(year%4==0&&year%100!=0||year%400==0){
				System.out.print("公元前"+year+"年是："+"闰年");
			}else
			{
				System.out.print("公元前"+year+"不是闰年");
			}
			scan.close();
		}else if (0<year&&year<3200) {
			if(year%4==0&&year%100!=0||year%400==0){
				System.out.print("公元"+year+"年是："+"闰年");
			}else
			{
				System.out.print("公元"+year+"不是闰年");
			}
			scan.close();
		}
		
	}
}
