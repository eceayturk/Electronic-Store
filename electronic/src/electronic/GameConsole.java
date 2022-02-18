/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electronic;

/**
 *
 * @author ebrue
 */
public class GameConsole extends Electronics{
    private int hdd;
    private double usb;
    
    public GameConsole(String brand, double price, int guarantee, int hdd, int usb){
        super(brand,price,guarantee);
        this.hdd = hdd;
        this.usb = usb;
           
}
    public String toString(){
        return (super.toString()+
                "\nHdd: "+hdd+"\nUsb: "+usb);
    }
    
    public String findPromotion(){
      if (hdd > 30) {
            price -= price * gameConsoleDiscount;
            return ("Price after discount: " + price +"\n");
        }
        return "No discount!\n";
}
}
