import java.util.List;

public class ShapeDrawer extends Drawing<ShapeBasic>{

    public ShapeDrawer(){

    }

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
