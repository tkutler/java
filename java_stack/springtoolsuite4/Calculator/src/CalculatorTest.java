
public class CalculatorTest {

	public static void main(String[] args) {
		Calculator CalcOne = new Calculator();
		
		CalcOne.setOperandOne(10.5);
		CalcOne.setOperation("+");
		CalcOne.setOperandTwo(5.2);
		CalcOne.performOperation();
		CalcOne.getResults();
		
		

	}

}
