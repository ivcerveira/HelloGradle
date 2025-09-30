import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextFieldWithClearButton extends Application {

    @Override
    public void start(Stage primaryStage) {
        TextField textField = new TextField();
        Button clearButton = new Button("x");
        clearButton.getStyleClass().add("clear-button"); // Estilo para o botão "x"

        // Ação para limpar o conteúdo do TextField
        clearButton.setOnAction(event -> textField.clear());

        // Layout para o TextField e o botão
        HBox hbox = new HBox(textField, clearButton);
        hbox.setAlignment(Pos.CENTER_RIGHT); // Alinhamento à direita

        // Estilo para o layout
        hbox.getStyleClass().add("text-field-with-clear-button");

        // Cena e palco
        Scene scene = new Scene(hbox, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("TextField with Clear Button");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}