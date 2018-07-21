package singleton;
/**
 * 懒汉式-非线程安全,不适用多线程环境
 * @author qzhen
 *
 */
public class SingletonNotSafe {
	
	public static  SingletonNotSafe singleton;
	
	private SingletonNotSafe(){};
	
	public SingletonNotSafe getInstance(){
		if(singleton==null){
			singleton=new SingletonNotSafe();
		}
		return singleton;
	}
	
}
