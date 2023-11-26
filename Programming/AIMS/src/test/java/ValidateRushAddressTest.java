import com.example.aims.controller.RushOrderController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidateRushAddressTest {

    private RushOrderController rushOrderController;

    @BeforeEach
    public void setUp() {
        rushOrderController = new RushOrderController();
    }

    @ParameterizedTest
    @CsvSource({
            "so nha 254, true",
            "re phai, true",
            " , false",
    })
    public void testValidateName(String instructionDelivery, boolean expected) {
        boolean isValid = rushOrderController.validateDeliveryInfo(instructionDelivery);
        assertEquals(expected, isValid);
    }
}
