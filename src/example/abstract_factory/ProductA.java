package example.abstract_factory;

public class ProductA implements IProduct {

	@Override
	public String getName() {
		return "Product_A";
	}

	@Override
	public double getPrice() {
		return 50;
	}
}
