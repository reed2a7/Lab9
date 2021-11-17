import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

class Main {

  static ArrayList<Person> person;
  static String filename;
  static FileReader myFile;

  public static void main(String[] args) {
    ArrayList<Person> people = new ArrayList<Person>();

    people.add(new Person("Ashley", 20, "blue"));
    people.add(new Person("A", 87, "pink"));
    people.add(new Person("B", 13, "yellow"));
    people.add(new Person("C", 55, "black"));
    people.add(new Person("D", 4, "green"));

    FileWriter fileWriter;
  
    try {
      fileWriter = new FileWriter("data.txt");

      BufferedWriter output = new BufferedWriter(fileWriter);

      for (int i = 0; i < people.size(); i++) {
        output.write(people.get(i).getName());
        output.newLine();
        output.write(Integer.toString(people.get(i).getAge()));
        output.newLine();
        output.write(people.get(i).getColor());
        output.newLine();
        //output.flush();
      }
      // output.flush();
      output.close();
    } catch (IOException except) {
      except.printStackTrace();
    }
  filename = "data.txt";
String name = "", age = "", color = "";
  try{
    myFile = new FileReader(filename);
    BufferedReader reader = new BufferedReader(myFile);
    while (reader.ready()) {
      name = reader.readLine();
      age = reader.readLine();
      color = reader.readLine();
      System.out.printf("%-10s %-10s %-10s %n", name, age, color);
    }
    reader.close();
      }
      catch (IOException exception) {
        System.out.println("An error occurred: " + exception);
      }
  }
  }

