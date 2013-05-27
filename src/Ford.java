/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gökhan
 */
public class Ford extends car implements carYear{
    
    public int carYear()
    {
    return carYear();
            };
  public int carModel()
    {
    return carModel();
            };
  
    int year;
    int manufacturerDiscount;
 
//constructorda özellikleri initialize edelim
    Ford(int speed,double regularPrice,String color,int year,int manufacturerDiscount){
        super(speed,regularPrice,color);
        this.year=year;
        this.manufacturerDiscount=manufacturerDiscount;
    }
 
//override ile getSalePrice metodunda Fordun indirimli fiyatını verelim
    public double getSalePrice(){
        return super.getSalePrice()-this.manufacturerDiscount;
    }
 
}