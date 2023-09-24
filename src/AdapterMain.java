public class AdapterMain {

    public static void main(String[] args) throws Exception {

        ShapeDrawer drawer = new ShapeDrawer();

        Rectangle visibleRectangle = new Rectangle();
        visibleRectangle.changeVisibility();
        drawer.addBasicShape(visibleRectangle);

        drawer.addBasicShape(new Rectangle());

        Circle visibleCircle = new Circle();
        visibleCircle.changeVisibility();
        drawer.addBasicShape(visibleCircle);

        drawer.addBasicShape(new Circle());

        Rectangle visibleRectangle2 = new Rectangle();
        visibleRectangle2.changeVisibility();
        drawer.addBasicShape(visibleRectangle2);

        //TODO: add Triangle which is visible with color "Other color"

        //TODO: Add a diamond shape which is visible with color "PURPLE"

        //TODO: Add a diamond shape which is in the background with color "somethingElse"

        //TODO: Add a diamond shape with values 4.0 and 4.0. The shape is in the background and has color "Yellow"

        //TODO: Add a triangle with values 6.0, 6.0 and 6.0 which is in the background with color "Blue"

        //TODO: Add a diamond shape with values 1.0 and 1.0, the shape is visible and has color "Green"

        //TODO: Add a brush stroke which is in the background

        //TODO: Add a brush stroke which is visible with color "someColor"

        //TODO: Add a brush stroke which is visible and has color "RED"

        drawer.draw();
        drawer.grow();
        drawer.showVisibility();
        
    }

}
