package interpret;

public class AndExpression implements Expression {

	private Expression expression1;
	private Expression expression2;
	
	public AndExpression(Expression ex1,Expression ex2){
		this.expression1=ex1;
		this.expression2=ex2;
	}
	@Override
	public boolean interpret(String context) {
		// TODO Auto-generated method stub
		if(expression1.interpret(context)&&expression2.interpret(context)){
			return true;
		}else{
			return false;
		}
	}

}
