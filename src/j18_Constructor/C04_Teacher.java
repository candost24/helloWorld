package j18_Constructor;

public class C04_Teacher {
    String ad;
    String soyad;
    String branş;
    int tecrube;
    double maaş;
    int id;
    boolean emekli;

    public C04_Teacher(String ad, String soyad, String branş, int tecrube, double maaş, int id, boolean emekli) {
        this.ad = ad;
        this.soyad = soyad;
        this.branş = branş;
        this.tecrube = tecrube;
        this.maaş = maaş;
        this.id = id;
        this.emekli = emekli;
    }

    public C04_Teacher() {
    }

    public void dersSaati(){

        System.out.println("agam 20 saatten sonra extraya girer ");

    }

    @Override
    public String toString() {
        return "C04_Teacher{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", branş='" + branş + '\'' +
                ", tecrube=" + tecrube +
                ", maaş=" + maaş +
                ", id=" + id +
                ", emekli=" + emekli +
                '}';

    }





}
