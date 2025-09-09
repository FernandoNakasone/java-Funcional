import java.util.stream.IntStream;

public class Exemplo01 {
    public static void main(String[] args) {
        int[] x = {1,5,4,3,6,8,2,11,7};

        IntStream fluxo = IntStream.of(x);
        IntStream fluxo2 = IntStream.of(x);
        IntStream fluxo3 = IntStream.of(x);

        //filtro apenas os números ímpares e coloca em ordem crescente
        fluxo.filter( valor -> valor % 2 == 1)
                .sorted()
                .forEach(System.out :: println);

        System.out.println("---------------------------------------------------------------");

        //Filtrar os números pares, somar 10 unidade e colocar em ordem crescente

        fluxo2.filter(valor -> valor % 2 == 0)
                .map(valor -> valor + 10)
                .sorted()
                .forEach(System.out :: println);

        System.out.println("---------------------------------------------------------------");

        //impressão da soma dos elementos

        int total = fluxo3.reduce(0,(a,b) -> a + b);
        System.out.println(total);
    }
}
