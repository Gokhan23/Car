/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gökhan
 */

public  class Sedan extends car implements carYear{
    int length;
    public int carYear()
    {
    return carYear();
            };
  public int carModel()
    {
    return carModel();
            };
//constructorda sedanın özellikleri belirlensin
    Sedan(int speed,double regularPrice,String color,int l){
         //super ifadesiyle ana classtaki değişkenlere erişebiliyoruz
        super(speed,regularPrice,color);
        this.length=l;
    }
 
//fiyatı uzunluğa göre belirleyen get metodu yazalım
//dikkat ederseniz burada ana classtakiyle aynı isimde getSalePrice metodu yazdık
// override yapıyoruz
    public double  getSalePrice (){
        if(length>20){
            return super.getSalePrice()-super.getSalePrice()*5/100;
        }
        else{
            return super.getSalePrice()-super.getSalePrice()*10/100;
        }
    }
 
}