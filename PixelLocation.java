/**
    @author Christopher Summa
    @version 0.1

    parse custom tags with the following command:

    javadoc -tag custom.require:cm:"Precondition:"  -tag custom.ensure:cm:"Postcondition:" -Xdoclint:none  *.java

*/
public class PixelLocation {

    private int x; /** @invariant x >= 0 */
    private int y; /** @invariant y >= 0 */

    /**
     * Creates a new instance of PixelLocation.
     * 
     * @param initialX The intial horizontal coordinate of this pixel
     * @param initialY The inital vertical coordinate of this pixel
     * @since Wednesday, Jan 24 2018
     * @custom.require initialX >= 0
     * @custom.require initialY >= 0
     * @custom.ensure  getX() >= 0 && getX() == initialX
     * @custom.ensure  getY() >= 0 && getY() == initialY
    */
    public PixelLocation(int initialX, int initialY) {
        this.x = initialX;
        this.y = initialY;
    }

    /**
     * Returns the horizontal coordinate of the pixel.
     * 
     * @since Wednesday, Jan 24 2018
     * @return Returns the current integer value of the PixelLocation's horizontal coordinate
     * @custom.ensure getX() >=0
    */
    public int getX() {
        return this.x;
    }

    /**
     * Returns the vertical coordinate of the pixel.
     * 
     * @since Wednesday, Jan 24 2018
     * @return Returns the current integer value of the PixelLocation's vertical coordinate
     * @custom.ensure getY() >=0
    */

    public int getY() {
        return this.y;
    }

    /**
     * Sets the horizontal coordinate of the pixel.
     * 
     * @since Wednseday, Jan 24 2018
     * @param newX The new horizontal coordinate of this pixel
     * @custom.require x >= 0 
    */

    public void setX(int newX) {
        this.x = newX; 
    }

    /**
     * Sets the vertical coordinate of the pixel.
     * 
     * @since Wednesday, Jan 24 2018
     * @param newY The new vertical coordinate of this pixel
     * @custom.require y >= 0
     * 
    */

    public void setY(int newY) {
        this.y = newY;
    }

    /**
     * Returns true if pixel is equal to another pixel. Else, returns false.
     * 
     * @since Wednesday, Jan 24 2018
     * @param o The object that the object this method is called on will be compared to 
    */

    @Override
    public boolean equals(Object o) {

        if (o instanceof PixelLocation) {
            PixelLocation p = (PixelLocation)o;
            if ( p.getX() == this.getX() && p.getY() == this.getY())
//              if ( p.x == this.x && p.y == this.y)
                return true;
        }
        return false;
    }

} // end class Point2D
