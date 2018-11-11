package chainofresponsibility;

public class AddNumbers implements Chain {
	
	private Chain nextInChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;
	}
	
	@Override
	public double calculate(Numbers requests) {
		if(requests.getCalculationWanted() == "add") {
			double addition = requests.getNum1() + requests.getNum2();
			return addition;
		}
		else {
			return nextInChain.calculate(requests);
		}
	}

}
