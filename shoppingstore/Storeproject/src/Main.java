package project;

import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	static void menu() {
		System.out.println("1-Add produts");
		System.out.println("2-remove");
		System.out.println("3-list products");
		System.out.println("4-search the products");
		System.out.println("5-Edit the products");
	}
	public static void main(String[] args) {
		int opt;
		Scanner sc=new Scanner(System.in);
		ArrayList<inventory> InventoryList = new ArrayList<inventory>();
		do {
			inventory i = new inventory();
			menu();
			opt=sc.nextInt();
			switch(opt) {
			case 1:
				System.out.println("Enter id");
				i.setid(sc.nextInt());
				System.out.println("Enter name");
				i.setname(sc.next().charAt(0));
				System.out.println("Enter price");
				i.setprice(sc.nextInt());
				System.out.println("Enter stockitemcount");
				i.setstockitemcount(sc.nextInt());
				i.addproducts(i);
				InventoryList.add(i);
			break;
			case 2:
//				i.remove(inventoryList);
			break;
			case 3:
			break;
			case 4:
			break;
			case 5:
			break;
			default:
				break;
			}
			
		}while(opt!=0);
	}
}