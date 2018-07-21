package abstractFactory;
/**
 * π§≥ß¿‡
 * @author qzhen
 *
 */
public class FactoryB  implements Produce{

	@Override
	public Food getFood() {
		// TODO Auto-generated method stub
		Food food=new ClassB();
		return food;
	}

		
}
