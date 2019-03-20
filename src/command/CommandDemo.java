package command;

public class CommandDemo {
	
	/**
	 * 将请求封装在对象中，使得不同请求对应各种客户。
	 * 引用来源:	<a>https://www.cnblogs.com/WHL5/p/9198858.html</a>
	 * @param args
	 */
	public static void main(String[] args) {
		Stock stock=new Stock();
		BuyStock buyStock=new BuyStock(stock);
		SellStock sellStock=new SellStock(stock);
		Broker broker=new Broker();
		
		broker.takeOrder(buyStock);
		broker.takeOrder(sellStock);
		broker.dealOrder();
	}
}
