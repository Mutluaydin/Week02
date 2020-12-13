package ch.hicoders.jam101.week02.kisi;

public class Ogrenci {
    private int ogrNo ;
    public String ogrAd;
    public int almNot;
    public int matNot;
    double ort;

    public Ogrenci(String ogrAd, int matNot, int almNot){
        this.ogrNo = (int)(Math.random()*51) ;
        this.ogrAd = ogrAd;
        this.matNot = matNot;
        this.almNot = almNot;


        if(almNot >=0 && almNot <= 6){
            this.almNot = almNot;
        }else {
            System.out.println("Almanca notunu 0-6 arasi bir deger girin");
        }
        if(matNot >=0 && matNot <= 6){
            this.matNot = matNot;
        }else {
            System.out.println("Matematik notunu 0-6 arasi bir deger girin");
        }


    }

    public String Adsoyad(){
        return ogrNo + "   " + ogrAd + "   " + matNot + "   " + almNot;
    }
    public double Ort(){
        ort = (double) (matNot + almNot)/2;
        return ort;
    }

}
