package agence.web.service.Input;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DateInputProcessor implements InputProcessor<List<Integer>> {

	public DateInputProcessor() {}
	
    public List<Integer> processInput(Scanner scanner) {
        LocalDate date = null;
        while (date == null) {
            try {
                System.out.print("Entrez la date (jour mois année) : ");
                int day = scanner.nextInt();
                int month = scanner.nextInt();
                int year = scanner.nextInt();

                // Validation de la date
                date = LocalDate.of(year, month, day);
                if (date.isBefore(LocalDate.now())) {
                    throw new DateTimeParseException("La date ne peut pas être dans le passé", "", 0);
                }
            } catch (DateTimeParseException e) {
                System.out.println("Date invalide. Veuillez réessayer.");
                scanner.nextLine(); // Pour nettoyer le buffer d'entrée
                date = null;
            }
        }
        
        List<Integer> dateList = new ArrayList<>();
        dateList.add(date.getDayOfMonth());
        dateList.add(date.getMonthValue());
        dateList.add(date.getYear());
        return dateList;
    }
    
    public List<Integer> processInput(List<Integer> dateArrive,Scanner scanner) {
        LocalDate date = null;
        while (date == null) {
            try {
                System.out.print("Entrez la date (jour mois année) : ");
                int day = scanner.nextInt();
                int month = scanner.nextInt();
                int year = scanner.nextInt();

                // Validation de la date
                date = LocalDate.of(year, month, day);
                LocalDate dateArriveClient = LocalDate.of(dateArrive.get(2), dateArrive.get(1), dateArrive.get(0));
                if (date.isBefore(LocalDate.now()) || date.isBefore(dateArriveClient)) {
                    throw new DateTimeParseException("La date ne peut pas être dans le passé", "", 0);
                }
            } catch (DateTimeParseException e) {
                System.out.println("Date invalide. Veuillez réessayer.");
                scanner.nextLine(); // Pour nettoyer le buffer d'entrée
                date = null;
            }
        }
        
        List<Integer> dateList = new ArrayList<>();
        dateList.add(date.getDayOfMonth());
        dateList.add(date.getMonthValue());
        dateList.add(date.getYear());
        return dateList;
    }
    
    
}