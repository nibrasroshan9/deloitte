import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> allData = new TreeMap<Integer, String>();
		allData.put(1099, "George");
		allData.put(1010, "Bibhu");
		
		System.out.println(allData);
	}
}
