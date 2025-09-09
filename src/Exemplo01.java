import java.util.stream.IntStream;

public class Exemplo01 {
    public static void main(String[] args) {
        int[] x = {1,5,4,3,6,8,2,11,7};

        IntStream fluxo = IntStream.of(x);

        fluxo.filter( valor -> valor % 2 == 1)
                .sorted()
                .forEach(System.out :: println);
    }
}
