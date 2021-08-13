package FXsample;

public class Model {
    private String cardNum = "";

    public Model() {

    }
    /* Return true if the credit card number is valid, otherwise return false. */
    public boolean isValidCardNum(String s) {

        // WHY numbers are not matched 16 digits???
        return s.matches("4[0-9]{15}|5[0-9]{15}|3[47][0-9]{14}|35[0-9]{14}");
    }

    /* Return the credit card type, otherwise return invalid card. */
    public String getCreditCardType(String s) {
        if(s.matches("4[0-9]{15}")) {           // visas start with 4
            return "VISA";
        };
        if(s.matches("5[0-9]{15}")) {           // mastercards start with 5
            return "Mastercard";
        };
        if(s.matches("3[47][0-9]{14}")) {       // amexs start with 34 or 37
            return "American Express";
        };
        if(s.matches("35[0-9]{14}")) {          // JCBs start with 35
            return "JCB";
        };
        return "Invalid Card";
    }

}
