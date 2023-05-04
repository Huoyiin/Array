import java.util.ArrayList;
import java.util.Collections;

public class TestandoAwarrayList {
    public static void main(String[] args) {
        String aula1 = "Modelando aula de Vetor";
        String aula2 = "Aprendendo sobre lista";
        String aula3 = "Trabalhando com classe e método";

        //Vetor - Array

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        System.out.println(aulas);
        System.out.println("For Normal");
        for (int i = 0; i < aulas.size(); i++) {
            System.out.println(aulas.get(i));
        }
        System.out.println("Foreach");
        for (String aula : aulas) {
            System.out.println(aula);
        }
        System.out.println("Foreach lambda");
        aulas.forEach(nova -> {
            System.out.println(nova);
        });
        System.out.println("Ordenação");
        Collections.sort(aulas);
        for (String aula : aulas) {
            System.out.println(aula);
        }
    }
}
