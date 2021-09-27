
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
class CarpmaException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("İki sayı da çok büyük. Lütfen daha küçük sayılar girin....");

    }


}

public class Main {
    public static void main(String[] args) {
        // Switch Case Kullanarak 4 işlem yapan bir hesap makinesi tasarlamaya çalışın.
        Scanner scanner = new Scanner(System.in);
        System.out.println("************************************");
        String islemler = "1. Toplama İşlemi\n"
                +"2. Çıkarma İşlemi\n"
                +"3. Çarpma İşlemi\n"
                +"4. Bölme İşlemi";
        System.out.println(islemler);
        System.out.println("************************************");
        System.out.println("İşlemi Seçiniz:");
        String islem = scanner.nextLine();
        int a;
        int b;
        try {
            switch(islem){
                case "1":
                    System.out.print("Birinci Sayı: ");
                    a = scanner.nextInt();
                    System.out.print("İkinci Sayı: ");
                    b = scanner.nextInt();
                    System.out.println("Girilen Değerlerin Toplamları : " + (a+b));
                    break;
                case "2":
                    System.out.print("Birinci Sayı: ");
                    a = scanner.nextInt();
                    System.out.print("İkinci Sayı: ");
                    b = scanner.nextInt();
                    System.out.println("Girilen Değerlerin Farkları : " + (a-b));
                    break;
                case "3":
                    System.out.print("Birinci Sayı: ");
                    a = scanner.nextInt();
                    System.out.print("İkinci Sayı: ");
                    b = scanner.nextInt();
                    if (a > 10000 && b > 10000) {
                        throw new CarpmaException();

                    }
                    System.out.println("Girilen Değerlerin Çarpımları : " + (a * b));
                    break;
                case "4":
                    System.out.print("Birinci Sayı: ");
                    a = scanner.nextInt();
                    System.out.print("İkinci Sayı: ");
                    b = scanner.nextInt();
                    System.out.println("Girilen Değerlerin Bölümü : " + (a / b));
                    break;
                default:
                    System.out.println("Geçersiz İşlem");





            }
        }
        catch (ArithmeticException e) {
            System.out.println("Bir sayı 0'a bölünemez...");
        }
        catch(InputMismatchException e) {
            System.out.println("Lütfen Inputları Doğru Formatta Girin...");
        } catch (CarpmaException ex) {
            ex.printStackTrace();

        }

    }
}
