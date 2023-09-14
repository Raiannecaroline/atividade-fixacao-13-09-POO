import java.util.Scanner;

public class AppFaculdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Semestre semestre = new Semestre();

        System.out.println("Informe as notas para cada avaliação:");
        for (Prova prova : semestre.getProvas()) {
            prova.setNotas(scanner);
        }

        if (semestre.validarPesos()) {
            System.out.println("Média: " + semestre.calcularMedia());
            System.out.println("Resultado: " + semestre.resultado());
        } else {
            System.out.println("A soma dos pesos das avaliações não é igual a 7.");
        }

        scanner.close();
    }

}
