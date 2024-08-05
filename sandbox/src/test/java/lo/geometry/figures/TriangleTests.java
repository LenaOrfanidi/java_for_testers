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

    @Test
    public void testNegativeSide1() {
        try {
            Triangle two = new Triangle(-2, 3, 5);
            Assertions.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException exception){
          Assertions.assertEquals("Side can not be negative or zero", exception.getMessage());
    }
    }
    @Test
    public void testNegativeSide2() {
        try {
            Triangle two = new Triangle(2, -3, 5);
            Assertions.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException exception){
            Assertions.assertEquals("Side can not be negative or zero", exception.getMessage());
        }
    }
    @Test
    public void testNegativeSide3() {
        try {
            Triangle two = new Triangle(2, 3, -5);
            Assertions.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException exception){
            Assertions.assertEquals("Side can not be negative or zero", exception.getMessage());
        }
    }
    @Test
    public void testSideCannotBeZero() {
        try {
            Triangle two = new Triangle(0, 3, 5);
            Assertions.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException exception){
            Assertions.assertEquals("Side can not be negative or zero", exception.getMessage());
        }
    }

    @Test
    public void testSumOfSidesRegulation1(){
     try {
         Triangle two = new Triangle(2, 2, 5);
         Assertions.fail("Expected IllegalArgumentException");
     } catch (IllegalArgumentException exception){
         Assertions.assertEquals(" Sum of two sides can not be lower then the third side size",exception.getMessage());
     }
    }
    @Test
    public void testSumOfSidesRegulation2(){
        try {
            Triangle two = new Triangle(5, 2, 2);
            Assertions.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException exception){
            Assertions.assertEquals(" Sum of two sides can not be lower then the third side size",exception.getMessage());
        }
    }
    @Test
    public void testSumOfSidesRegulation3(){
        try {
            Triangle two = new Triangle(2, 5, 2);
            Assertions.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException exception){
            Assertions.assertEquals(" Sum of two sides can not be lower then the third side size",exception.getMessage());
        }
    }

    @Test
    public void testEqualsTriangles(){
     Triangle one = new Triangle(4,3,5);
     Triangle two = new Triangle(3,4,5 );
     Assertions.assertTrue(one.equals(two));
    }
}
