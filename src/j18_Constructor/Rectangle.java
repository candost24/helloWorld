package j18_Constructor;

public class Rectangle {
/*  fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
    Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.*/

    double width;
    double length;
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

public void   cevre(){
    System.out.println("cevre="+((width+length)*2));

}
public void   alan() {
    System.out.println("alan="+((width+length)));

}


}
