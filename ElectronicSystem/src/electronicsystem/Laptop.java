
package electronicsystem;


public class Laptop extends Computer{

    public String ScreenType;
    public String Color;

    public Laptop(String ScreenType, String Color, String Model, String Genaration, String Ram) {
        super(Model, Genaration, Ram);
        this.ScreenType = ScreenType;
        this.Color = Color;
    }

    public String getScreenType() {
        return ScreenType;
    }

    public String getColor() {
        return Color;
    }

    
    
    
    
}
