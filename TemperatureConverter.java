import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Put the temperature value: ");
         double temperature = scanner.nextDouble();
        System.out.print("Put the unit (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        String unit = scanner.next().trim().toUpperCase();
        
         switch (unit) {
            case "C":
                convertFromCelsius(temperature);
                break;
            case "F":
                convertFromFahrenheit(temperature);
                break;
            case "K":
                convertFromKelvin(temperature);
                break;
            default:
                System.out.println("Invalid unit entered. Please enter C, F, or K.");
        }

        scanner.close();
    }
    // Convert from Celsius
    private static void convertFromCelsius(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        System.out.printf("Original Temperature: %.2f°C%n", celsius);
        System.out.printf("In Fahrenheit: %.2f°F%n", fahrenheit);
        System.out.printf("In Kelvin: %.2fK%n", kelvin);
    }
    // Convert from Fahrenheit
    private static void convertFromFahrenheit(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        double kelvin = celsius + 273.15;

        System.out.printf("Original Temperature: %.2f°F%n", fahrenheit);
        System.out.printf("In Celsius: %.2f°C%n", celsius);
        System.out.printf("In Kelvin: %.2fK%n", kelvin);
    }
    // Convert from Kelvin
    private static void convertFromKelvin(double kelvin) {
        double celsius = kelvin - 273.15;
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.printf("Original Temperature: %.2fK%n", kelvin);
        System.out.printf("In Celsius: %.2f°C%n", celsius);
        System.out.printf("In Fahrenheit: %.2f°F%n", fahrenheit);
    }
}