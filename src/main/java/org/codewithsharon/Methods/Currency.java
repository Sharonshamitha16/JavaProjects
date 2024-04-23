package org.codewithsharon.Methods;
import java.text.NumberFormat;
import java.util.Locale;

    public class Currency {
        public static void main(String[] args) {
            double amount = 12324.134;

            // Format for US currency
            NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
            String usFormatted = usFormat.format(amount);

            // Format for Indian currency
            NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
            String indiaFormatted = indiaFormat.format(amount);

            // Format for Chinese currency
            NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
            String chinaFormatted = chinaFormat.format(amount);

            // Format for French currency
            NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            String franceFormatted = franceFormat.format(amount);

            // Output formatted amounts
            System.out.println("US: " + usFormatted);
            System.out.println("India: " + indiaFormatted);
            System.out.println("China: " + chinaFormatted);
            System.out.println("France: " + franceFormatted);
        }
    }


