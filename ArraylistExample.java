package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArraylistExample {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		

		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	   ArrayList<String> a=new ArrayList<String>();
	   ArrayList<String> b=new ArrayList<String>();
		int temp=0;
		while(temp==0)
		{
			String po=r.readLine();
			String ln=r.readLine();
		
			
			
			if(a.contains(po) && a.contains(ln))
			{
				
				break;
			}
			
//			else if (a.contains(po) && !a.contains(ln)) {
//				a.add(po);
//				a.add(ln);
//			}
//			else if (!a.contains(po) && a.contains(ln)) {
//				a.add(po);
//				a.add(ln);
//			}
				
				else 
				{
					a.add(po);
					a.add(ln);
				}
				
				
				
//				ArrayList<String> b;
//				b=a.get(ts);
//				if(a.containsKey(ts) && b.contains(rs))
//				{
//					break;
//				}
//				b.add(rs);
//				a.put(ts,b);
//			}
//			else
//			{
//				ArrayList<String> b=new ArrayList<String>();
//				b.add(rs);
//				a.put(ts, b);
//				b=null;
			System.out.println("Do You want to continue? If yes , enter 0 else 1");
			temp=Integer.parseInt(r.readLine());
		}
		System.out.println(a);
	

	}

}
