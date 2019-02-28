package testRunner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import pNtestClass.NegTestJunit;

public class NegTestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(NegTestJunit.class);
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      System.out.println(result.wasSuccessful());
   }
}