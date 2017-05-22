import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
        GridPane scene = new GridPane();
        window.setScene(new Scene(scene, 300, 150));
        Text t1Ex2 = new Text("Ім'я користувача:");
        Text t2Ex2 = new Text("Пароль:");
        TextField tf1Ex2 = new TextField();
        PasswordField tf2Ex2 = new PasswordField();
        tf1Ex2.setPromptText("username");
        tf2Ex2.setPromptText("password");
        Button buttonEx2 = new Button("Вхід");
        ComboBox comboBox = new ComboBox();
        String style1 = "style1.css";
        String style2 = "style2.css";
        String style3 = "style3.css";
        GridPane.setConstraints(t1Ex2, 0, 0);
        GridPane.setConstraints(tf1Ex2, 1, 0);
        GridPane.setConstraints(t2Ex2, 0, 1);
        GridPane.setConstraints(tf2Ex2, 1, 1);
        GridPane.setConstraints(buttonEx2, 1, 2);
        GridPane.setConstraints(comboBox, 0, 2);
        scene.setVgap(8);
        scene.setHgap(10);
        scene.setPadding(new Insets(10, 10, 10, 10));
        scene.getChildren().addAll(comboBox,t1Ex2, tf1Ex2, t2Ex2, tf2Ex2, buttonEx2);
        ObservableList<String> styles = FXCollections.observableArrayList("Red","Green","Blue");
        comboBox.setItems(styles);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Вдалий вхід");
        alert.setHeaderText("Чудовий день");
        alert.setContentText("Привіт romkon");
        buttonEx2.setOnAction(e -> {
            checkUser = tf1Ex2.getText();
            checkPw = tf2Ex2.getText();
            if (checkUser.equals(user) && checkPw.equals(pw)) {
                tf1Ex2.setStyle("-fx-text-fill: #004400; -fx-background-color: #88CC88");
                alert.showAndWait();
            } else {
                tf1Ex2.setStyle("-fx-text-fill: #550000; -fx-background-color: #FFAAAA");
                tf2Ex2.clear();
            }
        });
        comboBox.setOnAction(e->{
            if(comboBox.getValue()=="Red"){
                scene.getStylesheets().clear();
                scene.getStylesheets().add(style1);
            }
            else if (comboBox.getValue()=="Green"){
                scene.getStylesheets().clear();
                scene.getStylesheets().add(style2);
            }
            else if (comboBox.getValue()=="Blue"){
                scene.getStylesheets().clear();
                scene.getStylesheets().add(style3);
            }
        });
    }
}

