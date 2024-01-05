package Entidades;

import java.util.ArrayList;

public class Enciclopedia {


    ArrayList<Anjos> lista = new ArrayList<>();

    public void listarAnjo(Anjos anjos) {

        lista.add(anjos);

    }

    public void exibirTodosOsNomesListados() {
        for (int i = 0; i <= lista.size(); i++) {

                System.out.println(lista.get(i).getNome());
        }
    }
    public void exibirNomesPorCategoria(String categoria) {
        for (int i = 0; i <= lista.size(); i++) {
            if(categoria.equals(lista.get(i).getCategoria())){
                System.out.println(lista.get(i).getNome());
            }

        }

    }

    public static void exibirQuantidadeDeAnjos(Enciclopedia enciclopedia){

        System.out.println("A quantidade de anjos listado é: " + enciclopedia.lista.size());

    }

    public void acessarAnjoPorNome(String nome) {
        for (int i = 0; i < lista.size(); i++) {
            if (nome.equals(lista.get(i).getNome())) {
                lista.get(i).exibirDadosDoAnjo();
            }
        }

    }







}



