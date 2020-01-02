import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIterator {
	public static void main(String[] args) {
		HashMap<String, Double> hm = new HashMap<String, Double>();
		
		hm.put("John Doe", new Double(3434.34));
		hm.put("Tom Hardy", new Double(123.22));
		hm.put("Brad Pitt", new Double(5422.10));
		hm.put("John Carpenter", new Double(99.22));
		hm.put("Carles Puyol", new Double(5005.98));
		hm.put("Ralph Jonas", new Double(125.57));
		
		Set set = hm.entrySet();
		
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			System.out.print(me.getKey()+" : ");
			System.out.println(me.getValue());
		}
		
		double balance = ((Double)hm.get("John Doe")).doubleValue();
		hm.put("John Doe", new Double(balance+1000));
		
	}
}
