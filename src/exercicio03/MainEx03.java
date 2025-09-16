package exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainEx03 {
    public static void main(String[] args) {

        List<Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(new Produto("A",125,"Eletrônico"));
        listaProdutos.add(new Produto("B",1000,"Eletrônico"));
        listaProdutos.add(new Produto("C",2000,"Brinquedo"));
        listaProdutos.add(new Produto("D",200,"Brinquedo"));
        listaProdutos.add(new Produto("E",10000,"Eletrônico"));
        Predicate<Produto> filtro =  c -> c.getCategoria().equalsIgnoreCase("Eletrônico") && c.getPreco() >= 1000;


        listaProdutos.stream().map(p -> filtro.test(p) ? new Produto(p.getNome().toUpperCase(),
                p.getPreco() * 1.1, p.getCategoria()) : null).toString();

        List<String> eletronicos = new ArrayList<>();

        for(Produto p : listaProdutos){
            if(p != null){
                eletronicos.add(p.toString());
            }
        }

        eletronicos.forEach(System.out::println);
    }
}
