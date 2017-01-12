package example.abstract_factory;

public class ProductBFactory extends AbstractFactory {
	
	private static ProductBFactory _instance = null;
	
	public static ProductBFactory getInstance(){
		return _instance != null ? _instance : (_instance = new ProductBFactory());
	}
	
	@Override
	public IProduct createProduct() {
		return new ProductB();
	}
}
