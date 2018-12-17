package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicketSort {

	public static void main(String[] args) {
		
		System.out.println(specials("kitchen"));
	}
	public static List<Map<String,Object>> specials(String item){
		List<Map<String, Object>> ticketList = new ArrayList<>();
		List<Map<String, Object>> highest = new ArrayList<>();
		List<Integer> codes = new ArrayList<>();
		List<Object> catogories = new ArrayList<>();
		List<Double> prices = new ArrayList<>();

		codes.add(101);
		codes.add(102);
		codes.add(103);
		codes.add(104);
		codes.add(105);
		codes.add(106);
		codes.add(107);
		codes.add(114);
		codes.add(116);
		catogories.add("kitchen");
		catogories.add("garden");
		catogories.add("kitchen");
		catogories.add("kitchen");
		catogories.add("textile");
		catogories.add("clothing");
		catogories.add("kitchen");
		catogories.add("appliance");
		catogories.add("furniture");
		prices.add(24.99);
		prices.add(130.55);
		prices.add(33.45);
		prices.add(55.99);
		prices.add(25.20);
		prices.add(22.99);
		prices.add(16.99);
		prices.add(355.99);
		prices.add(578.99);
		
		for (int i = 0; i < prices.size(); i++) {
			Map<String, Object> ticket = new HashMap<>();
			ticket.put("code", codes.get(i));
			ticket.put("category", catogories.get(i));
			ticket.put("price", prices.get(i));
			ticketList.add(ticket);
		}
		System.out.println(ticketList);
		for (int j = 0; j < ticketList.size(); j++) {
			//System.out.println(ticketList.get(j));
		}

		List<Double> p = new ArrayList<>();
		for (int k = 0; k < ticketList.size(); k++) {
			p.add((Double) ticketList.get(k).get("price"));
		}
		System.out.println(p);
		Comparator<Double> dpCom = Comparator.comparing(d -> -d);
		Collections.sort(p, dpCom);
		System.out.println(p);
		
		for (int l = 0; l < 3; l++) {
			for (int n = 0; n < ticketList.size(); n++) {
				if (p.get(l) == ticketList.get(n).get("price")) {
					highest.add(ticketList.get(n));
					
					//ticketList.get(n).remove("code");
				}
			}
		}
		return highest;
	}

}
