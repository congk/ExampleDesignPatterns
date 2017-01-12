package example.abstract_factory;

public class ProductAFactory extends AbstractFactory {

	private static ProductAFactory _instance = null;
	
	public static ProductAFactory getInstance(){
		return _instance != null ? _instance : (_instance = new ProductAFactory());
	}
	
	@Override
	public IProduct createProduct() {
		return new ProductA();
	}
}
