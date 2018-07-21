package abstractFactory;
/**
 * 工厂客户端	根据需要的产品名生成产品
 * 优点:要生产新产品，增加新工厂类，不必再修改某个工厂类
 * 说明:使用参考：https://www.cnblogs.com/malihe/p/6891920.html
 * @author qzhen
 *
 */
public class Client {

	public Food get(String name){
		Food food=null;
		if(name.equals("ClassA")){
			food=new FactoryA().getFood();
		}else if(name.equals("ClassB")){
			food=new FactoryB().getFood();
		}
		return food;
	}
	
}
