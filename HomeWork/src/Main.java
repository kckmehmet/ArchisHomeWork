import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //ciftTek();
        //faizHesaplama();
        //notHesaplama();
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