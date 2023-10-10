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

        Triangle triangle = new Triangle();
        triangle.setColor("Other color");
        ShapeAdapter adapter = new ShapeAdapter(triangle);
        adapter.changeVisibility();
        drawer.addBasicShape(adapter);
        
        

        //TODO: Add a diamond shape which is visible with color "PURPLE"

        ShapeDiamond diamondPurple = new ShapeDiamond();
        diamondPurple.setColor("Purple");
        adapter = new ShapeAdapter(diamondPurple);
        adapter.changeVisibility();
        drawer.addBasicShape(adapter);


        //TODO: Add a diamond shape which is in the background with color "somethingElse"
        ShapeDiamond diamondElse = new ShapeDiamond();
        diamondElse.setColor("somethingElse");
        adapter = new ShapeAdapter(diamondElse);
        adapter.changeVisibility();
        drawer.addBasicShape(adapter);

        //TODO: Add a diamond shape with values 4.0 and 4.0. The shape is in the background and has color "Yellow"
        ShapeDiamond diamondYellow = new ShapeDiamond(4.0,4.0);
        diamondYellow.setColor("Yellow");
        adapter = new ShapeAdapter(diamondYellow);
        adapter.changeVisibility();
        drawer.addBasicShape(adapter);

        //TODO: Add a triangle with values 6.0, 6.0 and 6.0 which is in the background with color "Blue"
        Triangle triangleBlue = new Triangle(6.0,6.0,6.0);
        triangleBlue.setColor("Blue");
        adapter = new ShapeAdapter(triangleBlue);
        adapter.changeVisibility();
        drawer.addBasicShape(adapter);

        //TODO: Add a diamond shape with values 1.0 and 1.0, the shape is visible and has color "Green"
        ShapeDiamond diamondGreen = new ShapeDiamond(1.0,1.0);
        diamondGreen.setColor("Green");
        adapter = new ShapeAdapter(diamondGreen);
        drawer.addBasicShape(adapter);

        //TODO: Add a brush stroke which is in the background
        
        //TODO: Add a brush stroke which is visible with color "someColor"

        //TODO: Add a brush stroke which is visible and has color "RED"

        drawer.draw();
        drawer.grow();
        drawer.showVisibility();
        
    }

}
