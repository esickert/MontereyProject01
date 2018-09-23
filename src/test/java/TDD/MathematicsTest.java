package TDD;

import org.junit.Test;
import static org.junit.Assert.*;

public class MathematicsTest {

    Mathematics math = new Mathematics();  //need to create an instance of Mathematics

@Test
   public void addSomeNumbers() {
    assertEquals(5, math.add(3,2));
    }
}