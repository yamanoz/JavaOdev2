import java.util.Scanner;

public class Main {
    public static void main(String[] args){
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






        //hesapMakinasi();


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
