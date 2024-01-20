package agence.web.service.Input;

import java.util.Scanner;

public class IntegerInputProcessor implements InputProcessor<Integer> {

    private String inputType;
    private int min;
    private int max;

    public IntegerInputProcessor(String inputType, int min, int max) {
        this.inputType = inputType;
        this.min = min;
        this.max = max;
    }

    @Override
    public Integer processInput(Scanner scanner) {
        int input;
        while (true) {
            System.out.print("Entrez " + inputType + " : ");
            input = scanner.nextInt();
            if (input >= min && input <= max) {
                break;
            }
            System.out.println(inputType + " invalide. Veuillez entrer un nombre entre " + min + " et " + max + ".");
            scanner.nextLine(); // Nettoie le buffer d'entrée
        }
        scanner.nextLine(); // Prépare pour la prochaine entrée de chaîne
        return input;
    }


	@Override
	public Integer processInput(Integer date, Scanner scanner) {
		return null;
	}
}