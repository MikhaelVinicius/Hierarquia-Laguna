import Entidades.Anjos;
import Entidades.Auditio;
import Entidades.Dea;
import Entidades.Enciclopedia;


public class Main {

    public static void main(String[] args){
        Anjos aplause = new Anjos("Aplause", "Anjo da terceira esfera","Todas","Terceira Esfera");
        Auditio fortitudo = new Auditio("Fortitudo", "Tem a forma de dois dragões", "Todas de um Auditio", "Caos");
        Auditio temperace = new Auditio("Justice","Audito responsavel pela justiça","Todas de Auditio","Justiça");
        Dea jubileu = new Dea();


        Enciclopedia listar = new Enciclopedia();
        listar.listarAnjo(aplause);
        listar.listarAnjo(fortitudo);
        listar.listarAnjo(jubileu);
        listar.listarAnjo(temperace);
        //Enciclopedia.exibirQuantidadeDeAnjos(listar);
        listar.acessarAnjoPorNome("Aplause");
    }


}
