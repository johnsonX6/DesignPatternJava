package watcher;
/**
 * 
 * @author qzhen
 *	client调用
 */
public class Client {
		
	public static void main(String[] args) {
		ConcreteSubject subject=new ConcreteSubject();
		Observer observer=new ConcreteObserver();
		subject.attach(observer);
		subject.change("State更改为："+"state1");
	}
}
