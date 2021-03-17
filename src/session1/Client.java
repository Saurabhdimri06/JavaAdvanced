package session1;

import java.util.*;
public class Client{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch, phone, access, model;
		PhoneOrderClass order = new PhoneOrderClass();
		PhoneRepairClass repair = new PhoneRepairClass();
		AccessoryRepairClass acc = new AccessoryRepairClass(); 
		
		System.out.println("Do you want to Repair, Order or purchase accessory the Phone");
		ch = sc.next();
		
		if(ch.equalsIgnoreCase("Order")) {
			System.out.println("Enter the Phone name");
			phone = sc.next();
			order.orderPhone(phone);
		}
		else if(ch.equalsIgnoreCase("Repair")) {
			System.out.println("Enter Model type to Repair");
			model = sc.next();
			repair.modelName(model);
		}
		else if(ch.equalsIgnoreCase("Purchase")) {
			System.out.println("Enter Accessory to Purchase");
			access = sc.next();
			acc.repair(access);
		}
		else {
			System.out.println("Wrong Choice!!");
		}
	}

}
