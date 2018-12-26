package watcher.pull;

import java.lang.reflect.Field;
/**
 * 
 * @author qzhen
 *	client调用
 */
public class Client {
		
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		ConcreteSubject subject=new ConcreteSubject();
		Observer observer=new ConcreteObserver();
		subject.attach(observer);
		subject.change("State更改为："+"state1");
		System.out.println("Observer state:"+Client.getField(((ConcreteObserver)observer),"state")); 
	}
	
	public static String getField(Object obj,String name){
		Class<? extends Object > cls=obj.getClass();
		String value=null;
		try {
			Field field=cls.getDeclaredField(name);
			field.setAccessible(true);
			try {
				value=field.get(obj).toString();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return value!=null?value:"";
	}
}
