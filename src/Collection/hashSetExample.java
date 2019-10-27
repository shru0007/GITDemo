package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("INDIA");
		hs.add("UK");
		hs.add("USA");
		hs.add("AUSTRALIA");
		hs.add("IRELAND");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		
		Iterator<String> i =hs.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
	}

}
