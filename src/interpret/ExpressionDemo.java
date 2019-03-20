package interpret;
/**
 * 解释器模式（Interpreter Pattern）提供了评估语言的语法或表达式的方式，它属于行为型模式。
 * 这种模式实现了一个表达式接口，该接口解释一个特定的上下文。这种模式被用在 SQL 解析、符号处理引擎等。
 * 博客引用来源：<a>https://www.cnblogs.com/WHL5/p/9198858.html </a>
 * @author qzhen
 *
 */
public class ExpressionDemo {

	public static void main(String[] args) {
			
		Expression e_male=getMaleExpression();
		Expression e_married=getMarriedWomen();
		System.out.println("Get the isMale Judge==="+e_male.interpret("Johnson"));
		System.out.println("Get the Married Judge==="+e_married.interpret("Women Marrie"));
		
	}
	
	public static Expression getMaleExpression(){
		Expression e1=new TerminalExpression("Johnson");
		Expression e2=new TerminalExpression("Robert");
		return new OrExpression(e1,e2);
	}
	
	public static Expression getMarriedWomen(){
		Expression e1=new TerminalExpression("Women");
		Expression e2=new TerminalExpression("Married");
		return new AndExpression(e1,e2);
	}
	
}
