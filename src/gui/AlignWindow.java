package gui;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.TextField;
import javafx.scene.control.*;
import javafx.geometry.Insets;
import java.io.File;

public class AlignWindow extends Application
{
  private Scene scene;

  public void start(Stage window)
  {
    // Left side selecting the mode menu
    VBox mode_menu = new VBox();
    mode_menu.setMaxWidth(100);
    CustomImageButton image = new CustomImageButton("file:src/images/play.png",100,100);

    Button playButton = new Button();
    playButton.setGraphic(image);

    mode_menu.getChildren().add(playButton);

//middleguy
    Label xLabel = new Label("X: ");
    TextField xField = new TextField();
    xField.setPrefWidth(40);
    Label yLabel = new Label("Y: ");
    TextField yField = new TextField();
    yField.setPrefWidth(40);

    HBox xRow = new HBox(10);
    xRow.getChildren().addAll(xLabel, xField);

    HBox yRow = new HBox(10);
    yRow.getChildren().addAll(yLabel, yField);

    VBox middleguy = new VBox(10);
    middleguy.setAlignment(Pos.CENTER);
    middleguy.setPadding(new Insets(10, 20, 10, 20));
    middleguy.getChildren().addAll(xRow, yRow);

    //right guy
    Button btn1 = new Button("OK");
    Button btn2 = new Button("Cancel");
    Button btn3 = new Button("Clear");
    btn1.setMaxWidth(Double.MAX_VALUE);
    btn2.setMaxWidth(Double.MAX_VALUE);
    btn3.setMaxWidth(Double.MAX_VALUE);
    VBox button = new VBox(5);
    button.setAlignment(Pos.CENTER);

    middleguy.getChildren().addAll(btn1,btn2,btn3);

    //everything box
    StackPane mainPane = new StackPane();
    mainPane.setMinSize(1280, 720);
    mainPane.setMaxSize(1920, 1080);
    mainPane.setPadding(new Insets(30, 50, 30, 50));
    mainPane.getChildren().addAll(middleguy,mode_menu);
    mainPane.setAlignment(mode_menu,Pos.CENTER_LEFT);

    scene = new Scene(mainPane);
    window.setScene(scene);
    window.setResizable(true);
    window.show();
}
}