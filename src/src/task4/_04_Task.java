package src.task4;

import java.util.Scanner;

public class _04_Task {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Bulunduğunuz ayı giriniz(Sayı formatında): ");
        int ay = scn.nextInt();
        System.out.print("Günü giriniz(Sayı formatında): ");
        int gun = scn.nextInt();

        String mevsim = "";

        if (gun<=0 || gun>=32 && ay<=0 || ay>=13){
            System.out.println("Lütfen geçerli bir ay/gün numarası giriniz.");
        } else {

            switch (ay) {

                case 1:
                case 2:
                    mevsim = "Kış";
                    System.out.println("Şuan ki mevsim:" + mevsim);
                    break;
                case 3:
                    if (gun <= 19) {
                        mevsim = "Kış";
                    } else mevsim = "İlkbahar";
                    System.out.println("Şuan ki mevsim:" + mevsim);
                    break;
                case 4:
                case 5:
                    mevsim = "İlkbahar";
                    System.out.println("Şuan ki mevsim:" + mevsim);
                    break;
                case 6:
                    if (gun <= 20) {
                        mevsim = "İlkbahar";
                    } else mevsim = "Yaz";
                    System.out.println("Şuan ki mevsim:" + mevsim);
                    break;
                case 7:
                case 8:
                    mevsim = "Yaz";
                    System.out.println("Şuan ki mevsim:" + mevsim);
                    break;
                case 9:
                    if (gun <= 21) {
                        mevsim = "Yaz";
                    } else mevsim = "Sonbahar";
                    System.out.println("Şuan ki mevsim:" + mevsim);
                    break;
                case 10:
                case 11:
                    mevsim = "Sonbahar";
                    System.out.println("Şuan ki mevsim:" + mevsim);
                    break;
                case 12:
                    if (gun <= 20) {
                        mevsim = "Sonbahar";
                    } else mevsim = "Kış";
                    System.out.println("Şuan ki mevsim:" + mevsim);
                    break;
                default:

            }


        }

    }
}
