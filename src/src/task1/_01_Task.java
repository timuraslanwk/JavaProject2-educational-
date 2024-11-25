package src.task1;

import java.util.Scanner;

public class _01_Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] bilgiler = new String[2];

        System.out.print("Kullanıcı adınızı belirleyiniz: ");
        String kullaniciAdi = scanner.nextLine();

        do {
            System.out.print("Şifrenizi belirleyiniz: ");
            bilgiler[0] = scanner.nextLine();

            System.out.print("Şifrenizi tekrar giriniz: ");
            bilgiler[1] = scanner.nextLine();

            if (!bilgiler[0].equals(bilgiler[1])) {
                System.out.println("Şifreleriniz eşleşmedi tekrar deneyiniz.");
            }
        } while (!bilgiler[0].equals(bilgiler[1]));

        System.out.println("Kullanıcı oluşturuldu.");

        System.out.println();

        System.out.println("---Giriş");

        int sifreHakki = 3;
        int sifreSayac = 1;


        while (sifreSayac < 4 ) {

            System.out.print("Kullanıcı Adı:");
            String giris1 = scanner.nextLine();

            if (giris1.equals(kullaniciAdi)) {

                System.out.print("Şifrenizi giriniz:");
                String giris2 = scanner.nextLine();

                if (giris2.equals(bilgiler[0])) {
                    System.out.println("Basarılı bir şekilde giriş yaptınız. " + kullaniciAdi + " kullanıcısı olarak sisteme hoşgeldiniz.");
                    sifreSayac+=4;
                } else {
                    sifreSayac++;
                    sifreHakki--;
                    System.out.println("Hatalı giriş yaptınız. " + sifreHakki + " Hakkınız kaldı.");
                    System.out.println();
                }
            }
            if (sifreSayac == 4) {
                System.out.println("Üzgünüm, 3 kez üst üste yanlış giriş yaptınız. Daha sonra tekrar deneyiniz.");
            }
        }
    }
}
