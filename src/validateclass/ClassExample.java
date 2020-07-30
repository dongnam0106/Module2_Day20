package validateclass;

import validateaccount.AccountExample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExample {

    private static final String CLASS_REGEX = "[C|A|P,]+[0-9]{4}+[G-M]$";

    public ClassExample() {

    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
