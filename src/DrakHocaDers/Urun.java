package DrakHocaDers;

public class Urun {

    double kraker=2.5;
    double cips=2.2;
    double fanta=2.0;
    double su=1.0;
    double cay=1.5;
    double filtreKahve=1.99;
    int productNum;
    int price;

public Urun() {
        this.kraker = kraker;
        this.cips = cips;
        this.fanta = fanta;
        this.su = su;
        this.cay = cay;
        this.filtreKahve = filtreKahve;
        this.productNum = productNum;
        this.price = price;


    }

    @Override
    public String toString() {
        return "Urun{" +
                "kraker=" + kraker +
                ", cips=" + cips +
                ", fanta=" + fanta +
                ", su=" + su +
                ", cay=" + cay +
                ", filtreKahve=" + filtreKahve +
                ", productNum=" + productNum +
                ", price=" + price +
                '}';
    }
}


