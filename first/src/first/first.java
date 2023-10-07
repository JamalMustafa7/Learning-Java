package first;
import java.util.Scanner;
public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("jamal");
		Scanner s=new Scanner(System.in);
		String name=s.next();
		s.close();
		if(s.equals("jamal"))
		{
			System.out.println("Hey Jamal");
		}
		else {
			System.out.println("You are not allowed here");
		}
		}

}
