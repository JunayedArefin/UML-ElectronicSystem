package electronicsystem;


public class ElectronicSystem {

    
    public static void main(String[] args) {
        
        Desktop d = new Desktop("Gigabyte","Hp", "Intel", "5th Gen", "8 GB");
        
        System.out.println("Desktop Details,");
        System.out.println("");
        System.out.println("Company : "+d.getCompany());
        System.out.println("Ram : "+d.getRam());
        System.out.println("Genaration : "+d.getGenaration());
        System.out.println("MotherBoard : "+d.getMotherbord());
       

        Laptop l = new Laptop("Touch", "Dark Blue","Book Flex Alpha","10th gen", "16 GB");
        

        
        
        System.out.println("Laptop Details,");
        System.out.println("");
        System.out.println("Screen Type : "+ l.getScreenType());
        System.out.println("Color : "+ l.getColor());
        System.out.println("Model : "+ l.getModel());
        System.out.println("Genaration : "+ l.getGenaration());
        System.out.println("Ram : "+ l.getRam());
        
        
        
    }
    
}
