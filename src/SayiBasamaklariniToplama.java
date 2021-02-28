import java.util.Scanner;

public class SayiBasamaklariniToplama {

  public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Sayınızı giriniz: ");
            int sayi = input.nextInt();

            System.out.println("Basamakları toplamı:  " + toplama(sayi));

        }

        public static int toplama(int sayi) {
            int toplama = 0;
            while (sayi != 0) {
                toplama += sayi % 10;
                sayi /= 10;
            }
            return toplama;
        }
    }

