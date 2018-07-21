package proxy;
/**
 * 具体角色  说明：具体角色实现业务逻辑
 * @author qzhen
 *
 */
public class JavaCoder implements ICoder {

	private String name;
	
	public JavaCoder(String name){
		this.name=name;
	}
	@Override
	public void implDemand(String demandName) {
		// TODO Auto-generated method stub
		System.out.println(name+" implment demand:  "+demandName+" in java");
	}

}
