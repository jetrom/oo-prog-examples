package example.inheritance2;

import example.inheritance2.Rectangle;
import example.inheritance2.SquareFix;
import org.junit.Before;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by jens on 04.07.17.
 */
public class SquareFixAsRectangleTest {

    Rectangle squareAsRectangle;
    @Before
    public void setup() {

        squareAsRectangle = new SquareFix(10);
    }

    @org.junit.Test
    public void checkWidth() throws Exception {
        assertThat(squareAsRectangle.getWidth(), is(10.0));

    }

    @org.junit.Test
    public void checkHeight() throws Exception {
        assertThat(squareAsRectangle.getHeight(), is(10.0));

    }

    @org.junit.Test
    public void setWidthAndCheckWidthAndHeight() throws Exception {
        squareAsRectangle.setWidth(6);
        assertThat(squareAsRectangle.getWidth(), is(6.0));
        assertThat(squareAsRectangle.getHeight(), is(10.0));
    }



}