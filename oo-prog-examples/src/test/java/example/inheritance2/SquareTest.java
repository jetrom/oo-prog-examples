package example.inheritance2;

import example.inheritance2.Square;
import org.hamcrest.core.Is;
import org.junit.Before;

import static org.junit.Assert.assertThat;

/**
 * Created by jens on 04.07.17.
 */
public class SquareTest {

    Square square;
    @Before
    public void setup() {
        square = new Square(10);
    }

    @org.junit.Test
    public void checkWidth() throws Exception {
        assertThat(square.getWidth(), Is.is(10.0));
    }

    @org.junit.Test
    public void checkHeight() throws Exception {

        assertThat(square.getHeight(), Is.is(10.0));
        
    }

}