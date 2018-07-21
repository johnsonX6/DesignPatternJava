package proxy;
/**
 * 代理角色 说明:当客户有需求需要找到代理，可以不直接找程序员，而是找产品经理代理程序员，与客户沟通。
 * @author qzhen
 *
 */
public class ProxyCoder  implements ICoder{
	
	private ICoder coder;
	
	public ProxyCoder(ICoder coder){
		this.coder=coder;
	}

	@Override
	public void implDemand(String name) {
		// TODO Auto-generated method stub
		coder.implDemand(name);
	} 
	
}
