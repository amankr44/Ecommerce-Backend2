package in.codingage.ecommerce.repository.impl;

import in.codingage.ecommerce.model.Carouser;
import in.codingage.ecommerce.repository.CarouserRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarouserRepositoryImpl implements CarouserRepository {
    List<Carouser> carouserList = new ArrayList<>();




    public List<Carouser> getAllCarouser() {
      return carouserList;
    }


    public Carouser updateCarouser(Carouser carouser) {
        for(Carouser carouser1 : carouserList){
            if(carouser1.getId()==carouser.getId()){

                carouser1.setHeader(carouser.getHeader());
                carouser1.setSubHeader(carouser.getSubHeader());
                carouser1.setBackGroundUrl(carouser.getBackGroundUrl());
                return carouser;
            }
        }
        return null;
    }

    public boolean deleteCarouser(int id) {
        for(Carouser carouser : carouserList){
            if(carouser.getId()==id){
                carouserList.remove(carouser);
                return true;
            }
        }
        return false;
    }

    @Override
    public void createCarouser(Carouser carouser) {
        if (carouser != null) {
            carouserList.add(carouser);
        }
    }
}

