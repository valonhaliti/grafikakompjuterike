import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import java.util.concurrent.ThreadLocalRandom;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Drejteza me ngjyra de pozita te rastesishme");
        BorderPane  layout = new BorderPane();
        Color c;
        for (int i = 0; i < 100; i++) {
            int R = (int) (Math.random( )*256);
            int G = (int)(Math.random( )*256);
            int B = (int)(Math.random( )*256);
            c = Color.rgb(R, G, B);
            
            int startX = ThreadLocalRandom.current().nextInt(0, 300 + 1);
            int startY = ThreadLocalRandom.current().nextInt(0, 300 + 1);
            int endX = ThreadLocalRandom.current().nextInt(0, 300 + 1);
            int endY = ThreadLocalRandom.current().nextInt(0, 300 + 1);

            Line line = new Line(startX, startY, endX, endY);
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
