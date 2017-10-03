import javafx.scene.control.TextInputDialog;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import java.util.Optional;

/**
 * Purpose: 1. Declare constants for quarters, dimes, nickles, and pennies to use in your program.

 2. Use JOptionPane or JavaFX dialog for input and output

 3. Use VI to write the program

 4. Use javac command to compile your program

 5. Use java command to run the program

 6. Use escape sequence

 */

public class EscapeSequence extends Application{
    @Override
    public void start(Stage primaryStage){
        final int QUARTERS = 25;
        final int DIMES = 10;
        final int NICKELS = 5;
        final int PENNIES = 1;

        TextInputDialog textInputDialog = new TextInputDialog("Enter dollar bills: ");
        Optional<String> inputValue = textInputDialog.showAndWait();
        System.out.println(inputValue.toString());
        int inputIntValue = Integer.parseInt(inputValue.get());
        int quarters = inputIntValue/QUARTERS;
        int nickels = inputIntValue/NICKELS;
        int dimes = inputIntValue/DIMES;
        int pennies = inputIntValue/PENNIES;

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Your change is: " + quarters + " quarters, " + dimes + " dimes " + nickels + " nickels " + pennies + " pennies.");

        alert.showAndWait();


    }
}
