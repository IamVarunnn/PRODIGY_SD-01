import java.util.Scanner;

public class TemperatureConverter {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Method to convert Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    // Method to convert Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    // Method to convert Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Method to convert Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }

    // Method to convert temperature based on the input unit
    public static void convertTemperature(double value, String unit) {
        double celsius = 0, fahrenheit = 0, kelvin = 0;

        switch(unit.toLowerCase()) {
            case "c":
                celsius = value;
                fahrenheit = celsiusToFahrenheit(celsius);
                kelvin = celsiusToKelvin(celsius);
                break;
            case "f":
                fahrenheit = value;
                celsius = fahrenheitToCelsius(fahrenheit);
                kelvin = fahrenheitToKelvin(fahrenheit);
                break;
            case "k":
                kelvin = value;
                celsius = kelvinToCelsius(kelvin);
                fahrenheit = kelvinToFahrenheit(kelvin);
                break;
            default:
                System.out.println("Invalid unit. Please enter 'C' for Celsius, 'F' for Fahrenheit, or 'K' for Kelvin.");
                return;
        }

        System.out.printf("\nTemperature conversions:\n");
        System.out.printf("%.2f°%s is equivalent to:\n", value, unit.toUpperCase());
        System.out.printf("%.2f°C\n", celsius);
        System.out.printf("%.2f°F\n", fahrenheit);
        System.out.printf("%.2f K\n", kelvin);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double value = scanner.nextDouble();

        System.out.print("Enter the unit of the temperature (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        String unit = scanner.next();

        convertTemperature(value, unit);

        scanner.close();
    }
}
