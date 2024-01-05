package Entidades;

public class Anjos {


    private String nome;
    private String historia;
    private String habilidades;
    private String categoria;

    public Anjos(String nome, String historia, String habilidades, String categoria) {
        this.nome = nome;
        this.historia = historia;
        this.habilidades = habilidades;
        switch (categoria){
            case "Terceira Esfera":
                this.categoria = categoria;
                break;
            case "Segunda Esfera":
                this.categoria = categoria;
                break;
            case "Primeira Esfera":
                this.categoria = categoria;
            default:
                this.categoria = "Categoria Invalida";
        }

    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void exibirDadosDoAnjo() {


        System.out.println("Nome: " + nome);
        System.out.println("Hierarquia: " + categoria);
        System.out.println("Habilidades: " + habilidades);
        System.out.println("Historia: " + historia);


    }
}
