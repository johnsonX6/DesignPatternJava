package facade;
/**
 * 外观模式
 * 类型:创建型 
 * 说明:当有多个子系统，都有各自的业务，可以使用统一接口，方便子系统的使用。
 * @author qzhen
 *
 */
public class Facade {
	SubSystem system =new SubSystem();
	SubSystem1 system2=new SubSystem1();
	SubSystem2 system3=new SubSystem2();
	
	public void startSubSystem(){
		system.start();
		system2.start();
		system3.start();
	}
	
	public void stopSubSystem(){
		system.stop();
		system2.stop();
		system3.stop();
	}
}
