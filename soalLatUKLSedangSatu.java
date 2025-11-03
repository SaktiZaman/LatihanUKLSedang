import java.util.Scanner;

public class soalLatUKLSedangSatu {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Masukkan bilangan untuk di factorial: ");
        int num = x.nextInt();
        int Final = 1;
        while (num > 0) {
            Final *= num;
            num--;
        }
        System.out.println(Final);
    }
}
