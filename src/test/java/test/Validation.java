package test;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.kie.dmn.api.core.DMNMessage;
import org.kie.dmn.validation.DMNValidator;
import org.kie.dmn.validation.DMNValidatorFactory;

/**
 * Validation
 */
public class Validation {

    public static void main(String[] args) {
        DMNValidator validator = DMNValidatorFactory.newValidator();
        InputStream dmn = Validation.class.getResourceAsStream("/masked-rules.dmn");
        List<DMNMessage> messages = validator.validate(new InputStreamReader(dmn));

        for (DMNMessage dmnMessage : messages) {
            System.out.println(dmnMessage);
        }

    }
}