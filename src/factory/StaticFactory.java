package factory;
/**
 * 静态工厂：工厂类，提供产品制造方法，要新增产品制造方法，只能修改工厂类
 * 						可改进为抽象工厂模式
 * @author qzhen
 *
 */
public class StaticFactory {
	
	private StaticFactory(){};
	
	public static Food getA(){
		return new ClassA();
	}
	
	public static Food getB(){
		return new ClassB();
	}
}
