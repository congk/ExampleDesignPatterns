package example.abstract_factory;

public class ProductB implements IProduct {

	@Override
	public String getName() {
		return "Product_B";
	}

	@Override
	public double getPrice() {
		return 52;
	}
}
