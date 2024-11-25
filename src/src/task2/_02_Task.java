package src.task2;

public class _02_Task {
    public static void main(String[] args) {

        String inputText = "xxxxqqqqkkkkfffppp";   //0-12 index   1-13 uzunluğunda

        System.out.println("compressText(inputText) = " + compressText(inputText));

    }

    static String compressText(String metin) {

        String outputText = "";

        int uzunluk = metin.length(); //13

        int sayac = 1;

        for (int i = 1; i <= uzunluk; i++) {

            if (i != uzunluk) {

                if (metin.charAt(i - 1) == metin.charAt(i)) {
                    sayac++;
                } else {
                    outputText = outputText.concat(String.valueOf(sayac) + metin.charAt(i - 1));
                    sayac = 1;
                }
            } else { outputText= outputText+sayac+(metin.charAt(i-1));

            }
        }

        return outputText;

    }


}
