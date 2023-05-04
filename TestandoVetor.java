import java.util.ArrayList;

public class TestandoVetor {
    public static void main(String[] args) {
        String aula1 = "Modelando aula de Vetor";
        String aula2 = "Aprendendo sobre lista";
        String aula3 = "Trabalhando com classe e método";

        //Vetor - Array

        ArrayList<String> aulas = new ArrayList<>();
        for (int i=0; i<3; i++) {
            System.out.println(aulas);
        }
    }
}
