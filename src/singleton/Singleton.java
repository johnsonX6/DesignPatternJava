package singleton;
/**
 * 单例模式 --DoubleChecked
 * @author qzhen
 * 优点：线程安全 加载速度快 延迟加载
 */
public class Singleton {
	
	private Singleton(){	};
	
	public  static volatile Singleton singleton;
	
	public static Singleton getInstance(){
		if(singleton==null){
			synchronized(Singleton.class){
				if(singleton==null){
				singleton=new Singleton();
			}
			}
		}
		
		return singleton;
	}
	
}
