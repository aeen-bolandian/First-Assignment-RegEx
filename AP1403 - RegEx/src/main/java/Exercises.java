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
        String regex = "\\b(?=\\S*[A-Z])(?=\\S*[a-z])(?=\\S*\\d)(?=\\S*[!@#$%^&*])\\S{8,}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        int counter = 0;
//        while(matcher.find())
//        {
//            System.out.println(matcher.group());
//        }
        while (matcher.find()) {
            counter++;
        }
        return counter;
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
//        Exercises ex = new Exercises();
//        String test = """
//                [09:15] Dev1: Just changed my password to CodeMaster@2025. \s
//                [09:17] Dev2: Haha, mine's still qwerty123, no special chars. \s
//                [09:19] Dev3: I use GitHubSuper#1 but need a better one. \s
//                [09:21] Dev4: AdminPass42! is good, right? \s
//                [09:23] Dev5: No, too simple. I switched to UltraSecure$99 last week. \s
//                [09:25] Dev6: Wait, are we sharing passwords here? \uD83D\uDE02 \s
//                """;
//        ex.findValidPasswords(test);
    }
}
