package FXAriel;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Ariel
 */

public class Window extends Application implements Runnable{

    private final int WIDTH = 800;
    private final int HEIGHT = 600;
    private Pane pane;
    private Scene scene;
    private Canvas canvas;
    private Thread thread;
    boolean activo=true;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Random Graphics");
        initComponents(primaryStage);
        primaryStage.show();
    }

    private void initComponents(Stage primaryStage) {
        this.pane = new Pane();
        this.scene = new Scene(this.pane, WIDTH, HEIGHT);
        this.canvas = new Canvas(WIDTH, HEIGHT);
        
        this.thread = new Thread(this);
        this.thread.start();
        
        this.pane.getChildren().add(this.canvas);
        primaryStage.setScene(this.scene);
    }

     private void myDraw(GraphicsContext gc) {
        Random rand = new Random();
        int pos1=2, pos2=3;
        int coordinateX=0 , coordinateY=0;
        try {
        while(true){
                
            //Mantiene la posicion del elemento
                int x=pos1, y=pos2;
                
                    coordinateX = rand.nextInt(WIDTH)+1;
                    coordinateY = rand.nextInt(HEIGHT)+1;
                
                
                activo=true;
                while(activo==true){
                    //Limpia la ventana
                    gc.clearRect(0, 0, WIDTH, HEIGHT);
                    
                    //Coordenadas por donde la bola debe moverse
                    //movimiento en y al ser x menor que la coordenada x elejida aleatoriamente
                    if(x<coordinateX){
                        x++;
                    }
                    //movimiento en y al ser x mayor que la coordenada x elejida aleatoriamente
                    else if(x>coordinateX){
                        x--;
                    }
                    //movimiento en y al ser y menor que la coordenada y elejida aleatoriamente
                    if(y<coordinateY){
                        y++;
                    }
                    //movimiento en y al ser y mayor que la coordenada y elejida aleatoriamente
                    else if(y>coordinateY){
                        y--;
                    }
                    
                    //Dibuja la bola
                    gc.fillOval(x, y, 100, 100);
                    Thread.sleep(5);
                    
                    //Comprobaciones
                    //Mantiene la bola dentro de la ventana
                    if((x>=WIDTH-100 || y>=HEIGHT-100) || (x<0 || y<0)){
                        pos1=x;
                        pos2=y;
                        activo=false;
                    }
                    
                    //Mantiene la bola en movimiento aun al llegar a una de las coordenadas
                    if(x==coordinateX){
                        if(y<x)
                            x++;
                        else
                            x--;
                        activo=false;
                    }
                    
                    if(y==coordinateY){
                        if(y<x)
                            y++;
                        else
                            y--;
                        activo=false;
                    }
                    
                    }//while dibujo
                pos1=x;
                pos2=y;
        }//while principal
        }//try
            catch (InterruptedException ex) {}
    }//myDraw
    

    @Override
    public void run() {
        GraphicsContext gc = this.canvas.getGraphicsContext2D();
        myDraw(gc);
    }
}