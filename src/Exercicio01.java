import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exercicio01 {
    public static void main(String[] args) {
        String[] nomes = {"Ana","Andre","Amanda","Roberto","Selchu purtioleo"};
        List<String> listaNomes = Arrays.asList(nomes);
        listaNomes.stream().filter(nome -> nome.startsWith("A"))
                .map(nome -> nome.toLowerCase())
                .forEach(System.out :: println);
    }
}
