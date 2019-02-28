package pNtestClass;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class NegTestJunit {
	
   String message = "Hello World";	
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      message = "New Word";
      assertEquals(message,messageUtil.printMessage());
   }
}
