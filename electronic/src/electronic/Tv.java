/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electronic;

/**
 *
 * @author ebrue
 */
public class Tv extends Electronics{
    private String type;
    private int size;
    
    Tv(String brand, double price, int guarantee, String type, int size){
        super(brand, price, guarantee);
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString(){
        return (super.toString()+
                "\nType: "+type+ "\nScreen Size: "+size+"\"");
                                                        
                                                           
    }
    
    @Override
    public String findPromotion() {
       if(type.equals("LCD") && price > 500)
            return ("You get a free toaster!\n");
        else if(type.equals("HD") && price > 800)
            return ("You get a free food processor!\n");
        else
            return ("No promotion.\n");
    }
    
}
