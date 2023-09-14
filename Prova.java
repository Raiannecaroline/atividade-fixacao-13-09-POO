import java.util.ArrayList;
import java.util.List;

public class Prova {

    private List<Double> notas;
    private double peso;
    private String tipo;

    public Prova(String tipo, double peso) {
        this.notas = new ArrayList<>();
        this.peso = peso;
        this.tipo = tipo;
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public double calcularNotaFinal() {
        double somaNotas = 0;
        for (Double nota : notas) {
            somaNotas += nota;
        }
        return somaNotas / notas.size();
    }

    public double calcularPontos() {
        return calcularNotaFinal() * peso;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPeso() {
        return peso;
    }
}
