package application;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.ActionEvent;  
import javafx.event.EventHandler; 
import javafx.scene.layout.StackPane;  
public class Hello extends Application {
	 public static void main (String[] args)  
	  {  
	        launch(args);  
	  }  
	@Override 
	public void start(Stage primaryStage) throws Exception{
		Button btn1=new Button("Hello world");
		 btn1.setOnAction(new EventHandler<ActionEvent>() {  
             
	            @Override  
	            public void handle(ActionEvent arg) {  
	                // TODO Auto-generated method stub  
	                System.out.println("hello world");  
	            }  
	        }); 
		StackPane root=new StackPane();
		root.getChildren().add(btn1);
		Scene scene=new Scene(root,600,400);   
		 primaryStage.setScene(scene);  
	        primaryStage.setTitle("First JavaFX Application");  
	        primaryStage.show();  
		 
	}
	
}
