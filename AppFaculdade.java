public class AppFaculdade {

    public static void main(String[] args) {
        Prova prova1 = new Prova("Prova", 2.0);
        prova1.adicionarNota(7.5);
        prova1.adicionarNota(8.0);

        Prova prova2 = new Prova("Prova", 2.0);
        prova2.adicionarNota(9.0);
        prova2.adicionarNota(7.0);

        Prova trabalho = new Prova("Trabalho", 1.0);
        trabalho.adicionarNota(6.5);
        trabalho.adicionarNota(7.0);
        trabalho.adicionarNota(8.0);

        Prova interdisciplinar = new Prova("Interdisciplinar", 2.0);
        interdisciplinar.adicionarNota(6.0);
        interdisciplinar.adicionarNota(7.5);
        interdisciplinar.adicionarNota(8.0);
        interdisciplinar.adicionarNota(9.0);

        Semestre semestre = new Semestre();
        semestre.adicionarAvaliacao(prova1);
        semestre.adicionarAvaliacao(prova2);
        semestre.adicionarAvaliacao(trabalho);
        semestre.adicionarAvaliacao(interdisciplinar);

        System.out.println("Peso das avaliações válido? " + semestre.pesoValido());
        System.out.println("Média do semestre: " + semestre.calcularMedia());
        System.out.println("Resultado do semestre: " + semestre.resultado());
    }


}
