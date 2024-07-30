package lo.geometry.figures;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {
 @Test
    public void testGetPerimeter(){
     Triangle two = new Triangle(4.0, 4.0, 8.0);
     double expected = 16;
     Assertions.assertEquals(expected, two.getPerimeter());

    }

    @Test
    public void testGetArea(){
     Triangle two = new Triangle(2, 4, 5 );
     double expected = 3.8;
     Assertions.assertEquals(expected, two.getArea(), 0.1);
    }
}
