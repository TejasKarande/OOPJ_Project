package in.cdac.acts.main;

import java.util.Arrays;
import java.io.Serializable;
import java.util.*;
import java.security.KeyStore.Entry;
import java.util.Scanner;
import acts.cdac.acts.utilis.idComparator;
import in.cdac.acts.SystemTest.SystemTest;
import in.cdac.acts.domain.Customer_Details;
import in.cdac.acts.domain.Showroom_Data;

enum CarShowRoom{
	EXIT ,ADDNEWCUSTOMER , FINDCUSTOMERCARDETAILS , REMOVECUSTOMERDETAILS , SORTING , PRINTDETAILS  
}

class Enum_CarShowRoom{
	 private static Scanner sc = new Scanner(System.in);
	public static CarShowRoom displayMenu_List() {
		System.out.println("0.LOGOUT FROM APPLICATION");
		System.out.println("1.ADD CUSTOMER DETAILS");
		System.out.println("2.FIND CUSTOMOER DETAILS BY PAN ID");
		System.out.println("3.REMOVE CUSTOMER DETAILS BY PAN ID");
		System.out.println("4.SORT BY USING PAN ID");
		System.out.println("5.PRINT DETAILS ");
		System.out.print("Enter the Choice = ");
		int choice = sc.nextInt();
		return CarShowRoom.values()[choice];
	}
}



public class CarShowRoom_Management_System{
		private static Scanner sc = new Scanner(System.in);
	


		private static Customer_Details[] getkeys(){
			Customer_Details[] arr = new Customer_Details[5];
			arr[0] = new Customer_Details("Suraj Kawale","9563211452","surajkawale@gmail.com","GKJASIK5623H");
			arr[1] = new Customer_Details("Tejas Karande","9569772332","tejaskarande1@gmail.com","DFRDGHS1245F");
			arr[2] = new Customer_Details("Suhas Madane","8569772342","suhasmadane1@gmail.com","SFF2548SD142");
			arr[3] = new Customer_Details("Sachin Kadam","8652415987","sachinkadam12@gmail.com","PES6548SD149");
			arr[4] = new Customer_Details("Vaibhav Yergude","9665772331","vyergude23@gmail.com","Sdf6548SD149");
				return arr;
			}

		
		private static Showroom_Data[] getValues(){
			Showroom_Data[] arr = new Showroom_Data[5];
			arr[0] = new Showroom_Data("Maruti Suzuki Swift","Swift-Lxi","Red",720250.23,"24/10/2022","04/02/2023");
			arr[1] = new Showroom_Data("Maruti Suzuki Baleno","Delta AMT","Blue",1220750.23,"12/12/2022","12/04/2023");
			arr[2] = new Showroom_Data("Maruti Suzuki Brezza","LXI","White",1020750.23,"02/01/2022","26/04/2023");
			arr[3] = new Showroom_Data("Maruti Suzuki Celerio","VXI","Blue",520750.23,"13/02/2022","27/04/2023");
			arr[4] = new Showroom_Data("Maruti Suzuki Ertiga","ZXI+","Silver",1123745.23,"01/03/2022","30/04/2023");

			return arr;
		}


	

	public static void main(String[] args) {
		
		
		System.out.println("==========================================================================================================================================================================================================");
		System.out.println();
		System.out.println("                          	WELCOME  TO CAR SHOWROOM MANAGEMENT SYSTEM                                                         ");
		System.out.println();
		System.out.println("==========================================================================================================================================================================================================");
		System.out.println();
		System.out.print("Enter the Login id  = ");
		String loginid = sc.nextLine();
		if(loginid.equals("Admin"))
		{
			System.out.print("Enter the Password = ");
			String password = sc.nextLine();
			System.out.println();
			System.out.println("==========================================================================================================================================================================================================");
				
			if(password.equals("Admin@123"))
			{
					SystemTest test = new SystemTest();
					String[] pan_id = new String[1];
					
					Customer_Details[] keys = CarShowRoom_Management_System.getkeys();
					Showroom_Data[] Values = CarShowRoom_Management_System.getValues();
					test.addCustomer(keys , Values);
					
					
				
						System.out.println();
						try {

						CarShowRoom choice = Enum_CarShowRoom.displayMenu_List();
						while(choice!=CarShowRoom.EXIT) {
								 
						switch(choice) {
							
						case ADDNEWCUSTOMER :System.out.println("Want to Update List : 1.YES 2.NO");
											 int ch = sc.nextInt();
											 if(ch==1) {
											  Customer_Details[] arr = test.addNewCustomer();
											  Showroom_Data[] ar = test.addNewShowroomData();
						                      test.addCustomer(arr , ar);
											 }
											 test.printEntries();
						                      break;
							
						case FINDCUSTOMERCARDETAILS :
											sc.nextLine();
											System.out.print("Enter the Pan Id = ");
											pan_id [0]= sc.nextLine();
											Showroom_Data value = test.findCarDetails(pan_id[0]);
											if(value != null)
											{
												System.out.println("Customer Car Details are =");
												test.printRecord(value);
											}	
											else
												System.out.println("Customer Data Not Found");
											break;
						
						case REMOVECUSTOMERDETAILS :
											sc.nextLine();
											System.out.print("Enter the Pan Id = ");
											pan_id [0]= sc.nextLine();
											test.removeCustomerDetails(pan_id[0]);
											break;
											
						case SORTING : test.sortbykey(new idComparator());
										break;
													
										
										
						
						
										
						case PRINTDETAILS : test.printEntries();
											break;
											
											
							}
								choice = Enum_CarShowRoom.displayMenu_List();
						}
						}catch(Exception ex )
						{
							System.out.println("Input Mismatch with List");
						}
						System.err.println("Successfully Logout!!!");
				}					
		
				else 
					System.err.println("Invalid Password");
				}
			
		else
			System.err.println("Invalid Login id");
			
}

}	
	
		
		



		

	





