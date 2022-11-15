//Strateji tasarım kalıbı
//interface oluştur-> imlement edicek classları oluştur->context(is yaptığı kısım galiba )->client
package pkg15.pkg11.pkg2022bmt;
//interface tanımla, implement edilecek classlar, context kısmı(ogrenci?), client app
//bir isi birden çok yapılacak şekilde kullanılıyorsa 
//run time da dilediğini seç kullan diye yapılmıs 
public class Main {

    public static void main(String[] args) throws Exception {
        Ogrenci ogrenci = new Ogrenci(EnumBolum.SAYISAL);
        System.out.println(ogrenci.getOncelikSiralamasi());
    }

}
