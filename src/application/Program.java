package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String nameClient = sc.nextLine();
		System.out.print("Email: ");
		String emailClient = sc.next();
		System.out.print("Birth Date (DD/MM/YYYY): ");
		Date birth = sdf.parse(sc.next());
		Client client = new Client(nameClient, emailClient, birth);
		
		System.out.println();
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.println();
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		for(int i = 1;i <= n; i ++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String nameProduct = sc.nextLine();
			System.out.print("Product price: ");
			double priceProduct = sc.nextDouble();
			
			Product product = new Product(nameProduct, priceProduct);
			
			System.out.print("Quantity: ");
			int quantityProduct = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(quantityProduct, priceProduct, product);
			order.addItem(orderItem);	
			System.out.println();
		}
		
		System.out.println("ORDER SUMARY");
		System.out.println(order);
		
		sc.close();
	}

}
