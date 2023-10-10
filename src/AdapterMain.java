public class AdapterMain {

    public static void main(String[] args) throws Exception {

        //Create new ShapeDrawer object
        ShapeDrawer drawer = new ShapeDrawer();

        //Add a rectangle which is visible
        Rectangle visibleRectangle = new Rectangle();
        visibleRectangle.changeVisibility();
        drawer.addBasicShape(visibleRectangle);

        //Add a rectangle which is in the background
        drawer.addBasicShape(new Rectangle());

        //Add a circle which is visible
        Circle visibleCircle = new Circle();
        visibleCircle.changeVisibility();
        drawer.addBasicShape(visibleCircle);

        //Add a circle which is in the background
        drawer.addBasicShape(new Circle());

        //Add a rectangle which is visible
        Rectangle visibleRectangle2 = new Rectangle();
        visibleRectangle2.changeVisibility();
        drawer.addBasicShape(visibleRectangle2);

        //Add a triangle which is visible with color "Other color"
        ShapeAdapter visibleTriangle = new ShapeAdapter(new Triangle("Other color"));
        visibleTriangle.changeVisibility();
        drawer.addBasicShape(visibleTriangle);

        //Add a diamond shape which is visible with color "PURPLE"
        ShapeAdapter visibleDiamond = new ShapeAdapter(new ShapeDiamond("PURPLE"));
        visibleDiamond.changeVisibility();
        drawer.addBasicShape(visibleDiamond);

        //Add a diamond shape which is in the background with color "somethingElse"
        drawer.addBasicShape(new ShapeAdapter(new ShapeDiamond("somethingElse")));

        //Add a diamond shape with values 4.0 and 4.0. The shape is in the background and has color "Yellow"
        drawer.addBasicShape(new ShapeAdapter(new ShapeDiamond(4.0, 4.0, "Yellow")));

        //Add a triangle with values 6.0, 6.0 and 6.0 which is in the background with color "Blue"
        drawer.addBasicShape(new ShapeAdapter(new Triangle(6.0, 6.0, 6.0, "Blue")));

        //Add a diamond shape with values 1.0 and 1.0, the shape is visible and has color "Green"
        ShapeAdapter visibleDiamond2 = new ShapeAdapter(new ShapeDiamond(1.0, 1.0, "Green"));
        visibleDiamond2.changeVisibility();
        drawer.addBasicShape(visibleDiamond2);

        //Add a brush stroke which is in the background
        drawer.addBasicShape(new BrushStroke());

        //Add a brush stroke which is visible with color "someColor"
        BrushStroke brushStroke = new BrushStroke();
        brushStroke.changeVisibility();
        brushStroke.setColor("someColor");
        drawer.addBasicShape(brushStroke);

        //Add a brush stroke which is visible and has color "RED"
        BrushStroke brushStroke2 = new BrushStroke();
        brushStroke2.changeVisibility();
        brushStroke2.setColor("RED");
        drawer.addBasicShape(brushStroke2);

        drawer.draw();
        drawer.grow();
        drawer.showVisibility();
        
    }

}
