import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class Iterateable {

	public static void main(String[] args) {
		ArrayList<String> name=new ArrayList<String>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size of ArrayList: ");
		int size=s.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter element "+i+" of ArrayList: ");
			name.add(s.next());
		}
		Iterator <String>it =name.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
//		for(int i=0;i<size;i++)
//		{
//			System.out.println(name.get(i));
//		}
		s.close();
	}

}
