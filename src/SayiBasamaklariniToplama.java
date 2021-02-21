import java.util.Scanner;

public class SayiBasamaklariniToplama {

  public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Sayınızı giriniz: ");
            int s = input.nextInt();

            System.out.println("Basamakları toplamı:  " + toplama(s));

        }

        public static int toplama(int s) {
            int toplama = 0;
            while (s != 0) {
                toplama += s % 10;
                s /= 10;
            }
            return toplama;
        }
    }

