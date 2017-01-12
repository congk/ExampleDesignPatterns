package example.abstract_factory;

public class Game {
	
	public Game(){
		AbstractFactory factory = ProductAFactory.getInstance();
		IProduct product = createProduct(factory);
		//输出product的名称
		String name = product.getName();
	}
	
	public IProduct createProduct(AbstractFactory factory){
		return factory.createProduct();
	}
}