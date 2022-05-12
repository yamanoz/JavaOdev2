import java.util.Scanner;

public class Main {
    public static void main(String[] args){

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







        //havaDurum();


        //sinifGecme();


        //kullaniciGiris();


        //hesapMakinasi();


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
