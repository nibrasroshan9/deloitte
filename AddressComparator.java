import java.util.Comparator;

public class AddressComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		if (o1.getCustomerAddress().compareTo(o2.getCustomerAddress())>0)
			return 0;
		else
			return -1;
	}

}
