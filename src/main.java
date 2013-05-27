/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gökhan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sedan MySedan=new Sedan(230,1200.50,"red",20);
        Ford MyFord1=new Ford(180,1000.90,"black",2008,100);
        Ford MyFord2=new Ford(200,1300.90,"grey",2009,50);
        car MyCar=new car(100,999.99,"white");
 
        System.out.println(MySedan.getSalePrice());
        System.out.println(MyFord1.getSalePrice());
        System.out.println(MyFord2.getSalePrice());
        System.out.println(MyCar.getSalePrice());
 
    }
}
