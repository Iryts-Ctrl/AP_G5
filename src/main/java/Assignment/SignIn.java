package Assignment;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;

public class SignIn extends Application {
    @Override
    public void start(Stage primaryStage) {
        HBox mainContainer = new HBox(20);
        mainContainer.setAlignment(Pos.CENTER);
        mainContainer.setPadding(new Insets(20));
        mainContainer.setStyle("-fx-background-color: #f5f5f5;");

        // Sign Up Section
        VBox signUpSection = new VBox(10);
        signUpSection.setMinWidth(300);
        signUpSection.setStyle("-fx-background-color: white; -fx-padding: 20; -fx-background-radius: 5;");

        Label signUpTitle = new Label("Create Account");
        signUpTitle.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");

        TextField nameField = new TextField();
        nameField.setPromptText("Full Name");
        TextField emailField = new TextField();
        emailField.setPromptText("Email Address");
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");
        PasswordField confirmPasswordField = new PasswordField();
        confirmPasswordField.setPromptText("Confirm Password");
        Button signUpButton = new Button("Sign Up");
        signUpSection.getChildren().addAll(signUpTitle, nameField, emailField, passwordField, confirmPasswordField, signUpButton);

        // Separator
        Separator separator = new Separator();
        separator.setOrientation(javafx.geometry.Orientation.VERTICAL);

        // Sign In Section
        VBox signInSection = new VBox(10);
        signInSection.setMinWidth(300);
        signInSection.setStyle("-fx-background-color: white; -fx-padding: 20; -fx-background-radius: 5;");

        Label signInTitle = new Label("Welcome Back");
        signInTitle.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");

        TextField loginEmailField = new TextField();
        loginEmailField.setPromptText("Email Address");
        PasswordField loginPasswordField = new PasswordField();
        loginPasswordField.setPromptText("Password");
        Button signInButton = new Button("Sign In");

        Hyperlink forgotPassword = new Hyperlink("Forgot Password?");
        signInSection.getChildren().addAll(signInTitle, loginEmailField, loginPasswordField, signInButton, forgotPassword);

        mainContainer.getChildren().addAll(signUpSection, separator, signInSection);

        Scene scene = new Scene(mainContainer);
        primaryStage.setTitle("Fitness App Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
