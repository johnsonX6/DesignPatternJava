package watcher.pull;

import java.util.ArrayList;
import java.util.List;

import watcher.pull.Observer;

/**
 * 
 * @author qzhen
 *	class:³éÏóÖ÷Ìâ
 */
public abstract class Subject {

	private List<Observer> list=new ArrayList<Observer>();
	
	public void attach(Observer observer){
		list.add(observer);
	}
	
	public void detach(Observer observer){
		list.remove(observer);
	}
	
	public void notifyObservers(){
		for(Observer obs:list){
				obs.update(this);
		}
	}
	
}
