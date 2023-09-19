public class ShapeDrawer extends Drawing<ShapeBasic>{

    public ShapeDrawer(){

    }

    ShapeDrawer drawer = new ShapeDrawer();

    public void draw() {
        if (drawer.getBasicShapes() == null) {
            System.out.println("Drawing is empty!");
        }
        else {
            //TODO: tulosta piirroksessa jo olevat kuviot
        }

    }

    public void grow() {
        if (drawer.getBasicShapes() == null) {
            System.out.println("Drawing is empty!");
        }
        else {
            //TODO: koon kasvatus
        }
    }

    /* The method draw() must "draw" each shape included in the drawing (according to the functionality provided by each shape).
     You must check if there are no shapes in the drawing, i.e., if the drawing is empty. If there are no shapes in the drawing,
     the method will output "Drawing is empty!".
    The method grow() must "grow the size" of each shape included in the drawing (according to functionality provided by each shape).
    You must check if there are no shapes in the drawing, i.e., if the drawing is empty. If there are no shapes in the drawing,
    the method will output "Drawing is empty!".
    The method showVisibility() must traverse the shapes included in the drawing. You must check if there are no shapes in the drawing,
    i.e., if the drawing is empty. If there are no shapes in the drawing, the method will output "Drawing is empty!". 
    If there are shapes in the drawing, for each shape the method must...
    Check whether a shape is visible or in the background.
    Output the sequence number of the shape (the first shape to be added to the drawing will be 1. and the second shape in the drawing will be 2. etc.).
    Output whether the shape is visible or in the background
    Output the type of the shape.
    Finally, at the end of the method, the method will output the number of shapes in the drawing.

    For example, to test the implementation so far (phase 1), in the main program, create objects described below and add them to your drawing (of type ShapeDrawer). The first shape to be added to the drawing is a visible object of the class Rectangle. The second shape to be added to the drawing is an object of the Rectangle class which must be hidden (is in the background). Then there is a hidden object of class Circle.

    You can check the expected output from the instructions for the AdapterMain.java class.

    For the three shapes described above the output would be...


    This is a rectangle
    This is a rectangle
    This is a circle

    Growing the size of the rectangle
    Growing the size of the rectangle
    Growing the size of the circle

    1. shape is visible: Rectangle
    2. shape is in the background: Rectangle
    3. shape is in the background: Circle

    Total number of shapes: 3 */
    
    
}
