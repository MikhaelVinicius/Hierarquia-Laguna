package Entidades;

public class Auditio extends Anjos {

    private String personificacao;
    private String nome;
    private String historia;
    private String habilidades;
    private String categoria = "Auditio";


   public Auditio(String nome, String historia, String habilidade, String personificacao){
        super(nome, historia,habilidade,personificacao);
        this.personificacao = personificacao;
        this.nome = nome;
        this.habilidades = habilidade;
        this.historia = historia;


    }

    @Override
    public String getCategoria() {
        return categoria;
    }

    @Override
    public void exibirDadosDoAnjo(){
        System.out.println("Nome: " + nome);
        System.out.println("Hierarquia: "+categoria );
        System.out.println("Habilidades: " + habilidades);
        System.out.println("Historia: "+ historia);
        System.out.println("Personificação: "+personificacao);
    }



}
