/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electronic;

/**
 *
 * @author ebrue
 */
public abstract class Electronics implements IElectronics {
    
    protected String brand;
    protected double price;
    protected int guarantee;
    
    public Electronics(String brand, double price, int guarantee){
        this.brand = brand;
        this.guarantee = guarantee;
        this.price = price;
        
    }
    public String toString(){
        return ("Brand: "+brand+"\nPrice: "+price+" TL"+ "\nGuarantee: "+guarantee+" years");
    }
}
