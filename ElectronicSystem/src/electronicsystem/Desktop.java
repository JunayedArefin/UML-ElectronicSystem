package electronicsystem;

public class Desktop extends Computer {
    public String motherbord;
    public String Company;

    public Desktop(String motherbord, String Company, String Model, String Genaration, String Ram) {
        super(Model, Genaration, Ram);
        this.motherbord = motherbord;
        this.Company = Company;
    }

    public String getMotherbord() {
        return motherbord;
    }

    public String getCompany() {
        return Company;
    }

    
    
  
}
