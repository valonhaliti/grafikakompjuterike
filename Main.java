import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import java.util.concurrent.ThreadLocalRandom;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Drejteza me ngjyra de pozia te rastesishme");

        BorderPane  layout = new BorderPane();
        Color c;
        for (int i = 0; i < 100; i++) {
            int startX = ThreadLocalRandom.current().nextInt(0, 300 + 1);
            int startY = ThreadLocalRandom.current().nextInt(0, 300 + 1);
            int endX = ThreadLocalRandom.current().nextInt(0, 300 + 1);
            int endY = ThreadLocalRandom.current().nextInt(0, 300 + 1);

            int R = (int) (Math.random( )*256);
            int G = (int)(Math.random( )*256);
            int B = (int)(Math.random( )*256);

            Line line = new Line(startX, startY, endX, endY);
            c = Color.rgb(R, G, B);
            line.setStroke(c);

            layout.getChildren().add(line);

        }

        Scene scene = new Scene(layout, 300, 300);



        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
