import com.google.gson.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {

    // TODO instantiate your classes and  set the fields
    Person person = new Person("Ozzy", "Osbourne", 74); // first, last, age
    Album album =
        new Album("Ordinary Man", 2020, "Epic Records"); // title, year, label
    Song song = new Song("Under the Graveyard", "Rock"); // title, genre

    // TODO serialize your objects to a file using native Java serialization.
    // Use .ser as the file extension
    serializeObjectToFile(person, "person.ser");
    serializeObjectToFile(album, "album.ser");
    serializeObjectToFile(song, "song.ser");

    // TODO deserialize your objects from the ser files back into objects
    Person deserializedPerson = (Person)deserializeObjectFromFile("person.ser");
    Album deserializedAlbum = (Album)deserializeObjectFromFile("album.ser");
    Song deserializedSong = (Song)deserializeObjectFromFile("song.ser");

    // TODO serialize your objects to a file using Json serialization (via
    // Google Gson).  Use .json as the file extension

    serializeObjectToFileAsJson(person, "person.json");
    serializeObjectToFileAsJson(album, "album.json");
    serializeObjectToFileAsJson(song, "song.json");

    // TODO deserialize your objects from the json files back into objects

    Person deserializedPerson2 =
        (Person)deserializeObjectFromFileAsJson("person.json", Person.class);
    Album deserializedAlbum2 =
        (Album)deserializeObjectFromFileAsJson("album.json", Album.class);
    Song deserializedSong2 =
        (Song)deserializeObjectFromFileAsJson("song.json", Song.class);
  }

  private static void serializeObjectToFile(Object obj, String filename) {
    try (FileOutputStream fos = new FileOutputStream(filename);
         ObjectOutputStream oos = new ObjectOutputStream(fos)) {
      oos.writeObject(obj);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static Object deserializeObjectFromFile(String filename) {
    try (FileInputStream fis = new FileInputStream(filename);
         ObjectInputStream ois = new ObjectInputStream(fis)) {
      return ois.readObject();
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
      return null;
    }
  }

  private static void serializeObjectToFileAsJson(Object obj, String filename) {
    try (FileWriter writer = new FileWriter(filename)) {
      Gson gson = new Gson();
      gson.toJson(obj, writer);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static Object deserializeObjectFromFileAsJson(String filename,
                                                        Class<?> cls) {
    try (FileReader reader = new FileReader(filename)) {
      Gson gson = new Gson();
      return gson.fromJson(reader, cls);
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }
  }
}
