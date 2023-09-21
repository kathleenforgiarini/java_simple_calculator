package business;

public class Operation {

	private double number1;
	private double number2;
	
	public Operation() {
		this.number1 = 0;
		this.number2 = 0;
	}
	
	public Operation(double op1, double op2) {
		this.number1 = op1;
		this.number2 = op2;
	}
	
	public double getNumber1() {
		return this.number1;
	}
	
	public void setNumber1(double n1) {
		this.number1 = n1;
	}
	
	public double getNumber2() {
		return this.number2;
	}
	
	public void setNumber2(double n2) {
		this.number2 = n2;
	}

    public double Add()
    {
        return this.number1 + this.number2;
    }

    public double Sub()
    {
        return this.number1 - this.number2;
    }

    public double Mult()
    {
        return this.number1 * this.number2;
    }

    public double Div()
    {
        return this.number1 / this.number2;
    }

}
