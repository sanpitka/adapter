import java.text.DecimalFormat;

public class ShapeDiamond implements ShapeSpecial,CanBeColored {
    private double a = 2.0;
    private double b = 2.0;
    private DecimalFormat df2 = new DecimalFormat("#.##");
    private String color = "No color";

    public ShapeDiamond(){
    }

    public ShapeDiamond(String s){
    }

    public ShapeDiamond(double x, double y){
        if(checkDecimals(x,y)){
            this.a = x;
            this.b = y;
        }
    }

    public ShapeDiamond(double x, double y, String s){
        if(checkDecimals(x, y)){
            this.a = x;
            this.b = y;
        }
        this.color = setColor(s);
    }

    /**Checks that the double type parameters are greater than or equal 2.0 
     * @param first The first parameter (double)
     * @param second The second parameter (double)
     * @return true if the parameters are correct size, false otherwise
    */
    private boolean checkDecimals(double first, double second){
        if(first>=a || second>=b){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Calculates the area of this diamond shape
     * @return area
     */
    public double calculateArea(){
        return (a*b);
    }

    /**
     * Calculates the perimeter of this diamond shape
     * @return perimeter
     */
    public double calculatePerimeter(){
        return a+b+a+b;
    }

    @Override
    public String setColor(String color){
        this.color = CanBeColored.super.setColor(color);
        return color;
    }
    public String getColor(){
        if (color.equals("No color")) {
            return "The shape is not colored";
        }
        return color;
    }
    
    /**
     * "Draws" a new diamond shape to the drawing by printing the shape name, area, perimeter, and color.
     */
    public void drawShape(){
        String output = String.format( "This is a diamond shape with area: %s and perimeter: %s. Color: %s ", df2.format(calculateArea()),
        df2.format(calculatePerimeter()), getColor());
        System.out.println(output);
        
    }   
}
