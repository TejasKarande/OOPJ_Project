package acts.cdac.acts.utilis;

import java.util.Comparator;

import in.cdac.acts.domain.Customer_Details;

public class idComparator implements Comparator<Customer_Details > {
	
	@Override
	public int compare(Customer_Details id1, Customer_Details id2) {
		
		return id1.getPan_id().compareTo(id2.getPan_id());
	}
	
	

}
