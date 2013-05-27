/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gökhan
 */
public class car {
    int speed;
    double regularPrice;
    String color;
   
//constructorda bu değerleri initialize edelim
    public car(int speed,double regularPrice,String color){
        this.speed=speed;
        this.regularPrice=regularPrice;
        this.color=color;
    }
   
 
//main fonksiyonunda arabanın fiyatına erişebileceğimiz bir metod yazalım
    public double getSalePrice(){ return regularPrice; }
 
}