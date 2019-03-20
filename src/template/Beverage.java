package template;
/**
 * 抽象类模板
 * @author qzhen
 *  将相同步骤的业务抽离出来，然后在子类实现特有的步骤
 */
public  abstract class Beverage {
		
	public final void prepareTemplate(){
		boilWater();
		putIntoCup();
		addHotWater();
		if(isCustom()){
		addCondiments();
		}
	}
	
	private void boilWater(){
		System.out.println("boil Water");
	}
	
	public abstract void putIntoCup();
	
	private void addHotWater(){
		System.out.println("add hot water");
	}
	
	public abstract void addCondiments();
	
	public abstract boolean isCustom();
}
