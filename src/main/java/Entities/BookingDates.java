package Entities;

public class BookingDates {

    private String checking;
    private String checkout;

    public BookingDates(String checking, String checkout) {
        this.checking = checking;
        this.checkout = checkout;
    }

    public String getChecking() {
        return checking;
    }

    public void setChecking(String checking) {
        this.checking = checking;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }


}
