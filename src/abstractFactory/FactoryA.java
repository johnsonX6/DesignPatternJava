package abstractFactory;
/**
 * π§≥ß¿‡
 * @author qzhen
 *
 */
public class FactoryA implements  Produce {

	@Override
	public Food getFood() {
		// TODO Auto-generated method stub
		Food food=new  ClassA();
		return food;
	}
		
}
