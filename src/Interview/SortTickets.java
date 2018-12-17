package Interview;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static java.util.stream.Collectors.*;
import java.util.Comparator;



public class SortTickets {
public static void main(String[] args) throws Exception {
	
	List<Map<Integer,Object>> ticketList=new ArrayList<>();
	List<Integer> keys=new ArrayList<>();
	List<Object> catogories=new ArrayList<>();
	List<Double> prices=new ArrayList<>();
	Map<Integer,List<Object>> tickets=new HashMap<>();
	
	keys.add(101);
	keys.add(102);
	keys.add(103);
	keys.add(104);
	keys.add(105);
	keys.add(106);
	keys.add(107);
	catogories.add("baby");
	catogories.add("garden");
	catogories.add("home");
	catogories.add("kitchen");
	catogories.add("textile");
	catogories.add("clothing");
	catogories.add("grocery");
	prices.add(24.99);
	prices.add(130.55);
	prices.add(33.45);
	prices.add(55.99);
	prices.add(25.00);
	prices.add(22.99);
	prices.add(16.99);
	for(int i=0; i<7; i++) {
		List<Object> values=new ArrayList<>();
		values.add(catogories.get(i));
		values.add(prices.get(i));
		tickets.put(keys.get(i),values);
		
	}
	System.out.println(tickets);
	Comparator<Integer> priceCom=Comparator.comparing(t->-t);
	TreeMap<Integer,List<Object>> sortedTickets=new TreeMap<>(priceCom);
	for(int i=0; i<7; i++) {
		List<Object> values=new ArrayList<>();
		values.add(catogories.get(i));
		values.add(prices.get(i));
		sortedTickets.put(keys.get(i),values);
		
	}
	System.out.println(sortedTickets);
	
	
}
}
