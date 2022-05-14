import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Yil Giriniz :");
        int yil=sc.nextInt();
        String artik="";
        if(yil%4==0){
            artik="Artik";
            if(yil%100==0){
                if(yil%400==0){
                    artik="Artik";
                }
                else {
                    artik="Artik yil degildir";
                }
            }


        }
        else {
            artik="Artik yil degildir";
        }
        System.out.print(yil+" yil "+artik);
        //cinZodyagi();


        //ucak();


        //burcBulma();


        //enKugeGoreSiralama();


        //havaDurum();


        //sinifGecme();


        //kullaniciGiris();


        //hesapMakinasi();


    }

    private static void cinZodyagi() {
        int dogumTarihi;
        String burc="";
        Scanner sc=new Scanner(System.in);
        System.out.print("Dogum yiliniza giriniz :");
        dogumTarihi=sc.nextInt();
        if(dogumTarihi%12==0)
        {
            burc="Maymun";
        }
        else if(dogumTarihi%12==1)
        {
            burc="Horoz";
        }
        else if(dogumTarihi%12==2)
        {
            burc="Kopek";
        }
        else if(dogumTarihi%12==3)
        {
            burc="Domuz";
        }
        else if(dogumTarihi%12==4)
        {
            burc="Fare";
        }
        else if(dogumTarihi%12==5)
        {
            burc="Okuz";
        }
        else if(dogumTarihi%12==6)
        {
            burc="Kaplan";
        }
        else if(dogumTarihi%12==7)
        {
            burc="Tavsan";
        }
        else if(dogumTarihi%12==8)
        {
            burc="Ejderha";
        }
        else if(dogumTarihi%12==9)
        {
            burc="Yilan";
        }
        else if(dogumTarihi%12==10)
        {
            burc="Ay";
        }
        else if(dogumTarihi%12==11)
        {
            burc="Koyun";
        }
        else {
            System.out.print("Burcunuz bulunamadi!!!");
        }
        System.out.print("Cin Zodyagi Burcunuz :"+burc);
    }


    private static void ucak() {
        double perKM=0.10,Tutar;
        int yas,KM,tip;
        Scanner sc=new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz :");
        KM=sc.nextInt();
        System.out.print("Yasiniza giriniz :");
        yas=sc.nextInt();
        System.out.print("Yolculuk tipine giriniz :\n1=> Tek Yon \n2=>Gidis Donus\n:");
        tip=sc.nextInt();
        if(yas>=1&&KM>=1){

            Tutar=perKM*KM;
            if(yas<12){
                Tutar=Tutar-(Tutar*0.5);
                if(tip==2){
                    Tutar=(Tutar-(Tutar*0.2))*2;
                }
            } else if (yas>12&&yas<24) {
                Tutar=Tutar-(Tutar*0.1);
                if(tip==2){
                    Tutar=(Tutar-(Tutar*0.2))*2;
                }

            } else if (yas>65) {

                Tutar=Tutar-(Tutar*0.3);
                if(tip==2){
                    Tutar=(Tutar-(Tutar*0.2))*2;
                }

            }
            System.out.print("Toplam Tutar :" +Tutar);
        }
        else{
            System.out.print("Hatali");
        }

    }

    private static void burcBulma() {
        boolean err=false;
        int ay,gun;
        String burc="";
        Scanner input=new Scanner(System.in);
        System.out.print("Ay :");
        ay=input.nextInt();
        System.out.print("Gun :");
        gun=input.nextInt();

        if(ay==1)
        {
            if(gun<=31&&gun>=1)
            {
                burc=gun<22?"Oglak":"Kova";
                err=true;
            }

        }
        if(ay==2)
        {
            if(gun<=31&&gun>=1)
            {
                burc = gun < 20 ? "Kova" : "Balik";
                err=true;
            }
        }
        if(ay==3)
        {
            if(gun<=31&&gun>=1)
            {
                burc=gun<21?"Balik":"Koc";
                err=true;
            }

        }
        if(ay==4)
        {
            if(gun<=30&&gun>=1)
            {
                burc=gun<21?"Koc":"Boga";
                err=true;
            }

        }
        if(ay==5)
        {
            if(gun<=31&&gun>=1)
            {
                burc=gun<22?"Boga":"Ikizler";
                err=true;
            }

        }
        if(ay==6)
        {
            if(gun<=30&&gun>=1)
            {
                burc=gun<22?"Ikizler":"Yengec";
                err=true;
            }

        }
        if(ay==7)
        {
            if(gun<=31&&gun>=1)
            {
                burc=gun<23?"Yengec":"Aslan";
                err=true;
            }

        }
        if(ay==8)
        {
            if(gun<=31&&gun>=1)
            {
                burc=gun<23?"Aslan":"Basak";
                err=true;
            }

        }
        if(ay==9)
        {
            if(gun<=30&&gun>=1)
            {
                burc=gun<23?"Basak":"Terazi";
                err=true;
            }

        }
        if(ay==10)
        {
            if(gun<=31&&gun>=1)
            {
                burc=gun<23?"Terazi":"Akrep";
                err=true;
            }

        }
        if(ay==11)
        {
            if(gun<=30&&gun>=1)
            {
                burc=gun<22?"Akrep":"Yay";
                err=true;
            }

        }
        if(ay==12)
        {
            if(gun<=31&&gun>=1)
            {
                burc=gun<22?"Yay":"Oglak";
                err=true;
            }

        }
        if(err){
            System.out.print("Burcunuz :"+burc);
        }
        else
            System.out.print("Lutfen Dogru Gun Sayisi Giriniz !!!");
    }

    private static void enKugeGoreSiralama() {
        int a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.print("1. sayi :");
        a=input.nextInt();
        System.out.print("2. sayi :");
        b=input.nextInt();
        System.out.print("3. sayi :");
        c=input.nextInt();
        if(a<b&&a<c){
            if(b<c){
                System.out.print("a<b<c");
            }
            else {
                System.out.print("a<c<b");
            }
        }
        if(b<a&&b<c){
            if(a<c){
                System.out.print("b<a<c");
            }
            else {
                System.out.print("b<c<a");
            }
        }
        if(c<a&&c<b){
            if(a<b){
                System.out.print("c<a<b");
            }
            else {
                System.out.print("c<b<a");
            }
        }
    }

    private static void havaDurum() {
        int heat;
        Scanner input=new Scanner(System.in);
        System.out.print("Sıcaklik Degerine Giriniz :");
        heat=input.nextInt();
        if(heat<5){
            System.out.print("Kayak yapabilirsiniz :");
        }
        if(heat>5 && heat<25){
            if(heat<15){
                System.out.print("Sinamaya Gidebilirsiniz ");
            }
            else{
                System.out.print("Piknik Yapabilirsiniz");
            }
        }
        if(heat>25){
            System.out.print("Yüzmeye Gidebilirsiniz");
        }
    }

    private static void sinifGecme() {
        int mat,fiz,turkce,kimya,muzik;
        Scanner input=new Scanner(System.in);
        System.out.print("Matematik Notunuz :");
        mat=input.nextInt();
        System.out.print("Fizik Notunuz :");
        fiz=input.nextInt();
        System.out.print("Turkce Notunuz :");
        turkce=input.nextInt();
        System.out.print("Kimya Notunuz :");
        kimya=input.nextInt();
        System.out.print("Muzik Notunuz :");
        muzik=input.nextInt();
        if(mat<0 ||mat>100) mat=0;
        if(fiz<0 ||fiz>100) fiz=0;
        if(turkce<0 ||turkce>100) turkce=0;
        if(kimya<0 ||kimya>100) kimya=0;
        if(muzik<0 ||muzik>100) muzik=0;
        double avarege=(mat+fiz+kimya+turkce+muzik)/5;
        String durum=avarege>55? "Gecti":"Kaldi";
        System.out.print("Durumu  :"+durum);
    }

    private static void kullaniciGiris() {
        String userName,password;
        Scanner scan=new Scanner(System.in);
        System.out.print("Kullanici Adiniz :");
        userName=scan.nextLine();
        System.out.print("Sifreniz :");
        password=scan.nextLine();
        if(userName.equals("patika")&&password.equals("java123")){
            System.out.print("Giris Yaptiniz");
        }else{
            System.out.print("Sifre Hatali\nSifrenizi degistirmek icin Evet ise 1, Hayir ise 0 giriniz :  ");
            int select=scan.nextInt();
            switch (select){
                case 1:
                    System.out.print("Eski Sifreden farkli bir sifre giriniz :");
                    Scanner input=new Scanner(System.in);

                    String newPasword=input.nextLine();
                    if(newPasword.equals("java123")){
                        System.out.println("Lütfen Eskisinden farkli bir sifre giriniz!!!");
                    }
                    else

                        System.out.print("Sifre Basarili ile Degistirildi");
                    break;
                case 2:
                    System.out.print("Sifre Degistirilmesi.");
                    break;
            }
        }
    }

    private static void hesapMakinasi() {
        Scanner scan=new Scanner(System.in);
        System.out.print("İlk sayiya giriniz : ");
        int number1=scan.nextInt();
        System.out.print("İkinci sayiya giriniz : ");
        int number2=scan.nextInt();
        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Seciminiz :");
        int select=scan.nextInt();
        switch(select){
            case 1:
                System.out.print("Toplam :"+(number1+number2));
                break;
            case 2:
                System.out.print("Cikarma :"+(number1-number2));
                break;
            case 3:
                System.out.print("Carpma :"+(number1*number2));
                break;
            case 4:
                System.out.print("Bolme :"+(number1/number2));
                break;
            default:
                System.out.print("Hatalı Secim Yaptiniz!!!");
        }
    }
}
