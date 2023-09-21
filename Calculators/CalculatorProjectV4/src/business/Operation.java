package business;

public class Operation {

	private double number1;
	private double number2;
	
	public Operation() {
		number1 = 0;
		number2 = 0;
	}
	
	public double getNumber1() {
		return number1;
	}
	
	public void setNumber1(double n1) {
		number1 = n1;
	}
	
	public double getNumber2() {
		return number2;
	}
	
	public void setNumber2(double n2) {
		number2 = n2;
	}

    public double Add()
    {
        return number1 + number2;
    }

    public double Sub()
    {
        return number1 - number2;
    }

    public double Mult()
    {
        return number1 * number2;
    }

    public double Div()
    {
        return number1 / number2;
    }

}
