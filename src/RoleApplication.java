import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceDialog;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Optional;

public class RoleApplication extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ArrayList<String> choices = new ArrayList<String>();
        choices.add("Staff");
        choices.add("Administrator");
        choices.add("Student");
        choices.add("Faculty");
        choices.add("Guest");
        ChoiceDialog<String> dialog = new ChoiceDialog<String>("Choose your role: ", choices);
        Optional<String> input= dialog.showAndWait();
        String value = input.get();

        switch (value) {
            case "Administrator":
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("System Information ");
                alert.setHeaderText("NOVA");
                alert.setContentText("Welcome Administrator");
                alert.showAndWait();
                break;
                case "Staff":
                    Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                    alert1.setTitle("System Information ");
                    alert1.setHeaderText("NOVA");
                    alert1.setContentText("Welcome Staff");
                    alert1.showAndWait();
                    break;
            case "Student":
                Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                alert2.setTitle("System Information ");
                alert2.setHeaderText("NOVA");
                alert2.setContentText("Welcome Student");
                alert2.showAndWait();
                break;
            case "Faculty":
                Alert alert3 = new Alert(Alert.AlertType.INFORMATION);
                alert3.setTitle("System Information ");
                alert3.setHeaderText("NOVA");
                alert3.setContentText("Welcome Faculty");
                alert3.showAndWait();
                break;
            case "Guest":
                Alert alert4 = new Alert(Alert.AlertType.INFORMATION);
                alert4.setTitle("System Information ");
                alert4.setHeaderText("NOVA");
                alert4.setContentText("Welcome Guest");
                alert4.showAndWait();
                break;
            default:
                Alert alert5 = new Alert(Alert.AlertType.ERROR);
                alert5.setTitle("System Error ");
                alert5.setHeaderText("NOVA");
                alert5.setContentText("Please choose your role!");
                alert5.showAndWait();
        }
    }
}
