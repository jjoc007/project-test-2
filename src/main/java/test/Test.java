package test;

public class Test {

	public static void main(String[] args) {

		Transaction transaction = new Transaction();
		transaction.sellProduct(createProduct());

		System.out.println("Sold !!!");
	}

	private static Product createProduct() {

		// TODO create a real product
		return null;
	}

}
