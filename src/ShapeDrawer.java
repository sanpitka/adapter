import java.util.List;

public class ShapeDrawer extends Drawing<ShapeBasic>{

    public ShapeDrawer(){

    }

    /**
     * "Draws" the shape by printing information about it. 
     */
    public void draw() {
        System.out.println("");
        List<ShapeBasic> shapes = super.getBasicShapes();

        if (shapes == null) {
            System.out.println("Drawing is empty!");
        }
        else {
            for (ShapeBasic shape : shapes) {
                shape.draw();
            }
        }

    }

    /**
     * Grows the size of the shape
     */
    public void grow() {
        List<ShapeBasic> shapes = super.getBasicShapes();
        System.out.println("");
        if (shapes == null) {
            System.out.println("Drawing is empty!");
        }
        else {
            for (ShapeBasic shape : shapes) {
                shape.grow();
            }
        }
    }

    /**
     * Prints the visibility of each shape and total number of shapes
     */
    public void showVisibility() {
        List<ShapeBasic> shapes = super.getBasicShapes();
        System.out.println("");
        if (shapes == null) {
            System.out.println("Drawing is empty!");
        }
        else {
            int i = 0;
            for (ShapeBasic shape : shapes) {
                i++;
                if (shape.isVisible()) {
                    System.out.println(i +". shape is visible: " + shape.printText());
                }
                else System.out.println(i + ". shape is in the background: " + shape.printText());
            }
            System.out.println("\nTotal number of shapes: " + i);
            
        }

    }
    
}
