// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.List;
import java.util.ArrayList;

public class Zadacha1 {
    public static void main(String[] args) {
        nNumber(10);
    }
    public static void nNumber(int n) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int t = i*(i+1)/2;
            integers.add(t);
            for (int value : integers) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
            
        }
}