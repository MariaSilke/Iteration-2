package sample;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class cprValidator {
    public boolean isValidCPR(String cpr) {
        boolean valid = true;
        String trimmed = cpr.trim();
        if (trimmed.length() != 11) {
            valid = false;
        }
        // We have the correct length!
        else {
            try {
                // Create a formatter object, that fits the ddmmyy-XXXX pattern of CPR
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("ddMMuu");
                // Parse the first 6 digits in the string assigned to the variable cpr
                LocalDate birthdate = LocalDate.parse(cpr.substring(0, 6), dateFormatter);
            }
            catch (java.time.format.DateTimeParseException ex) {
                valid = false;
            }
        }
        return valid;
    }
}