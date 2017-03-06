import java.util.LinkedList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new LinkedList<Integer>();
		for(int i=0;i<50;i++)
		{
			int x=50+(int)(Math.random()*100);
			list.add(x);
			System.out.println(x);
		}
	}

}
