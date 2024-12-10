import org.code.theater.*;
import org.code.media.*;

/**
 * Represents a Scene to be played in the Theater using data from
 * a chosen dataset.
 */
public class DataScene extends Scene {

  private Person[] people; // 1D array of Person objects

  /** Constructor initializes the people array */
  public DataScene() {
    people = createPeople();
  }

  /** 
   * Creates and returns a 1D array of Person objects
   * from the txt files in this project.
   */
  public Person[] createPeople() {
    String[] namesArray = FileReader.toStringArray("names.txt");
    String[] gendersArray = FileReader.toStringArray("genders.txt");
    String[] numbersArray = FileReader.toStringArray("numbers.txt");
    
    Person[] peopleArray = new Person[namesArray.length];
    for (int i = 0; i < peopleArray.length; i++) {
      peopleArray[i] = new Person(namesArray[i], gendersArray[i], numbersArray[i]);
    }

    return peopleArray;
  }

  /**
   * Draws the animation for the scene, iterating
   * over each Person object.
   */
  public void drawScene() {
    for (Person p : people) {
      String gender = p.getGender();
      String name = p.getName();
      String number = p.getNumber() + "";

      drawBackground(gender);
      drawProfileImage(gender);

      applyStyle();
      drawData(name, gender, number);

      pause(0.5); // Pause for a brief moment before the next iteration
    }
  }

  /** Draws the background based on the gender */
  public void drawBackground(String gender) {
    if (gender.equals("Male")) {
      clear(Color.AQUA);    
    } else if (gender.equals("Female")) {
      clear(Color.PINK);
    }
  } 
  
  /** Draws the profile image based on the gender */
  public void drawProfileImage(String gender) { 
    if (gender.equals("Male")) {
      drawImage("boy.png", 100, 50, 200);   
    } else if (gender.equals("Female")) {
      drawImage("girl.png", 100, 50, 200);
    }
  }

  /** Applies text style settings for drawing data */
  public void applyStyle() {
    setTextStyle(Font.MONO, FontStyle.BOLD);
    setTextHeight(25);
    setTextColor("black");
  }

  /** Draws the baby's name, gender, and number */
  public void drawData(String name, String gender, String number) {
    drawText(name, 120, 325);
    drawText("" + gender, 120, 365);
    drawText(number, 50, 325);
  }
}