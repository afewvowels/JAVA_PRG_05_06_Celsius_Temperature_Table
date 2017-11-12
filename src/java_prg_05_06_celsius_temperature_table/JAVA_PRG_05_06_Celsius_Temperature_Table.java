/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_05_06_celsius_temperature_table;

/**
 *
 * @author bluebackdev
 * The formula for converting a temperature from Fahrenheit to Celsius is:
 * 
 *      C = (5/9) * (F - 32)
 * 
 * where F is the Fahrenheit temperature and C is the Celsius temperature.
 * Write a method named celsius that accepts a Fahrenheit temperature as an
 * argument. The method should return the temperature, converted to Celsius.
 * Demonstrate the method by calling it in a loop that displays a table of the
 * Fahrenheit temperatures 0 through 20 and their Celsius equivalents.
 */
public class JAVA_PRG_05_06_Celsius_Temperature_Table {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        final int INT_MIN_TEMPERATURE = 0;
        final int INT_MAX_TEMPERATURE = 20;
        
        for (int i = INT_MIN_TEMPERATURE ; i <= INT_MAX_TEMPERATURE ; i++)
        {
            displayResults(i, celsius(i));
        }
        
    }
    
    public static double celsius(int intFahrenheit)
    {
        double dblCelsius;
        
        dblCelsius = (5.0/9.0) * (intFahrenheit - 32);
        
        return dblCelsius;
    }
    
    public static void displayResults(int intTemp, double dblCelsius)
    {
        System.out.println("Fahrenheit: " + intTemp + ", Celsius: " + dblCelsius);
    }
}
