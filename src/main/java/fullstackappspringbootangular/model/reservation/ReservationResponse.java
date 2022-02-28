package fullstackappspringbootangular.model.reservation;

public class ReservationResponse {

    private long id;
    private Integer roomNumber;
    private Integer price;
    private Links links;

    public long getId() {
        return id;
    }

    public ReservationResponse() {
    }

    public ReservationResponse(Integer roomNumber, Integer price) {
        this.roomNumber = roomNumber;
        this.price = price;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}
