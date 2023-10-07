package first;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
public class first {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s=new Scanner(new File("info.txt"));
		ArrayList<String> names=new ArrayList<String>();
		while(s.hasNextLine())
		{
			names.add(s.nextLine());
		}
		for(int i=0;i<names.size();i++)
		{
			System.out.println(names.get(i));
		}
		s.close();
		
	}
}
 