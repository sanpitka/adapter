import java.util.List;

public class ShapeDrawer extends Drawing<ShapeBasic>{

    public ShapeDrawer(){

    }

    ShapeDrawer drawer = new ShapeDrawer();

    public void draw() {
        List<ShapeBasic> shapes = drawer.getBasicShapes();

        if (shapes == null) {
            System.out.println("Drawing is empty!");
        }
        else {
            for (ShapeBasic shape : shapes) {
                System.out.println("This is a " + shape.printText());
            }
        }

    }

    public void grow() {
        List<ShapeBasic> shapes = drawer.getBasicShapes();

        if (shapes == null) {
            System.out.println("Drawing is empty!");
        }
        else {
            for (ShapeBasic shape : shapes) {
                System.out.println("Growing the size of the " + shape.printText());
            }
        }
    }

    public void showVisibility() {
        List<ShapeBasic> shapes = drawer.getBasicShapes();

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
            System.out.println("Total number of shapes: " + i);
            
        }

    }
    
}
