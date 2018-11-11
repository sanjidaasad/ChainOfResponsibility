package chainofresponsibility;

public class SubNumbers implements Chain {
	
    private Chain nextInChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;
	}
	
	@Override
	public double calculate(Numbers requests) {
		if(requests.getCalculationWanted() == "sub") {
			double subtraction = requests.getNum1() - requests.getNum2();
			return subtraction;
		}
		else {
			return nextInChain.calculate(requests);
		}
	}

}
