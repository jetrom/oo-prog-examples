package example.inheritance2;

/**
 * Created by jens on 04.07.17.
 */
public class Square extends Rectangle {

    public Square(double size) {

        super(size, size);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }
}
