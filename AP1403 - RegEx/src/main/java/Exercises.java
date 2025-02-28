import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercises {

    /*
        complete the method below, so it will validate an email address
     */
    public boolean validateEmail(String email) {

        String regex = "^[a-zA-Z0-9][a-zA-Z0-9._%+-]*[a-zA-Z0-9]@[a-zA-Z0-9]+[a-zA-Z0-9.-]*[a-zA-Z0-9]\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }

    /*
        this method should find a date in string
        note that it should be in british or american format
        if there's no match for a date, return null
     */
    public String findDate(String string) {
        // todo
        String regex1 = "\\b(0?[1-9]|[12][0-9]|3[01])[-/](0?[1-9]|1[012])[-/](\\d{4})\\b";
        String regex2 = "\\b(\\d{4})[-/](0?[1-9]|1[012])[-/](0?[1-9]|[12][0-9]|3[01])\\b";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(string);
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(string);
        if (matcher1.find()) {
            return matcher1.group();
        }
        else if (matcher2.find()) {
            return matcher2.group();
        }
        else
            return null;
    }

    /*
        given a string, implement the method to detect all valid passwords
        then, it should return the count of them

        a valid password has the following properties:
        - at least 8 characters
        - has to include at least one uppercase letter, and at least a lowercase
        - at least one number and at least a special char "!@#$%^&*"
        - has no white-space in it
     */
    public int findValidPasswords(String string) {
        // todo
        return -1;
    }

    /*
        you should return a list of *words* which are palindromic
        by word we mean at least 3 letters with no whitespace in it

        note: your implementation should be case-insensitive, e.g. Aba -> is palindrome
     */
    public List<String> findPalindromes(String string) {
        List<String> list = new ArrayList<>();
        // todo
        String regex = "[a-zA-Z]{3,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            String temp = matcher.group().toLowerCase();
            String reversed = new StringBuilder(temp).reverse().toString();
            if (temp.equals(reversed)) {
                list.add(temp);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        // you can test your code here
    }
}
