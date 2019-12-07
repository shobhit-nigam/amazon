
package mahabharat;

import java.util.*;

public class Kaurav {
	public static void main(String args[]){
		ArrayList<String> k = new ArrayList<String>();
		k.add("Duryodhana");
		k.add("Dushasan");
		k.add("Dushala");
		k.add("and 98 more");
		
		Iterator itr = k.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());	
		}	
		System.out.println(itr.next());
		
	}

}
