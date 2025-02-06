import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //ciftTek();
        //faizHesaplama();
        //notHesaplama();
        //ustHesaplama();
        hangisiBuyuk();
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
        String[] dersler={"Mat","Fen","Türkçe","Tarih"};
        double[][] notlar=new double[dersler.length][1];
        Scanner scanner=new Scanner(System.in);

        System.out.print("Matematik Not Ortalamasını Giriniz: ");
        double notMat= scanner.nextDouble();
        System.out.print("\n"+"Fen Bilgisi Not Ortalamasını Giriniz: ");
        double notFen= scanner.nextDouble();
        System.out.print("\n"+"Türkçe Not Ortalamasını Giriniz: ");
        double notTurkce=scanner.nextDouble();
        System.out.print("\n"+"Tarih Not Ortalamasını Giriniz: ");
        double notTarih= scanner.nextDouble();

        double ortalama=(notFen+notMat+notTarih+notTurkce)/4;

        if (ortalama>85){
            System.out.println("Not Ortalamanız: "+ortalama);
            System.out.println("Tebrikler Takdir Belgesi Kazandınız...");
            notHesaplama();
        } else if (ortalama>70) {
            System.out.println("Not Ortalamanız: "+ortalama);
            System.out.println("Tebrikler Teşşekür Belgesi Kazandınız...");
            notHesaplama();
        }else if (ortalama>=50){
            System.out.println("Not Ortalamanız: "+ortalama);
            System.out.println("Sınıfı Geçtiniz....");
            notHesaplama();
        }else {
            System.out.println("Not Ortalamanız: "+ortalama);
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