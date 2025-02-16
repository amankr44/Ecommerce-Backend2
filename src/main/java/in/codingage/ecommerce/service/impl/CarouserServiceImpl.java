package in.codingage.ecommerce.service.impl;

import in.codingage.ecommerce.model.Carouser;
import in.codingage.ecommerce.repository.impl.CarouserRepositoryImpl;
import in.codingage.ecommerce.service.CarouserService;

import java.util.List;

public class CarouserServiceImpl implements CarouserService {
    CarouserRepositoryImpl carouserRepository = new CarouserRepositoryImpl();




    public List<Carouser> getAllCarouser() {
        return carouserRepository.getAllCarouser();
    }

    public Carouser updateCarouser(Carouser carouser) {
        return carouserRepository.updateCarouser(carouser);
    }

    @Override
    public boolean deleteCarouser(int id) {
        return carouserRepository.deleteCarouser(id);
    }



    @Override
    public Carouser createCarouser(Carouser carouser) {
        carouserRepository.createCarouser(carouser);
        return carouser;
    }


}
