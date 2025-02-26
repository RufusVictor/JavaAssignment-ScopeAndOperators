import java.util.Scanner;
public class CelsiusToFahrenheitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsiusTemperature = scanner.nextDouble();
        scanner.close();
        double fahrenheitTemperature = (celsiusTemperature * 9.0 / 5.0) + 32.0;
        System.out.println(celsiusTemperature + "°C is equal to " + fahrenheitTemperature + "°F");
    }
}
