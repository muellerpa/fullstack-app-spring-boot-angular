package fullstackappspringbootangular.converter;

import fullstackappspringbootangular.entity.RoomEntity;
import fullstackappspringbootangular.model.reservation.Links;
import fullstackappspringbootangular.model.reservation.ReservationResponse;
import fullstackappspringbootangular.model.reservation.Self;
import fullstackappspringbootangular.rest.ResourceConstants;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.domain.Page;

public class RoomEntityToReservationResponseConverter implements Converter<RoomEntity, ReservationResponse> {
    @Override
    public ReservationResponse convert(RoomEntity source) {

        ReservationResponse reservationResponse = new ReservationResponse();
        reservationResponse.setRoomNumber(source.getRoomNumber());
        reservationResponse.setPrice(Integer.valueOf(source.getPrice()));

        Links links = new Links();
        Self self = new Self();
        self.setRef(ResourceConstants.ROOM_RESERVATION_V1 + "/" + source.getId());
        links.setSelf(self);

        reservationResponse.setLinks(links);

        return reservationResponse;
    }
}
