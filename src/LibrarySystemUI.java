import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LibrarySystemUI extends Application {
    private AccountManager accountManager = new AccountManager();
    private Library<Book> bookLibrary = new Library<>(accountManager);

    private TextField userIdField = new TextField();
    private TextField usernameField = new TextField();
    private PasswordField passwordField = new PasswordField();
    private TextArea displayArea = new TextArea();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Generic Library System");

        // Set prompt texts for fields
        userIdField.setPromptText("Enter User ID");
        usernameField.setPromptText("Enter Username");
        passwordField.setPromptText("Enter Password");

        // Buttons
        Button createAccountButton = new Button("Create Account");
        Button loginButton = new Button("Login");

        // Event Handlers
        createAccountButton.setOnAction(e -> {
            String userId = userIdField.getText();
            String username = usernameField.getText();
            String password = passwordField.getText();

            if (!userId.isEmpty() && !password.isEmpty()) {
                accountManager.login(username, userId, password);
                displayArea.appendText("Account created for: " + userId + "\n");
            } else {
                displayArea.appendText("Username and password cannot be empty.\n");
            }
        });

        loginButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
            String userId = userIdField.getText();

            if (accountManager.login(username, userId, password)) {
                displayArea.appendText("Login successful for: " + username + "\n");
            } else {
                displayArea.appendText("Invalid username or password.\n");
            }
        });

        // Layout
        VBox root = new VBox(10);
        root.getChildren().addAll(
                new Label("Create Account / Login:"),
                userIdField,
                usernameField,
                passwordField,
                createAccountButton,
                loginButton,
                displayArea
        );

        // Scene
        Scene scene = new Scene(root, 400, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
