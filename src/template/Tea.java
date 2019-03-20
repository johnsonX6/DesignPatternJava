package template;

public class Tea extends Beverage {

	@Override
	public void putIntoCup() {
		// TODO Auto-generated method stub
		System.out.println("put tea into cup...");
	}

	@Override
	public void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("add condiments tea...");
	}

	@Override
	public boolean isCustom() {
		// TODO Auto-generated method stub
		return false;
	}

}
