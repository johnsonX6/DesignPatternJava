package template;

public class Coffee extends Beverage {

	@Override
	public void putIntoCup() {
		// TODO Auto-generated method stub
		System.out.println("put coffee in cup...");
	}

	@Override
	public void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("put coffee condiments...");
	}

	@Override
	public boolean isCustom() {
		// TODO Auto-generated method stub
		return true;
	}

}
