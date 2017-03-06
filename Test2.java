import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date=new String();
		int year,mon,day;
		int[] a={1,3,5,7,8,10,12};
		System.out.println("日期输入的格式为(2015-07-26):");
		Scanner in=new Scanner(System.in);
		date=in.next();
		year=Integer.parseInt(date.substring(0, 4));
		mon=Integer.parseInt(date.substring(5,7));
		day=Integer.parseInt(date.substring(8,10));
		if((mon==1 || mon==3 || mon==5 || mon==7 || mon==8 || mon==10 || mon==12)&&day>31)
			System.out.println("格式有误!");
		else if(mon==2 && day>28)
			System.out.println("格式有误!");
		else if(day>30)
			System.out.println("格式有误!");
		else
		System.out.println("下一天为"+year+"-"+mon+"-"+(day+1));
	}

}
