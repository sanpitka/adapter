public class Rectangle extends Visibility implements ShapeBasic {

    static String rectangleToPrint = "Rectangle";

    public Rectangle(){

    }

    public void draw() {
        System.out.println("This is a rectangle");
    }

    public void grow() {
        System.out.println("Growing the size of the rectangle");
    }

    static String printText() {
        return rectangleToPrint;
    }
    
}
