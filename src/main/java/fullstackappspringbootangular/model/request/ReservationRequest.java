package fullstackappspringbootangular.model.request;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class ReservationRequest {
    private Long id;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate checkout;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate checkin;

    public ReservationRequest() {
    }

    public ReservationRequest(Long id, LocalDate checkout, LocalDate checkin) {
        this.id = id;
        this.checkout = checkout;
        this.checkin = checkin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }
}
