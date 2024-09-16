import java.util.Scanner;

public class UcgenAlaniHesapla {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kenar uzunluklarını al
        System.out.print("Birinci kenar uzunluğunu girin: ");
        double a = scanner.nextDouble();
        
        System.out.print("İkinci kenar uzunluğunu girin: ");
        double b = scanner.nextDouble();
        
        System.out.print("Üçüncü kenar uzunluğunu girin: ");
        double c = scanner.nextDouble();
        
        // Kenar uzunluklarının geçerli olup olmadığını kontrol et
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Kenar uzunlukları pozitif olmalıdır.");
            return;
        }
        
        // Üçgenin geçerli olup olmadığını kontrol et
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Bu uzunluklarla geçerli bir üçgen oluşturulamaz.");
            return;
        }
        
        // Alanı hesapla
        double alan = hesaplaUcgenAlani(a, b, c);
        System.out.printf("Üçgenin alanı: %.2f%n", alan);
        
        scanner.close();
    }
    
    public static double hesaplaUcgenAlani(double a, double b, double c) {
        // Yarı çevreyi hesapla
        double u = (a + b + c) / 2;
        
        // Alan² hesapla
        double alanKare = u * (u - a) * (u - b) * (u - c);
        
        // Alanı hesapla
        return Math.sqrt(alanKare);
    }
}
