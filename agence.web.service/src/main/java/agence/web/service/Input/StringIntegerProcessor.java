package agence.web.service.Input;

import java.util.Scanner;

public class StringIntegerProcessor implements InputProcessor<String> {

    private String inputType;

    public StringIntegerProcessor(String inputType) {
        this.inputType = inputType;
    }

    @Override
    public String processInput(Scanner scanner) {
        String input;
        while (true) {
            System.out.print("Entrez " + inputType + " (uniquement des chiffres) : ");
            input = scanner.nextLine().trim();
            if (!input.isEmpty() && input.matches("\\d+")) {
                break;
            }
            System.out.println(inputType + " invalide. Seuls les chiffres sont autorisés.");
        }
        return input;
    }

	@Override
	public String processInput(String date, Scanner scanner) {
		// TODO Auto-generated method stub
		return null;
	}
}
