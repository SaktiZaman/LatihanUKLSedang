import java.util.Scanner;

public class soalLatUKLSedangDua {
    double tinggi, radius, vol;

    public soalLatUKLSedangDua(double tinggi, double radius){
        this.tinggi = tinggi;
        this.radius = radius;
    }

    public void volume(){
        vol = ((3.14) * (radius * radius) * tinggi);
    }

    public static void main(String[] args) {
        soalLatUKLSedangDua tabungSatu = new soalLatUKLSedangDua(50, 12);
        tabungSatu.volume();
        System.out.println(tabungSatu.vol);
        
    }
}
