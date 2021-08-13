package FXsample;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField card_tf;
    @FXML
    private Label error_label;
    @FXML
    private Label cardType_label;

    private Model model;

    public Controller() {
        this.model = new Model();
    }

    /* Handle credit card input event. */
    public void handleCreditCard(Event event) {
        checkValidation();
    }

    public void checkValidation() {
        String cardNum = card_tf.getText();
        String cardType = this.model.getCreditCardType(cardNum);

        if( model.isValidCardNum(cardNum)) {
            error_label.setText("v");
            error_label.setStyle("-fx-text-fill:green; " +
                    "-fx-font-weight:bold; ");
        }else {
            error_label.setText("x");
            error_label.setStyle("-fx-text-fill:red; " +
                    "-fx-font-weight:bold; ");
        }
        /* print creditcard type on label. */
        cardType_label.setText(cardType);
    }

}
