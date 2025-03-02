/* These are the imports if you use JUnit4
import static org.junit.Assert.*;
import org.junit.*;
*/

// JUNit 5 imports
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;


public class PixelLocationTester {

    private PixelLocation p1;
    private PixelLocation p2;
    private PixelLocation p3;
    private PixelLocation p4;
    private PixelLocation p5;

    @BeforeEach
    public void setup() {
        p1 = new PixelLocation(0,0);
        p2 = new PixelLocation(10,20);
        p3 = new PixelLocation(100,100);
        p4 = new PixelLocation(200,200);
        p5 = new PixelLocation(0,0);
    }

    @Test
    public void testIntialState() {

        assertEquals(0,p1.getX());
        assertEquals(0,p1.getY());
        assertEquals(10,p2.getX());
        assertEquals(20,p2.getY());
        assertEquals(100,p3.getX());
        assertEquals(100,p3.getY());
        assertEquals(200,p4.getX());
        assertEquals(200,p4.getY());
        assertEquals(0, p5.getX());
        assertEquals(0, p5.getY());

    }

    @Test
    public void testSetXMethod() {
        p1.setX(15);
        assertEquals(15,p1.getX());
        p2.setX(12);
        assertEquals(12, p2.getX());
        p3.setX(7);
        assertEquals(7, p3.getX());
        p4.setX(14);
        assertEquals(14, p4.getX());
        p5.setX(9);
        assertEquals(9, p5.getX());
    }

    @Test
    public void testSetYMethod(){
        p1.setY(9);
        assertEquals(9, p1.getY());
        p2.setY(5);
        assertEquals(5, p2.getY());
        p3.setY(3);
        assertEquals(3, p3.getY());
        p4.setY(15);
        assertEquals(15, p4.getY());
        p5.setY(7);
        assertEquals(7, p5.getY());
    }

    @Test
    public void testEquality() {
        assertEquals(p1,p5);
    }

}
