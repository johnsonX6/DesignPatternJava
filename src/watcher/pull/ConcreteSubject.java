package watcher.pull;
/**
 * 
 * @author qzhen
 *	拉模型：传入具体监听的状态
 */
public class ConcreteSubject extends Subject{
	
	private String state;
	
	public String getState(){
		return state;
	}
	
	public void change(String state){
		this.state=state;
		System.out.println("State:"+state);
		this.notifyObservers();
	}
}
