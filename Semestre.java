import java.util.ArrayList;
import java.util.List;

public class Semestre {

    private List<Prova> provas;

    public Semestre() {
        provas = new ArrayList<>();
    }

    public void adicionarAvaliacao(Prova prova) {
        provas.add(prova);
    }

    public boolean pesoValido() {
        double somaPesos = 0;
        for (Prova prova : provas) {
            somaPesos += prova.getPeso();
        }
        return somaPesos == 7.0;
    }

    public double calcularMedia() {
        double media = 0;
        for (Prova prova : provas) {
            media += prova.calcularPontos();
        }
        return media;
    }

    public String resultado() {
        if (pesoValido()) {
            double media = calcularMedia();
            if (media >= 5.0) {
                return "APROVADO";
            } else {
                return "REPROVADO";
            }
        } else {
            return "Peso das avaliações inválido";
        }
    }

}
