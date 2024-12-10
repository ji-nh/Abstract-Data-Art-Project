/**
 * Represents a Person with a name, gender, and number.
 */
public class Person {

  private String name;   // First name of the person
  private String gender; // Gender of the person
  private String number; // Top 100 Baby Names in order

  /** Constructor initializes the Person with name, gender, and number */
  public Person(String name, String gender, String number) {
    this.name = name;
    this.gender = gender;
    this.number = number; 
  }

  /** Accessor Method for name */
  public String getName() {
    return name;
  }
  
  /** Accessor Method for gender */
  public String getGender() {
    return gender;
  }

  /** Accessor Method for number */
  public String getNumber() {
    return number; 
  }
}