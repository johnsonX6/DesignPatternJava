package staticproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**代理模式
 * 动态代理类 
 * 使用场景：当要代理的类方法比较多，静态代理类代码方式不方便，在运行时创建代理，对代理对象统一处理。
 * 说明:具体可参考 http://www.importnew.com/26116.html
 * @author qzhen
 *
 */
public class DynamicProxyDemo {
	
	public static void main(String[] args) {
		//抽象类
		ICoder coder=new JavaCoder("zhang");
		ICoder coder_li=new JavaCoder("Li");
		//中介类实例
		InvocationHandler handler=new CodeDynamicProxy(coder);
		//得到类加载器
		ClassLoader  c1=coder.getClass().getClassLoader();
		//通过动态代理获取代理实例
		ICoder  proxy=(ICoder)Proxy.newProxyInstance(c1, coder.getClass().getInterfaces(), handler);
		//执行代理
		proxy.implDemand("Add user management");
		proxy(coder,"zhang impl a demand");
		proxy(coder_li,"li add a new module");
	}
	
	public static void proxy(ICoder coder,String content){
		InvocationHandler handler=new CodeDynamicProxy(coder);
		ClassLoader c2=coder.getClass().getClassLoader();
		ICoder proxy=(ICoder)Proxy.newProxyInstance(c2, coder.getClass().getInterfaces(), handler);
		proxy.implDemand("content");
		
	}
	
}
