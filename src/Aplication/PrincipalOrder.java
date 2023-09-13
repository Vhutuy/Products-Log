package Aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import Backstage.ImportedProduct;
import Backstage.Product;
import Backstage.UsedProduct;

public class PrincipalOrder {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		ArrayList<Product> list = new ArrayList<Product>();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter the number of Products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Produtct #" + i + " Data:");

			System.out.print("Cummon, used or Imported (c/u/i)? ");
			String perg = sc.next();

			if (perg.equalsIgnoreCase("C")) {
				System.out.print("Name: ");
				String name = sc.next();

				System.out.print("Price: ");
				double price = sc.nextDouble();

				Product objProduct = new Product(name, price);
				list.add(objProduct);
			} else if (perg.equalsIgnoreCase("u")) {
				System.out.print("Name: ");
				String name = sc.next();

				System.out.print("Price: ");
				double price = sc.nextDouble();

				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());

				Product objProduct = new UsedProduct(name, price, date, sdf);
				list.add(objProduct);
			} else if (perg.equalsIgnoreCase("i")) {
				System.out.print("Name: ");
				String name = sc.next();

				System.out.print("Price: ");
				double price = sc.nextDouble();

				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();

				Product objProduct = new ImportedProduct(name, price, customsFee);

				((ImportedProduct) objProduct).totalPrice(customsFee);

				list.add(objProduct);
			}

		}

		System.out.println("PRICE TAGS: ");
		for (Product i : list) {
			System.out.println(i.priceTag());
		}

		sc.close();
	}

}
