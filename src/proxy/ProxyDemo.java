package proxy;
/**
 * 代理模式
 * 使用场景：当需要访问某个对象，不直接访问对象，而通过代理类来实现访问对象，执行对象业务
 * @author qzhen
 *
 */
public class ProxyDemo {

		public static void main(String[] args) {
			ICoder coder=new JavaCoder("zhang");
			ICoder proxyCoder=new ProxyCoder(coder);
			proxyCoder.implDemand("Add user management");
		}
		
}
