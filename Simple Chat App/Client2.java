//package CHAT;
//
//import javafx.application.Application;
//import javafx.application.Platform;
//import javafx.scene.Scene;
//import javafx.scene.control.*;
//import javafx.scene.layout.*;
//import javafx.stage.Stage;
//
//import java.io.*;
//import java.net.Socket;
//
//public class Client2 extends Application {
//    private PrintWriter out;
//    private TextArea messagesArea;
//    private TextField inputField;
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        primaryStage.setTitle("Client2");
//
//        VBox vbox = new VBox();
//        messagesArea = new TextArea();
//        messagesArea.setEditable(false);
//
//        inputField = new TextField();
//        inputField.setOnAction(e -> sendMessage());
//
//        Button sendButton = new Button("Send");
//        sendButton.setOnAction(e -> sendMessage());
//
//        HBox hbox = new HBox(inputField, sendButton);
//        HBox.setHgrow(inputField, Priority.ALWAYS);
//
//        vbox.getChildren().addAll(new ScrollPane(messagesArea), hbox);
//
//        Scene scene = new Scene(vbox, 400, 300);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//
//        new Thread(() -> {
//            try {
//                Socket socket = new Socket("localhost", 12345);
//                out = new PrintWriter(socket.getOutputStream(), true);
//                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//
//                String message;
//                while ((message = in.readLine()) != null) {
//                    String finalMessage = message;
//                    Platform.runLater(() -> messagesArea.appendText(finalMessage + "\n"));
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }).start();
//    }
//
//    private void sendMessage() {
//        String message = inputField.getText();
//        if (!message.isEmpty()) {
//            out.println(message);
//            inputField.clear();
//        }
//    }
//}
