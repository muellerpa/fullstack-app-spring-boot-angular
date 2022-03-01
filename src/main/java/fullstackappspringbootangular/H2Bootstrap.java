package fullstackappspringbootangular;

import fullstackappspringbootangular.entity.RoomEntity;
import fullstackappspringbootangular.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class H2Bootstrap implements CommandLineRunner {

    @Autowired
    RoomRepository roomRepository;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Bootstrapping Data: ");

        roomRepository.save(new RoomEntity(405, "200"));
        roomRepository.save(new RoomEntity(406, "220"));
        roomRepository.save(new RoomEntity(407, "240"));

        Iterable<RoomEntity> itr = roomRepository.findAll();

        for (RoomEntity room : itr) {
            System.out.println(room.getRoomNumber());
        }

    }
}
