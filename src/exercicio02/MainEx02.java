package exercicio02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MainEx02 {
    public static void main(String[] args) {

        List<Empregado> listaEmpregados = new ArrayList<>();

        listaEmpregados.add(new Empregado("Rafael",1,10.00));
        listaEmpregados.add(new Empregado("Aroger",5,100.00));
        listaEmpregados.add(new Empregado("Mogerio",10,1000.00));
        listaEmpregados.add(new Empregado("Aeogerio",10,1000.00));
        listaEmpregados.add(new Empregado("Bogeria",3,1500.00));


        /*listaEmpregados.stream()
                .map(e -> new Empregado(e.nome(),e.anosExperiencia(),
                        e.salarioAtual() * (e.anosExperiencia() >= 5 ? 1.2 :  1.1)))
                .sorted(Comparator.comparing(Empregado::salarioAtual).reversed()
                        .thenComparing(Empregado :: nome))
                .forEach(System.out :: println);*/

        //Predicado --> filtro logico --> armazenado como um objeto
        Predicate<Empregado> filtro = e -> e.anosExperiencia() >= 5;

        /*listaEmpregados.stream()
                .map(e -> new Empregado(e.nome(),e.anosExperiencia(),
                        e.salarioAtual() * (filtro.test(e) ? 1.2 :  1.1)))
                .sorted(Comparator.comparing(Empregado::salarioAtual).reversed()
                        .thenComparing(Empregado :: nome))
                .forEach(System.out :: println);*/

        List<Empregado> aux = listaEmpregados.stream()
                .map(e -> new Empregado(e.nome(),e.anosExperiencia(),
                        e.salarioAtual() * (filtro.test(e) ? 1.2 :  1.1)))
                .sorted(Comparator.comparing(Empregado::salarioAtual).reversed()
                        .thenComparing(Empregado :: nome))
                .toList();

        aux.forEach(System.out :: println);
    }
}
