import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CustomerIterator {

	public static void main(String[] args) {
		List<Customer> allCustomers = new ArrayList<Customer>();
		Customer a = new Customer(1101, "Nibras", "Calicut", 40000);
		Customer b = new Customer(1102, "George", "Kochi", 150000);
		Customer c = new Customer(1103, "Manu", "Trivandrum", 75000);
		allCustomers.add(a);
		allCustomers.add(b);
		allCustomers.add(c);
		
		System.out.println(allCustomers);
		Iterator<Customer> i = allCustomers.iterator();
		
		while(i.hasNext()) {
			Customer cust = i.next();
			System.out.println(cust);
		}
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Select field to sort on. \n 1. Name \n 2.Address \n 3.Bill Amount \n");
		int choice = in.nextInt();
		in.close();
		
		if (choice==1) {
			Collections.sort(allCustomers, new NameComparator());
			
		}
		else if(choice==2) {
			Collections.sort(allCustomers, new AddressComparator());
		}
		else if(choice==3) {
			Collections.sort(allCustomers);

		}
		
		Iterator<Customer> i1 = allCustomers.iterator();
		
		while(i1.hasNext()) {
			Customer cust = i1.next();
			System.out.println(cust);
		}
	}

}
