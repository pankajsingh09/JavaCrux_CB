package queue;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
	
	public static void main(String[] args) {
		HashMap<Character,Integer> map=new HashMap<>();
		Queue<Character> q=new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
	
			q.add(c);
			if(map.containsKey(c))
			{
				int x=map.get(c);
				x=x+1;
				map.put(c, x);
			}
			else
			{
				map.put(c, 1);
			}
			while(!q.isEmpty()) {
				
				char ch=q.peek();
				if(map.get(ch)==1)
				{
					System.out.print(ch);
					break;
				}
				else
				{
					q.poll();
				}
				
			}
			
			if(q.isEmpty())
			{
				System.out.print("#");
			}
			
				
		}
	}

}
