package in.codingage.ecommerce.service.impl;

import in.codingage.ecommerce.model.Carouser;
import in.codingage.ecommerce.repository.CarouserRepository;
import in.codingage.ecommerce.service.CarouserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarouserServiceImpl implements CarouserService {
//    CarouserRepositoryImpl carouserRepository = new CarouserRepositoryImpl();

    @Autowired
    private CarouserRepository carouserRepository;



    public Page<Carouser> getAllCarouser(int pageNo, int pageSize) {
       Pageable pageRequest = PageRequest.of(pageNo,pageSize);
        return carouserRepository.findAll(pageRequest);
    }

    public Carouser updateCarouser(Carouser carouser) {
        return carouserRepository.save(carouser);
    }

    @Override
    public void deleteCarouser(String id) {
         carouserRepository.deleteById(id);
    }



    @Override
    public Carouser createCarouser(Carouser carouser) {
        carouserRepository.save(carouser);
        return carouser;
    }


    public Optional<Carouser> getCarouserDetail(String id) {
        return carouserRepository.findById(id);
    }

    public Carouser findCarouserByHeader(String header) {
       return carouserRepository.findByHeader(header);
    }

    @Override
    public void saveCarousers() {
         for(int i =1; i<=1000;i++){
             Carouser carouser = new Carouser();
             carouser.setHeader(String.format("slides : %d",i));
             carouserRepository.save(carouser);
         }
    }

}
