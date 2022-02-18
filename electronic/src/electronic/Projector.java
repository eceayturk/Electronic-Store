/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electronic;

/**
 *
 * @author ebrue
 */
public class Projector extends Electronics{
    private int ansilumen;
    private int lampHour;
    
   public Projector(String brand, double price, int guarantee, int ansilumen, int lampHour){
       super(brand,price,guarantee);
       this.lampHour = lampHour;
       this.ansilumen = ansilumen;
   }
    @Override
   public String toString(){
    return (super.toString()+
            "\nAnsilumen: "+ansilumen+"\nLamp Hour: "+lampHour);
}
    @Override
    public String findPromotion() {
       if (guarantee > 3) {
            price -= price * projectorDiscount;
            return ("Price after discount: " + price +"\n");
        }
        return "No discount!\n";
    }
}
