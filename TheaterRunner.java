import org.code.theater.*;

public class TheaterRunner {
  
  /*
   * The main class that serves as the entry point to the application.
   * This class is responsible for instantiating a DataScene object
   */
  public static void main(String[] args) {
    
    /*
     * Instantiate a DataScene object to create a scene that will be
     * displayed in the theater. 
     */
    DataScene scene = new DataScene();
    
    /*
     * Call the drawScene() method on the DataScene object.
     */
    scene.drawScene();
    
    /*
     * Play the DataScene in the theater. This method is responsible for
     * managing the display of the scene, including transitioning 
     */
    Theater.playScenes(scene);
    
  }
}