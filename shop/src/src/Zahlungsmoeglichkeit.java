package src;

public enum Zahlungsmoeglichkeit {
    BARZAHLUNG("barzahlung"),
    PAYPAL("paypal"),
    GIROPAY("paypal"),
    KREDITKARTE("paypal"),
    BITCOIN("bitcoin");

    private String payment;

    Zahlungsmoeglichkeit(String payment) {
        this.payment = payment;
    }

    public static Zahlungsmoeglichkeit getRandom (){ //Zufällige Zahlungsmethode

        return values()[(int) (Math.random()* values().length)];
    }

}


class  PaymentNotFoundException extends Exception {

    public PaymentNotFoundException(String message) {
        super(message);
    }

}



