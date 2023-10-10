import java.text.DecimalFormat;

public class Triangle implements ShapeSpecial,CanBeColored {
    private double a = 3.0;
    private double b = 3.0;
    private double c = 3.0;
    private DecimalFormat df2 = new DecimalFormat("#.##");
    private String color = "No color";

    public Triangle(){

    }
    public Triangle(String s){
        this.color = setColor(s);

    }
    public Triangle(double x, double y, double z){
        if(checkValues(x, y, z)){
            this.a = x;
            this.b = y;
            this.c = z;
        }
    }
    public Triangle(double x, double y, double z, String s){
        if(checkValues(x, y, z)){
            this.a = x;
            this.b = y;
            this.c = z;
        }
        this.color = s;        
    }

    /**Checks that the double type parameters are greater than or equal 3.0 
     * @param first The first parameter (double)
     * @param second The second parameter (double)
     * @param third The third parameter (double)
     * @return true if the parameters are correct size, false otherwise
    */
    private boolean checkValues(double first, double second, double third){
        if(first >= 3.0 && second >=3.0 && third >= 3.0){
            return true;
        }else{
            return  false;
        }
    }

    /**
     * Calculates the perimeter of this triangle shape
     * @return perimeter
     */
    public double calculatePerimeter(){
        return (a+b+c);
    }

    /**
     * Calculates the area of this triangle shape
     * @return area
     */
    public double calculateArea(){
        double p = (a+b+c)/2;
        return (Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    /**
     * "Draws" a new triangle to the drawing by printing the shape name, area, perimeter, and color.
     */
    public void drawShape(){
        String output = String.format("This is a triangle with area: %s and perimeter: %s. Color: %s", df2.format(calculateArea()),
        df2.format(calculatePerimeter()), getColor());
        System.out.println(output);
    }
    
    public String getColor(){
        return color;
    }
    
    @Override
    public String setColor(String color){
        return CanBeColored.super.setColor(color);
    }
}
