package bridge;
/**
 * 桥接模式
 * 使用场景		说明:整合Shape类与drawAPI接口
 * 备注:希望有空与大家一起讨论，桥接模式的使用。这里仅仅是参考博客园的一个Demo
 * @author qzhen
 *
 */
public class Circle extends Shape {

	private int x,y,radius;
	
	public Circle(int radius ,int x, int y,DrawAPI drawAPI) {
		super(drawAPI);
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		drawAPI.drawCircle(radius, x, y);
	}
	
	public static void main(String[] args) {
		Shape redCircle=new Circle(100,10,10,new RedCircle());
		Shape greenCircle=new Circle(100,10,10,new GreenCircle());
		redCircle.draw();
		greenCircle.draw();
		
	}
}
