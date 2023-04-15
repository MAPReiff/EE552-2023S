import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Properties;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {

    // TOOD the next few lines will load your apiKey from the file
    // src/main/resources/api.properties replace the xxx in that file with your
    // API key
    Properties props = new Properties();
    InputStream inputStream =
        Main.class.getClassLoader().getResourceAsStream("api.properties");
    if (inputStream != null) {
      props.load(inputStream);
    }
    final String apiKey = props.getProperty("apiKey");

    // TODO write a loop to take input from the user one symbol at a time until
    // the user inputs an empty line
    // TODO for each symbol input, query the finnhub API, read the response into
    // a class, and print out the data with meaningful labels

    HttpClient client = HttpClient.newHttpClient();

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Enter a stock symbol: ");
      String symbol = scanner.nextLine();
      if (symbol.isEmpty()) {
        break;
      }

      HttpRequest request =
          HttpRequest.newBuilder()
              .uri(URI.create("https://finnhub.io/api/v1/quote?symbol=" +
                              symbol + "&token=" + apiKey))
              .build();

      HttpResponse<String> response = null;
      try {
        response = client.send(request, HttpResponse.BodyHandlers.ofString());
      } catch (IOException e) {
        e.printStackTrace();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      String[] responseData = response.body().split(",");
      System.out.println(
          "Open price of the day: " +
          responseData[0].substring(responseData[0].indexOf(":") + 1));
      System.out.println(
          "High price of the day: " +
          responseData[1].substring(responseData[1].indexOf(":") + 1));
      System.out.println(
          "Low price of the day: " +
          responseData[2].substring(responseData[2].indexOf(":") + 1));
      System.out.println(
          "Current price: " +
          responseData[3].substring(responseData[3].indexOf(":") + 1));
      System.out.println(
          "Previous close price: " +
          responseData[4].substring(responseData[4].indexOf(":") + 1));
      System.out.println();
    }
  }
}
