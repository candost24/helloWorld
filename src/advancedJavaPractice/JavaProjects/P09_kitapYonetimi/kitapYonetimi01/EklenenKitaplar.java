package advancedJavaPractice.JavaProjects.P09_kitapYonetimi.kitapYonetimi01;

public class EklenenKitaplar {
	
	public int kitapNo;
	public String kitapAdı;
	public String yazar;
	public int kitapFiyatı;
	
	
	public EklenenKitaplar() {
		
	}
	
	
	public EklenenKitaplar (int kitapNo, String kitapAdı, String yazar, int kitapFiyatı) {
		this.kitapNo= advancedJavaPractice.JavaProjects.P09_kitapYonetimi.kitapYonetimi01.Kitapcı_KitapEkle.count;
		this.kitapAdı=kitapAdı;
		this.yazar=yazar;
		this.kitapFiyatı=kitapFiyatı;
	}


}
