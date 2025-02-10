import java.io.StringReader;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //ciftTek();
        //faizHesaplama();
        notHesaplama();
        //ustHesaplama();
        //hangisiBuyuk();
       // metinsel();
    }
    private static void metinsel(){
        //ilk
        /*System.out.println("\n"+"---Cümlede kaç adet Boşluk var---"+"\n");
        String cumle="Merhaba bu bir ÖRnek Cümledir";

        int bosluk =0;
        for(int i=0; i<cumle.length(); i++){
            if (cumle.charAt(i)==' '){
                bosluk++;
            }
            if (i==cumle.length()-1){
                System.out.printf("\n"+"Cümlede %s adet boşluk var",bosluk);
            }
        }*/

        //ikinci
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("\n"+"----Palindrom Kelimeler----"+"\n");

        System.out.print("Kelimeyi Giriniz: ");
        String kelime=scanner.next();

        String tersKelime="";
        for (int i=kelime.length()-1; i>=0; i--){
            tersKelime+= kelime.charAt(i);
        }
        System.out.println(tersKelime);
        if (kelime.equals(tersKelime)){
            System.out.println("Bu bir Polindrom kelimedir");
        }else {
            System.out.println("Bu bir Polindrom Kelime değildir");
        }
        metinsel();*/

        //üçüncü,



    }
    private static void hangisiBuyuk(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("\n"+"----3 Tane Sayı giriniz ve Hangisinin büyük olduğunu bulalım----"+"\n");
        System.out.print("Sayı 1: ");
        int sayi1=scanner.nextInt();
        System.out.print("\n"+"Sayı 2: ");
        int sayi2= scanner.nextInt();
        System.out.print("\n"+"Sayı 3: ");
        int sayi3=scanner.nextInt();

        int buyuk=0;

        if (sayi1>0){
            buyuk=sayi1;
        }
        if (sayi2>buyuk){
            buyuk=sayi2;
        }

        if (sayi3>buyuk){
            buyuk=sayi3;
        }
        System.out.println("\n"+"En Büyüğü: "+buyuk);
        hangisiBuyuk();
    }
    private static void ustHesaplama(){
        System.out.println("\n"+"-----Üst Hesaplama-----"+"\n");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Taban sayısını giriniz: ");
        int taban= scanner.nextInt();
        System.out.print("\n"+"Tavan sayısını giriniz: ");
        int tavan= scanner.nextInt();
        int ust=taban;
        for (int i=1;i<tavan;i++){
            ust=ust*taban;
        }
        System.out.println("\n"+"Bulunan Üst: "+ust);
        ustHesaplama();
    }

    private static void notHesaplama(){
        System.out.println("\n"+"-----Puan Hesaplama-----"+"\n");
        String[] dersler={"Matematik","Fen Bilgisi","Türkçe","Tarih"};
        double[][] notlar=new double[dersler.length][2];
        double[] ortalama=new double[dersler.length];
        double karneOrtalama=0;
        Scanner scanner=new Scanner(System.in);

        for (int i=0;i< dersler.length;i++){
            System.out.println("-------------------");
            for (int j=0;j<notlar[i].length;j++){
                System.out.printf("%1s %2s. Sınav Puanını Giriniz:  ",dersler[i],j+1);
                notlar[i][j]= scanner.nextInt();
            }
        }

        for (int i=0;i< notlar.length;i++){
            System.out.println("\n"+"-----------------"+"\n");
            ortalama[i]=(notlar[i][0]+notlar[i][1])/2;
            System.out.println(dersler[i]+" dersi not ortalaması= "+ortalama[i]);
            karneOrtalama+=ortalama[i];
        }
        karneOrtalama=karneOrtalama/4;
        System.out.println("---------------"+"\n");
        if (karneOrtalama>85){
            System.out.println("Not Ortalamanız: "+karneOrtalama);
            System.out.println("Tebrikler Takdir Belgesi Kazandınız...");
            notHesaplama();
        } else if (karneOrtalama>70) {
            System.out.println("Not Ortalamanız: "+karneOrtalama);
            System.out.println("Tebrikler Teşşekür Belgesi Kazandınız...");
            notHesaplama();
        }else if (karneOrtalama>=50){
            System.out.println("Not Ortalamanız: "+karneOrtalama);
            System.out.println("Sınıfı Geçtiniz....");
            notHesaplama();
        }else {
            System.out.println("Not Ortalamanız: "+karneOrtalama);
            System.out.println("Sınıfta Kaldınız...");
            notHesaplama();
        }

    }
    private static void faizHesaplama(){
        System.out.println("-----Faiz Hesaplama-----"+"\n");
        Scanner scanner=new Scanner(System.in);

        System.out.print("Kredi Tutarını Giriniz: ");
        int kredi=scanner.nextInt();
        System.out.print("\n"+"Aylık Faiz Oranını Girniz: ");
        double faiz= scanner.nextDouble();
        System.out.print("\n"+"Vade Süresini giriniz: ");
        int vade=scanner.nextInt();

        double toplam=(kredi*faiz)*(vade);

        System.out.println("Toplam Geri Ödeme Tutarı: "+toplam);
    }
    private static void ciftTek(){
        System.out.println("-----Çift mi Tek mi-----"+"\n");

        Scanner scanner=new Scanner(System.in);

        System.out.print("Bir Sayı giriniz: ");
        int num=scanner.nextInt();

        if (num%2==0){
            System.out.println("Bu Sayı Çift.."+"\n");
            ciftTek();
        }else {
            System.out.println("Bu Sayı Tek.."+"\n");
            ciftTek();
        }
    }

}