package Interview;

import java.util.*;
import java.util.Map.Entry;

public class CollectionExamples {
	public static void main(String[] args) {
		
	
	Pet pet1 = new Pet("Pamuk", 4);
	Pet pet2 = new Pet("Karamel", 3);
	Pet pet3 = new Pet("Bidik", 7);
	Pet pet4 = new Pet("Bugday", 13);
	Pet pet5 = new Pet("Obito", 17);
	Comparator<Pet> ageCom=Comparator.comparing(p->-p.age);//- to sort in desc order
	Comparator<Pet> nameCom=Comparator.comparing(p->p.name.substring(0,3));//sorts acc to first 3 letters of the names
	TreeSet<Pet> pets = new TreeSet<>(nameCom);
	List<Pet> petList=new ArrayList<>();
	//Comparator<Pet> petCom=Comparator.comparing(p->p.age);
	Map<Integer,Pet> petMap=new HashMap<>();
	
	petMap.put(102, pet2);
	petMap.put(105, pet5);
	petMap.put(103, pet3);
	petMap.put(101, pet1);
	petMap.put(104, pet4);
	
	System.out.println(petMap);
	Set<Entry<Integer, Pet>> myPets = petMap.entrySet();
	
	for(Entry<Integer,Pet> myPet: myPets) {
		System.out.println(myPet);
		System.out.println(myPet.getValue().name+", "+myPet.getValue().age);
	}
	pets.add(pet1);
	pets.add(pet2);
	pets.add(pet3);
	pets.add(pet4);
	pets.add(pet5);
	//System.out.println("sorted according to names:"+pets);
	petList.add(pet1);
	petList.add(pet4);
	petList.add(pet3);
	
	petList.add(pet2);
	petList.add(pet5);
	//System.out.println(petList);
	
	Comparator<Integer> keyCom=Comparator.comparing(n->-n);
	
	SortedMap<Integer,Pet> soMap=new TreeMap<>(keyCom);
	
	soMap.put(101, pet1);
	soMap.put(102, pet2);
	soMap.put(103, pet3);
	soMap.put(104, pet4);
	soMap.put(105, pet5);
	System.out.println(soMap);
	}
}
