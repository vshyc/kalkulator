package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			TextField wyswietlacz = new TextField();
			TextField arg1 = new TextField();
			TextField arg2 = new TextField();
			Button dodaj = new Button("+");
			Button odejmij = new Button("-");
			Button iloczyn = new Button("*");
			Button dzielenie = new Button("/");
			dodaj.setOnAction(e -> {
				Double liczba1= Double.parseDouble(arg1.getText());
				Double liczba2= Double.parseDouble(arg2.getText());
				
				// kod debugowy
				System.out.println("Argument1 = " + arg1.getText());
				System.out.println("Argument2 = " + arg2.getText());
				System.out.println("Przetworzony argument1 = " + liczba1);
				System.out.println("Przetworzony argument2 = " + liczba2);
				
				Double wynik = liczba1 + liczba2;
				wyswietlacz.setText(wynik.toString());
				
				
			});
			odejmij.setOnAction(e->{
				Double liczba1= Double.parseDouble(arg1.getText());
				Double liczba2= Double.parseDouble(arg2.getText());
				Double wynik = liczba1 - liczba2;
				wyswietlacz.setText(wynik.toString());
				
			});
			iloczyn.setOnAction(e->{
				Double liczba1= Double.parseDouble(arg1.getText());
				Double liczba2= Double.parseDouble(arg2.getText());
				Double wynik = liczba1 * liczba2;
				wyswietlacz.setText(wynik.toString());
				
			});
			dzielenie.setOnAction(e->{
				Double liczba1= Double.parseDouble(arg1.getText());
				Double liczba2= Double.parseDouble(arg2.getText());
				Double wynik = liczba1 / liczba2;
				wyswietlacz.setText(wynik.toString());
				
			});
			dodaj.setPrefSize(30, 30);
			odejmij.setPrefSize(30, 30);
			iloczyn.setPrefSize(30, 30);
			dzielenie.setPrefSize(30, 30);
			wyswietlacz.setDisable(true);
			
			GridPane operacje = new GridPane();
			operacje.add(dodaj, 0, 0);
			operacje.add(odejmij, 1, 0);
			operacje.add(iloczyn, 0, 1);
			operacje.add(dzielenie, 1, 1);
			operacje.setVgap(10);
			operacje.setHgap(10);
			
			HBox dolGora = new HBox();
			dolGora.getChildren().add(arg1);
			dolGora.getChildren().add(operacje);
			dolGora.getChildren().add(arg2);
			
			VBox root = new VBox();
			root.getChildren().add(dolGora);
			root.getChildren().add(wyswietlacz);
			
			
	
			
	/*		VBox root = new VBox();
			root.getChildren().add(arg1);
			root.getChildren().add(arg2);
			root.getChildren().add(dodaj);
			root.getChildren().add(odejmij);
			root.getChildren().add(iloczyn);
			root.getChildren().add(dzielenie);
	 		root.getChildren().add(wyswietlacz);;
	*/		
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
