package in.codingage.ecommerce.service;

import in.codingage.ecommerce.model.Carouser;

import java.util.List;

public interface CarouserService {


    List<Carouser> getAllCarouser();

    Carouser updateCarouser(Carouser carouser);

    boolean deleteCarouser(int id);


    Carouser createCarouser(Carouser carouser);

    public Carouser getCarouserDetail(int id);
}
