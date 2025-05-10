package MultiScene;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {

    //switch scenes
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToScene1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/MultiScene/Scene1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/MultiScene/Scene2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //toggle between shapes
    @FXML
    private Pane shapeContainer;

    private Shape currentShape;

    @FXML
    public void initialize(){
        if (shapeContainer != null) {
            setCircle();
        }
    }

    @FXML
    public void setCircle() {
        replaceShape(new Circle(50, Color.BLUE)); // Circle with radius 50
    }
    @FXML
    public void setRectangle() {
        replaceShape(new Rectangle(100, 100, Color.RED)); // Rectangle 100x100
    }
    @FXML
    public void setTriangle() {
        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(50.0, 0.0, 100.0, 100.0, 0.0, 100.0);
        triangle.setFill(Color.GREEN);
        replaceShape(triangle);
    }

    private void replaceShape(Shape newShape){

        shapeContainer.getChildren().clear();
        currentShape=newShape;
        shapeContainer.getChildren().add(currentShape);
        positionShape();
    }

    private void positionShape() {
        x=200;
        y=200;
        currentShape.setLayoutX(200);
        currentShape.setLayoutY(200);
    }



//controling shape movment
    @FXML
    private Circle circle;
    private double x;
    private double y;

    public void up(ActionEvent e) {
        System.out.println("up");
        currentShape.setLayoutY(y-10);

        circle.setCenterY(y-=10);
    }
    public void down(ActionEvent e) {
        System.out.println("down");
        currentShape.setLayoutY(y+10);

        circle.setCenterY(y+=10);
    }
    public void left(ActionEvent e) {
        System.out.println("left");
        currentShape.setLayoutX(y-10);

        circle.setCenterX(y-=10);
    }
    public void right(ActionEvent e) {
        System.out.println("right");
        currentShape.setLayoutX(y+10);

        circle.setCenterX(y+=10);
    }
    public void upLeft(ActionEvent e){
        circle.setCenterX(y-=10);
        circle.setCenterY(y-=10);
    }




}
