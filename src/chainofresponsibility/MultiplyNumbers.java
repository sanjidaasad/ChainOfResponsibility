package chainofresponsibility;

public class MultiplyNumbers implements Chain {
	
    private Chain nextInChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;
	}
	
	@Override
	public double calculate(Numbers requests) {
		if(requests.getCalculationWanted() == "mul") {
			double multiplication = requests.getNum1() * requests.getNum2();
			return multiplication;
		}
		else {
			return nextInChain.calculate(requests);
		}
	}

}
