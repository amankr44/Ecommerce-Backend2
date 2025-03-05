package in.codingage.ecommerce.service;

import in.codingage.ecommerce.model.Carouser;

import java.util.List;
import java.util.Optional;

public interface CarouserService {


    List<Carouser> getAllCarouser();

    Carouser updateCarouser(Carouser carouser);

    void deleteCarouser(String id);


    Carouser createCarouser(Carouser carouser);

    public Optional<Carouser> getCarouserDetail(String id);

    public Carouser findCarouserByHeader(String header);
}
