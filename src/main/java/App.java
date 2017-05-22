import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Optional;

public class App extends Application {
    //    int counter = 1;
    String user = "romkon";
    String pw = "1111";
    String checkUser, checkPw;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage window;
        window = primaryStage;
  //      Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        window.setTitle("Форма входу");
        window.show();
        GridPane mainLayoutEx2 = new GridPane();
        window.setScene(new Scene(mainLayoutEx2, 300, 150));
        Text t1Ex2 = new Text("Ім'я користувача:");
        Text t2Ex2 = new Text("Пароль:");
        TextField tf1Ex2 = new TextField();
        PasswordField tf2Ex2 = new PasswordField();
        tf1Ex2.setPromptText("username");
        tf2Ex2.setPromptText("password");
        Button buttonEx2 = new Button("Вхід");
        GridPane.setConstraints(t1Ex2, 0, 0);
        GridPane.setConstraints(tf1Ex2, 1, 0);
        GridPane.setConstraints(t2Ex2, 0, 1);
        GridPane.setConstraints(tf2Ex2, 1, 1);
        GridPane.setConstraints(buttonEx2, 1, 2);
        mainLayoutEx2.setVgap(8);
        mainLayoutEx2.setHgap(10);
        mainLayoutEx2.setPadding(new Insets(10, 10, 10, 10));
        mainLayoutEx2.getChildren().addAll(t1Ex2, tf1Ex2, t2Ex2, tf2Ex2, buttonEx2);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Вдалий вхід");
        alert.setHeaderText("Чудовий день");
        alert.setContentText("Привіт romkon");
        buttonEx2.setOnAction(e -> {
            checkUser = tf1Ex2.getText().toString();
            checkPw = tf2Ex2.getText().toString();
            if (checkUser.equals(user) && checkPw.equals(pw)) {
                tf1Ex2.setStyle("-fx-text-fill: green");
                alert.showAndWait();
            } else {
                tf1Ex2.setStyle("-fx-text-fill: red");
                tf2Ex2.clear();
            }
        });
    }
}

