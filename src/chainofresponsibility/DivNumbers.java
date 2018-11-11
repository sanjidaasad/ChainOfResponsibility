package chainofresponsibility;

public class DivNumbers implements Chain {
	
    private Chain nextInChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;
	}
	
	@Override
	public double calculate(Numbers requests) {
		if(requests.getCalculationWanted() == "div") {
			double division = requests.getNum1() / requests.getNum2();
			return division;
		}
		else {
			return nextInChain.calculate(requests);
		}
	}

}
