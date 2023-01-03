package electronicsystem;

public class Computer extends ElectronicSystem {
    public String Model;
    public String Genaration;
    public String Ram;

    public Computer(String Model, String Genaration, String Ram) {
        this.Model = Model;
        this.Genaration = Genaration;
        this.Ram = Ram;
    }

    public String getModel() {
        return Model;
    }

    public String getGenaration() {
        return Genaration;
    }

    public String getRam() {
        return Ram;
    }

    
    
    
}
