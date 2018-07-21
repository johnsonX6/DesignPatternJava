package flyweight;

import java.util.HashMap;

/**
 * 亨元模式
 * 使用：当需要用共享对象的时候，亨元可以减少内存使用量
 * 角色:享元工厂
 * @author qzhen
 *
 */
public class FlyWeightFactory {
	
	public HashMap<Object,FlyWeight> data;
	
	public FlyWeightFactory(){
		this.data=new HashMap<>();
	}
	
	public FlyWeight getInstance(Object obj){
		if(data.containsKey(obj)){
			return data.get(obj);
		}else{
			FlyWeight flyWeight=new FlyWeight(obj);
			data.put(obj, flyWeight);
			return flyWeight;
		}
	}
}
