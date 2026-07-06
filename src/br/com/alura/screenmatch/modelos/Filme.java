public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    void exibeFichaTecnica(){
        System.out.println("Nome do filme" + nome);
        System.out.println("Ano de lançamento:" + anoDeLancamento);
    } // Fecha o método

    void avalia(double nota){
        avaliacao = nota;

    }

    double pegaMedia(){
        return avaliacao/totalDeAvaliacoes;
    }
} // Fecha a classe
