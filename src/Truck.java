/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gökhan
 */
public class Truck extends car implements carYear{
    public int carYear()
    {
    return carYear();
            };
  public int carModel()
    {
    return carModel();
            };
    int weight;
 
//constructorda değerleri aldırıyoruz
    
    Truck(int speed,double regularPrice,String color,int weight){
        super(speed,regularPrice,color);
        this.weight=weight;
    }
 
//kamyonun ağırlığına göre indirim yapan metod
    public double getSalePrice(){
        if(weight>2000){
            return super.getSalePrice()-super.getSalePrice()*10/100;
        }
        else{
            return super.getSalePrice()-super.getSalePrice()*20/100;
        }
    }
}