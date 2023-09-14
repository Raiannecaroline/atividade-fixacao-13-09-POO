public class Semestre {

    private Prova[] provas;

    public Semestre() {
        provas = new Prova[4];
        provas[0] = new Prova("Prova", 2, 2);
        provas[1] = new Prova("Trabalho", 1, 3);
        provas[2] = new Prova("Interdisciplinar", 2, 3);
        provas[3] = new Prova("Interdisciplinar (Peso 4)", 4, 1);
    }

    public Prova[] getProvas() {
        return provas;
    }

    public boolean validarPesos() {
        double somaPesos = 0;
        for (Prova prova : provas) {
            somaPesos += prova.getPeso();
        }
        return somaPesos == 7;
    }

    public double calcularMedia() {
        double somaPontos = 0;
        for (Prova avaliacao : provas) {
            somaPontos += avaliacao.calcularPontos();
        }
        return somaPontos / 7;
    }

    public String resultado() {
        return calcularMedia() >= 5 ? "APROVADO" : "REPROVADO";
    }

}
