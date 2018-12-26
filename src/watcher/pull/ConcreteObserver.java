package watcher.pull;


public class ConcreteObserver implements Observer{
	
	private String state;

	@Override
	public void update(Subject subject) {
		// TODO Auto-generated method stub
		this.state=((ConcreteSubject) subject).getState();
	}
	
}
