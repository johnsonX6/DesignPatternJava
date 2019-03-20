package template;

public class Test {
	public static void main(String[] args) {
			Beverage tea=new Tea();
			tea.prepareTemplate();
			System.out.println("line split......");
			Beverage coffee=new Coffee();
			coffee.prepareTemplate();
	}
}
