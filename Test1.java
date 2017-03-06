package Maven;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary,rank=0;
		double total=0;
		double a[]={0,0.03,0.1,0.2,0.25,0.3,0.35,0.45};
		int    b[]={0,0,1500,4500,9000,35000,55000,80000};
		System.out.print("请输入工资:");
		Scanner in=new Scanner(System.in);
		salary=in.nextInt()-3500;
		System.out.println(salary);
		if (salary<0)
			rank=0;
		else if(salary<1500)
			rank=1;
		else if(salary<4500)
			rank=2;
		else if(salary<9000)
			rank=3;
		else if(salary<35000)
			rank=4;
		else if(salary<55000)
			rank=5;
		else if(salary<80000)
			rank=6;
		else rank=7;
		System.out.println(rank);
		for(int temp=0;temp<=rank;temp++)
		{
			if(temp<rank){
				total=total+(b[temp+1]-b[temp])*a[temp];
				System.out.println((b[temp+1]-b[temp])*a[temp]);}
			else{
				total=total+(salary-b[temp])*a[temp];
			System.out.print((salary-b[temp])*a[temp]);}
		}
		System.out.print("所需缴纳的税费为："+total);
	}

}
