package in.cdac.acts.SystemTest;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map.Entry;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.io.Serializable;
import javax.naming.ldap.SortKey;
import java.util.Scanner;
import acts.cdac.acts.utilis.idComparator;
import java.util.Set;
import in.cdac.acts.domain.Customer_Details;
import in.cdac.acts.domain.Showroom_Data;
import java.util.*;

public class SystemTest {
	
	 static int n ; 
	
		Map<Customer_Details , Showroom_Data > map = new HashMap<>();
		

		public void addCustomer(Customer_Details[] keys, Showroom_Data[] values) {
			if(this.map!=null) {
			for( int index = 0; index < keys.length; ++ index ) {
				Customer_Details key = keys[ index ];
				Showroom_Data value = values[ index ];
				this.map.put(key, value);
	
			}
			}
			
		}
		
		

		public Showroom_Data findCarDetails(String panid) {
			if(this.map!=null) {
			Customer_Details key = new Customer_Details();
			key.setPan_id(panid);
			if(map.containsKey(key)) {
				Showroom_Data value = this.map.get(key);
				return value;
			}
			}
			return null;
		}
		
		public void removeCustomerDetails(String panid) {
			if(this.map != null) {
			Customer_Details key = new Customer_Details();
			key.setPan_id(panid);
			if( map.containsKey(key)) {
				Showroom_Data value = this.map.get(key);
				this.map.remove(key);
				System.out.println("Customer Removed Succesfully!!!");
			}
			else
				System.out.println("Customer Not Found!!!");
			}
			
		}
		
		
		
		public void printEntries() {
			System.out.println("==========================================================================================================================================================================================================");
			
				Set<Entry<Customer_Details, Showroom_Data>> entries = this.map.entrySet();
				for (Entry<Customer_Details, Showroom_Data> entry : entries) {
					Customer_Details key = entry.getKey();
					Showroom_Data value = entry.getValue();
					System.out.println(key+" "+value);
				}
			System.out.println("==========================================================================================================================================================================================================");
	}

		public void printRecord(Showroom_Data value) {
			System.out.println(value);
			
		}

		



		public Customer_Details[] addNewCustomer() {
			Scanner sc = new Scanner(System.in);
			{
				System.out.print("How Many Entries you Want to Add = ");
				n = sc.nextInt();
				Customer_Details[] arr = new Customer_Details[n];
				sc.nextLine();
				for(int i=0 ; i<n ;i++)
				{	System.out.println("Customer-"+i);
					System.out.print("Enter the Name = ");
					String name = sc.nextLine();
					System.out.print("Enter the Contact Number = ");
					String number = sc.nextLine();
					System.out.print("Enter the Email id = ");
					String emailid = sc.nextLine();
					System.out.print("Enter the Pan id = ");
					String panid = sc.nextLine();
					arr[i] = new Customer_Details(name , number , emailid , panid);
				}
				return arr;
			}
			
		}
		
	

	



		public Showroom_Data[] addNewShowroomData() {
				Scanner sc = new Scanner(System.in);
				Showroom_Data[] ar = new Showroom_Data[n];
				for(int i=0 ; i<n ;i++)
				{	
					System.out.print("Enter the Car Name= ");
					String carName = sc.nextLine();
					System.out.print("Enter the Model Number =");
					String modelno = sc.nextLine();
					System.out.print("Enter the Car Color= ");
					String color = sc.nextLine();
					System.out.print("Enter the Price =");
					double price = sc.nextDouble();
					System.out.print("Enter the Order Date = ");
					String orderDate = sc.next();
					sc.nextLine();
					System.out.print("Enter the Delivery Date =");
					String deliveryDate = sc.nextLine();
					ar[i] = new Showroom_Data(carName,modelno,color,price,orderDate,deliveryDate);
				}
				return ar;
		}



		public  void sortbykey(Comparator idComparator) {
			
			TreeMap<Customer_Details , Showroom_Data>sorted = new TreeMap<>(); 
			sorted.putAll(map);
			System.out.println("==========================================================================================================================================================================================================");
			for(Map.Entry<Customer_Details , Showroom_Data>entry : sorted.entrySet())
				System.out.println(entry.getKey()+" "+entry.getValue());
			System.out.println("==========================================================================================================================================================================================================");	
			
		}




		

			
		


	
		 
			
}
			
			