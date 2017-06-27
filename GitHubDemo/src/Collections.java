import java.util.ArrayList;
import java.util.Iterator;

public class Collections {

	public static void main(String[] args) {
		arraylist();
		

	}

	private static void arraylist() {
		ArrayList<String> name= new ArrayList<String>();
		
		name.add(0, "Richa");
		
		name.add(1, "Sara");
		
		Iterator<String> itr= name.iterator();
		
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
		
	}

}
