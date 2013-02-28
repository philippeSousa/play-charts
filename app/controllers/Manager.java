package controllers;

import java.util.ArrayList;

import models.Category;
import models.Product;
import play.mvc.Controller;

public class Manager extends Controller {

	public static void productList() {
		Product product1 = new Product();
		product1.name = "Advil";
		product1.price = 5;

		Product product2 = new Product();
		product2.name = "Tylenol";
		product2.price = 6;

		ArrayList<Product> listData = new ArrayList<Product>();
		listData.add(product1);
		listData.add(product2);
		System.out.println(listData);
		renderJSON(listData);
	}

	public static void echoVariables(String var1, int var2) {
		var1 = "foo";
		var2 = 4;

		Object[] words = { var1, var2 };
		ArrayList foo = new ArrayList();
		foo.add(new Object[] {"Foo", 3});
		foo.add(new Object[] {"Bar", 6});

		//

		renderJSON(foo);
	}
}