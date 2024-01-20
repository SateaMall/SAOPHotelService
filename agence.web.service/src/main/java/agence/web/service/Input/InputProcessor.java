package agence.web.service.Input;

import java.util.Scanner;

public interface InputProcessor<T> {
    T processInput(Scanner scanner);
    T processInput( T date,Scanner scanner);
}
