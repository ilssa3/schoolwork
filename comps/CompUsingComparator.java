package comps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class CompUsingComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog ("snoopy"));
		dogs.add(new Dog ("zak"));
		dogs.add(new Dog ("rex"));
		dogs.add(new Dog ("herra"));
		dogs.add(new Dog ("alpha"));
		
		for (int i = 0;i<dogs.size();i++) {
			System.out.println(dogs.get(i));
		}
		//Collections.sort( dogs);
		System.out.println("-----------------------");
		for (int i = 0;i<dogs.size();i++) {
			Collections.sort(dogs,new  CompareDogs());
			System.out.println(dogs.get(i));
		}
	}



 public static class CompareDogs implements Comparator<Dog>{

	@Override
	public int compare(Dog o1, Dog o2) {
return o1.getName().compareTo(o2.getName());	
		
		} 
 	}
 }