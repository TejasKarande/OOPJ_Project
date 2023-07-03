package in.cdac.acts.domain;

import java.util.*;

public class Showroom_Data {
	       private String carname;
	       private String modelnumber;
	       private String colour ;                                                                                                                                                                                                                                                                                                                         
	       private double price;
	       private String dateoforder;
	       private String dateofdelivery;
	       
	       public Showroom_Data () {
				
			}
		   
		public Showroom_Data(String carname, String modelnumber, String colour, double price, String dateoforder,
				String dateofdelivery) {
			
			this.carname = carname;
			this.modelnumber = modelnumber;
			this.colour = colour;
			this.price = price;
			this.dateoforder = dateoforder;
			this.dateofdelivery = dateofdelivery;
		}

		public String getCarname() {
			return carname;
		}
		public void setCarname(String carname) {
			this.carname = carname;
		}
		public String getModelnumber() {
			return modelnumber;
		}
		public void setModelnumber(String modelnumber) {
			this.modelnumber = modelnumber;
		}
		public String getColour() {
			return colour;
		}
		public void setColour(String colour) {
			this.colour = colour;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getDateoforder() {
			return dateoforder;
		}
		public void setDateoforder(String dateoforder) {
			this.dateoforder = dateoforder;
		}
		public String getDateofdelivery() {
			return dateofdelivery;
		}
		public void setDateofdelivery(String dateofdelivery) {
			this.dateofdelivery = dateofdelivery;
		}
		
		
		
		@Override
		public String toString() {
			return String.format("%-30s%-20s%-20s%-20f%-20s%-20s ", this.carname, this.modelnumber, this.colour, this.price, this.dateoforder, this.dateofdelivery);
	
		}
	 

}
