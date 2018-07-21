package decorate;

public class Decorate implements Source {

	public Source source;
	
	public void decorate(){
		System.out.println("Decorate thr class...");
	}
	@Override
	public void Method() {
		// TODO Auto-generated method stub
		decorate();
		//source.Method();
	}
	public static void main(String[] args) {
			Decorate decorate=new Decorate();
			decorate.Method();
	}
}
