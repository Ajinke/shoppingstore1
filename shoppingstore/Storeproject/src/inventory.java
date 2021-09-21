package project;
import java.util.ArrayList;

public class inventory {
	private int id;
	private char name;
	private int price;
	private int stockitemcount;
	
	public void setid(int id) {
		this.id=id;
	}
	public int getid() {
		return this.id;
	}
	public void setname(char name) {
		this.name=name;
	}
	public char getname() {
		return this.name;
	}
	public void setprice(int price) {
		this.price=price;
	}
	public int getprice() {
		return this.price;
	}
	public void setstockitemcount(int stockitemcount) {
		this.stockitemcount=stockitemcount;
	}
	public int getstockitemcount() {
		return this.stockitemcount;
	}

	public void addproducts(inventory i) {
		this.id = i.id;
		this.name = i.name;
		this.price = i.price;
		this.stockitemcount = i.stockitemcount;
		
	}
	public void listproducts(ArrayList<inventory> arr) {
		for(inventory inventory : arr) {
			System.out.println("-----------------------------------");
			System.out.println("id :" + inventory.id);
			System.out.println("name :" + inventory.name);
			System.out.println("price :" + inventory.price);
			System.out.println("stockitemcount :" + inventory.stockitemcount);
			System.out.println("-----------------------------------------");
		}
	}
	}
	
	
