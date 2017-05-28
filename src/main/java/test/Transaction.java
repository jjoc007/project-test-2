package test;

public class Transaction {

	private static final int QUANTITY = 5;

	public boolean sellProduct(Product product) {

		long totalValue = Util.calculateTotalValue(product, QUANTITY);

		// TODO Automatic sell process to implement ...

		return true;
	}

}
