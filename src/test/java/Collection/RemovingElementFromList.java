package Collection;

import java.util.ArrayList;
import java.util.*;

public class RemovingElementFromList {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(10);
		list.add("ramesh");
		list.add(30);
		list.add(40);
		list.remove(String.valueOf("ramesh"));
		System.out.println(list);
		

		
	}

}
