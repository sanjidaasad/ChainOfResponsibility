package chainofresponsibility;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class NumberTest {

	@Test
	void test() {
	    Numbers request = new Numbers(8, 2, "add");
	    Numbers request2 = new Numbers(8, 2, "sub");
	    Numbers request3 = new Numbers(8, 2, "mul");
	    Numbers request4 = new Numbers(8, 2, "div");
	    
	    AddNumbers addNumbers = new AddNumbers();
	    SubNumbers subNumbers = new SubNumbers();
	    MultiplyNumbers multiplyNumbers = new MultiplyNumbers();
	    DivNumbers divNumbers = new DivNumbers();
	    
	    addNumbers.setNextChain(subNumbers);
	    subNumbers.setNextChain(multiplyNumbers);
	    multiplyNumbers.setNextChain(divNumbers);
	    
	    assertEquals(10, addNumbers.calculate(request),"8 + 2 = 10");
	    assertEquals(6, addNumbers.calculate(request2),"8 - 2 = 6");
	    assertEquals(16, addNumbers.calculate(request3),"8 * 2 = 16");
	    assertEquals(4, addNumbers.calculate(request4),"8 / 2 = 4");
	    
	    }

}
