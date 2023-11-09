public class Esportista extends Pessoa{
    private int idFederacao;

    //construtores
    public Esportista(int idFederacao) {
        this.idFederacao = idFederacao;
    }

    public Esportista() {
    }

    //método
    public String sacar(){
        return "Saque viagem...";
    }

}
