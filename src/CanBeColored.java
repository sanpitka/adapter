public interface CanBeColored {    
    /**
     * Verifies that the color of the shape is one of the valid colors.
     * The valid colors are Blue, Green, Red, and Yellow.
     * @return verified color or "No color" if the color does not match
     */ 
    default String setColor(String color){
        color = color.substring(0,1).toUpperCase() + color.substring(1).toLowerCase();
        if (color != null && (
            color.equals("Blue") || 
            color.equals("Green")|| 
            color.equals("Red") || 
            color.equals("Yellow"))) {
            return color;
        }
        else return "No color";
    }
    
    public String getColor();
}
