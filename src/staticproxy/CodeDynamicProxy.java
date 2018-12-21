package staticproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理角色
 * @author qzhen
 *
 */
public class CodeDynamicProxy implements InvocationHandler {

	public ICoder coder;
	
	public CodeDynamicProxy(ICoder coder){
		this.coder=coder;
	}
	//push to developer test
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("执行前时间:"+System.currentTimeMillis());
		Object result=method.invoke(coder, args);
		System.out.println("执行后时间:"+System.currentTimeMillis());
		return result;
		
	}
	
}
