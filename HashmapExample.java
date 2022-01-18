package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashmapExample {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	    Map<String, ArrayList<String>> a=new HashMap<String,ArrayList<String>>();
		int temp=0;
		while(temp==0)
		{
			String ts=r.readLine();
			String rs=r.readLine();
			if(a.containsKey(ts))
			{
				ArrayList<String> b;
				b=a.get(ts);
				if(a.containsKey(ts) && b.contains(rs))
				{
					break;
				}
				b.add(rs);
				a.put(ts,b);
			}
			else
			{
				ArrayList<String> b=new ArrayList<String>();
				b.add(rs);
				a.put(ts, b);
				b=null;
			}
			System.out.println("Do You want to continue? If yes , enter 0 else 1");
			temp=Integer.parseInt(r.readLine());
		}
		System.out.println(a);
	
	}

}
