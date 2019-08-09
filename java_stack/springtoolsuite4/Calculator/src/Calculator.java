
public class Calculator implements java.io.Serializable {
	protected double numberOne; 
	protected double numberTwo;
	protected String operator;
	protected double result;
	
	public Calculator() {
		
	}
	
	public double setOperandOne(double number) {
		this.numberOne = number;
		return this.numberOne;
		
	}
	public double setOperandTwo(double number) {
		this.numberTwo = number;
		return this.numberTwo;
	}
	public String setOperation(String symbol) {
		this.operator = symbol ;
		return this.operator;
	}
	public double performOperation(){
		if (this.operator == "-") {
			this.result = this.numberOne - this.numberTwo;
		}
		else {
			this.result = this.numberOne + this.numberTwo;
		}
		return result;
	}
	public void getResults() {
		System.out.println(this.result);
	}

}
