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

        drawer.draw();
        drawer.grow();
        drawer.showVisibility();
        
    }

}
