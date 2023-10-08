package mazeSolver;
import java.util.LinkedList;
public class Maze {
	static int[] [] maze= {
			{1,2,0,1},
			{1,1,1,0},
			{0,0,0,1}
	};
	//0=Wall
	//1=Path
	//2=Goal
	public static void main(String[] args) {
		LinkedList<Position>path=new LinkedList<>();
		Position p=new Position(0,3);
		path.push(p);
		
		
		
		while(true)
		{
			int x=path.peek().x;
			int y=path.peek().y;
			maze[y][x]=0;
			//Go Down			
			if(isValid(y+1,x) && maze[y+1][x]==2)
			{
				System.out.println("Moved Down.You Win");
				break;
			}
			
			else if(isValid(y+1,x) && maze[y+1][x]==1)
			{
				path.push(new Position(y+1,x));
				//maze[y+1][x]=0;
				System.out.println("Moved Down");
				continue;
			}
			//Go Left
			if(isValid(y,x-1)&& maze[y][x-1]==2)
			{
				System.out.println("Moved Left.You Win");
				break;
			}
			else if(isValid(y,x-1) && maze[y][x-1]==1)
			{
				path.push(new Position(y,x-1));
				//maze[y+1][x]=0;
				System.out.println("Moved Left");
				continue;
			}
			//Go Up
			if(isValid(y-1,x) && maze[y-1][x]==2)
			{
				System.out.println("Moved Up.You Win");
				break;
			}
			else if(isValid(y-1,x) && maze[y-1][x]==1)
			{
				path.push(new Position(y-1,x));
				//maze[y+1][x]=0;
				System.out.println("Moved Up");
				continue;
			}
			//Go Right
			if(isValid(y,x+1) && maze[y][x+1]==2)
			{
				System.out.println("You Win");
				break;
			}
			else if(isValid(y,x+1) && maze[y][x+1]==1)
			{
				path.push(new Position(y,x+1));
				//maze[y+1][x]=0;
				System.out.println("Moved Right");
				continue;
			}
			path.pop();
			if(path.size()==0)
			{
				System.out.println("No Path");
				break;
			}
		}
		
	}
	public static boolean isValid(int y,int x)
	{
		try {
			int something=maze[y][x];
		}
		catch(IndexOutOfBoundsException e)
		{
			return false;
		}
		return true;
	}

}
