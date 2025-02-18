package in.codingage.ecommerce.repository;

import in.codingage.ecommerce.model.Carouser;

import java.util.List;

public interface CarouserRepository {


    List <Carouser> getAllCarouser();

    public Carouser updateCarouser(Carouser carouser);

    public boolean deleteCarouser(int id);

    void createCarouser(Carouser carouser);

    public Carouser getCarouserDetail(int id);
}
