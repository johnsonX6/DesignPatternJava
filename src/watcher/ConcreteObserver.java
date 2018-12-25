package watcher;

public class ConcreteObserver implements Observer{
	
	private String state;
	
	public void update(String state){
		System.out.println("State:"+state);
		this.state=state; 
	}
}
