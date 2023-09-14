import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prova {

    private double[] notas;
    private double peso;
    private String tipo;

    public Prova(String tipo, double peso, int numeroNotas) {
        this.notas = new double[numeroNotas];
        this.peso = peso;
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setNotas(Scanner scanner) {
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota " + (i + 1) + " para " + tipo + ": ");
            notas[i] = scanner.nextDouble();
        }
    }

    public double calcularNotaFinal() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public double calcularPontos() {
        return calcularNotaFinal() * peso;
    }
}
