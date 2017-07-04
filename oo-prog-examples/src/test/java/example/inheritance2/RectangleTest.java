package example.inheritance2;

import example.inheritance2.Rectangle;
import org.hamcrest.core.Is;
import org.junit.Before;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by jens on 04.07.17.
 */
public class RectangleTest {

    Rectangle rectangle;
    @Before
    public void setup() {
        rectangle = new Rectangle(10, 5);
    }

    @org.junit.Test
    public void checkWidth() throws Exception {
        assertThat(rectangle.getWidth(), Is.is(10.0));
    }

    @org.junit.Test
    public void checkHeight() throws Exception {

        assertThat(rectangle.getHeight(), Is.is(5.0));
        
    }

}