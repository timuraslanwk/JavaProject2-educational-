package src.task3;

import java.util.Scanner;
import java.util.concurrent.ForkJoinTask;

public class _03_Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean kahveDogruMu = false;
        String hangiKahve;

        do {
            System.out.println("Hangi kahveyi istersiniz?");
            System.out.println("-Türk Kahvesi");
            System.out.println("-Filtre Kahve");
            System.out.println("-Espresso");

            System.out.print("Cevabınız: ");
            hangiKahve = scanner.nextLine();
            String[] kahve = {"Türk Kahvesi", "Filtre Kahve", "Espresso"};

            for (int i = 0; i < kahve.length; i++) {
                if (hangiKahve.equalsIgnoreCase(kahve[i])) {
                    System.out.println(kahve[i] + " hazırlanıyor...");
                    kahveDogruMu = true;
                }
            }
            if (!kahveDogruMu) System.out.println("Yanlış tuşlama. Lütfen tekrar deneyin.\n");

        } while (!kahveDogruMu);

        System.out.println("-----------------------");

        boolean sutVarMi = false;
        String sut;
        do {
            System.out.println("Süt eklememizi ister misiniz? (Evet veya Hayır olarak cevaplayınız):");
            sut = scanner.nextLine();
            if (sut.equalsIgnoreCase("evet")) {
                System.out.println("Süt ekleniyor...");
                sutVarMi = true;
                sut="Sütlü";


            } else if (sut.equalsIgnoreCase("hayır")) {
                System.out.println("Süt eklenmiyor.");
                sutVarMi = true;
                sut="Sütsüz";

            } else System.out.println("Yanlış tuşlama. Lütfen tekrar deneyin.\n");

        } while (!sutVarMi);

        System.out.println("-----------------------");

        boolean sekerTercihiYapildiMi = false;
        String seker;

        do {
            System.out.println("Şeker ister misiniz? (Evet veya Hayır olarak cevaplayınız):");
            seker = scanner.nextLine();
            if (seker.equalsIgnoreCase("evet")) {
                System.out.println("Kaç şeker istersiniz?: ");
                String sekerSayisi = scanner.nextLine();
                System.out.println(sekerSayisi + " şeker ekleniyor.");
                sekerTercihiYapildiMi = true;
                seker=sekerSayisi+" Şekerli";
            } else if (seker.equalsIgnoreCase("hayır")) {
                System.out.println("Şeker eklenmiyor.");
                sekerTercihiYapildiMi = true;
                seker="Şekersiz";
            } else System.out.println("Yanlış tuşlama. Lütfen tekrar deneyin.\n");

        } while (!sekerTercihiYapildiMi);

        System.out.println("-----------------------");

        boolean boyutTercihiYapildiMi = false;
        String boyut;

        do {
            System.out.println("Hangi boyutta istersiniz? (Büyük - Orta - Küçük olarak giriniz.) : ");
            boyut = scanner.nextLine();
            if (boyut.equalsIgnoreCase("büyük")) {
                System.out.println("Kahveniz " + boyut + " boyutta hazırlanıyor...");
                boyutTercihiYapildiMi = true;
            } else if (boyut.equalsIgnoreCase("orta")) {
                System.out.println("Kahveniz " + boyut + " boyutta hazırlanıyor...");
                boyutTercihiYapildiMi = true;
            } else if (boyut.equalsIgnoreCase("küçük")) {
                System.out.println("Kahveniz " + boyut + " boyutta hazırlanıyor.");
                boyutTercihiYapildiMi = true;
            } else System.out.println("Lütfen geçerli bir boyut giriniz.\n");
        } while (!boyutTercihiYapildiMi);

        System.out.println();
        System.out.println();

        System.out.println(sut + "," + seker + "," + boyut + " boy ," + hangiKahve + " hazır. Afiyet olsun!");




    }
}
