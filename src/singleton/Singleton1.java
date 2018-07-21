package singleton;
/**
 * 饿汉式-使用静态变量，线程安全 未实现懒加载
 * @author qzhen
 *
 */
public class Singleton1 {

	private Singleton1(){};
	
	private static final Singleton1 singleton=new Singleton1();
	
	public static Singleton1 getInstance(){
		return singleton;
	}
}
