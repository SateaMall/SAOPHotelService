package agence.web.service.Input;

import java.util.Scanner;

public class StringInputProcessor implements InputProcessor<String> {

    public StringInputProcessor() {}

    @Override
    public String processInput(Scanner scanner) {
        String input;
        while (true) {
            input = scanner.nextLine().trim();
            if (!input.isEmpty() && input.matches("[a-zA-Z ]+")) {
                break;
            }
            System.out.println( "String invalide. Veuillez réessayer.");
        }
        return input;
    }



	@Override
	public String processInput(String date, Scanner scanner) {
		// TODO Auto-generated method stub
		return null;
	}
}