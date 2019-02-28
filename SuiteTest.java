package pNtestClass;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
   NegTestJunit.class,
   PosTestJunit.class
})

public class SuiteTest {

}
