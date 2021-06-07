package page;

import map.OrderHistoryMap;
import org.junit.Assert;

public class OrderHistoryPage extends OrderHistoryMap {

    public void validaPagamentoComCheque() {
        String MsgAuthentication = TitlePayByCheck.getText();
        Assert.assertEquals("Payment by check", MsgAuthentication);
    }
}
