package by.tc.task01.main;

import java.util.List;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {
	
	public static void print(List<Appliance> appliance) {
		for (Appliance a : appliance) {
			System.out.println("Applience name: " + a.getApplianceName() + "; Price: " + a.getPrice() + ";   Quantity: " + a.getQuantity() + ";");
		}
		
	}
	
	

}
