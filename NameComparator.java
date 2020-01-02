import java.util.Comparator;

public class NameComparator implements Comparator<Customer>{
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		if (o1.getCustomerName().compareTo(o2.getCustomerName())>0)
			return 0;
		else
			return -1;
	}

}
