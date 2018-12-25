package watcher;
/**
 * 
 * @author qzhen
 *	推模型：传入具体监听的状态
 */
public class ConcreteSubject extends Subject{
	
	private String state;
	
	public void change(String state){
		System.out.println("State:"+state);
		this.notifyAll(state);
		this.state=state;
	}
}
