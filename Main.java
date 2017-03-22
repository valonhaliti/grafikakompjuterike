/** Ky aplikacion do të shfaq në mënyrë të rastësishme drejtëzat dhe ngjyrën e tyre.
 * Autor: Valon Haliti */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import java.util.concurrent.ThreadLocalRandom;

public class Main extends Application {

    private int height = 300;
    private int numberOfLines = 100;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Drejteza me ngjyra dhe pozita te rastesishme");
        BorderPane  layout = new BorderPane();
        Color c;
        for (int i = 0; i < numberOfLines; i++) {
            int R = (int) (Math.random( )*256);
            int G = (int)(Math.random( )*256);
            int B = (int)(Math.random( )*256);
            c = Color.rgb(R, G, B);

            int startX = ThreadLocalRandom.current().nextInt(0, height + 1);
            int startY = ThreadLocalRandom.current().nextInt(0, height + 1);
            int endX = ThreadLocalRandom.current().nextInt(0, height + 1);
            int endY = ThreadLocalRandom.current().nextInt(0, height + 1);

            Line line = new Line(startX, startY, endX, endY);
            line.setStroke(c);

            layout.getChildren().add(line);
        }
        Scene scene = new Scene(layout, height, height);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
