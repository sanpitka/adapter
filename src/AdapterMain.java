public class AdapterMain {

    public static void main(String[] args) throws Exception {
        ShapeDrawer drawer = new ShapeDrawer();
        drawer.addBasicShape(new Rectangle());
        drawer.addBasicShape(new Rectangle());
        drawer.addBasicShape(new Circle());
        drawer.addBasicShape(new Circle());
        drawer.addBasicShape(new Rectangle());
        drawer.draw();
        drawer.grow();
        drawer.showVisibility();
        
    }

    /*
     * In the main method you must...
Create a ShapeDrawer object to be your drawing object (like a canvas where you add objects)
Create a few objcets (as given below) and add those objects to your drawing...
Add a rectangle which is visible
Add a rectangle which is in the background
Add a circle which is visible
Add a circle which is in the background
Add a rectangle which is visible
Draw your drawing (call the method draw() on it, not on individual objects created in the main method)
Grow the size of your drawing (call the method grow() on it, not on individual objects created in the main method)
Print all shapes in your drawing by calling the method showVisibility() on your drawing. 
The output for each shape (included in the drawing) will include its order number in the drawing, information whether the shape is visible or not, and the type of the shape (see example output below). Finally, the number of objects in the drawing will be shown.

     */
}
