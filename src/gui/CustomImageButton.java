package gui;

import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class CustomImageButton extends Button
{
  public CustomImageButton(String imagePath, double width, double height)
  {
    ImageView imageView = new ImageView(imagePath);

    imageView.setFitWidth(width);
    imageView.setFitHeight(height);

    // Set image as button graphic
    this.setGraphic(imageView);

    // Remove default button appearance
    // Remove default button appearance
    this.setStyle(
        "-fx-background-color: transparent;" +
            "-fx-background-radius: 0;" +
            "-fx-border-color: transparent;" +
            "-fx-border-width: 0;" +
            "-fx-background-insets: 0;" +
            "-fx-padding: 0;" +
            "-fx-effect: none;" +
            "-fx-focus-color: transparent;" +
            "-fx-faint-focus-color: transparent;"
    );

    this.setFocusTraversable(false);

    // Hover effects
    this.setOnMouseEntered(e -> {
      this.setScaleX(1.2);
      this.setScaleY(1.2);
      this.setOpacity(0.7);
    });

    this.setOnMouseExited(e -> {
      this.setOpacity(1.0);
      this.setScaleX(1.0);
      this.setScaleY(1.0);
    });

    // Click effects
    this.setOnMousePressed(e -> {
      this.setScaleX(0.95);
      this.setScaleY(0.95);
    });

    this.setOnMouseReleased(e -> {
      this.setScaleX(1.0);
      this.setScaleY(1.0);
    });
  }
}
