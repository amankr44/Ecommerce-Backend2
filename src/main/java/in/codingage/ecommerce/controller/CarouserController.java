package in.codingage.ecommerce.controller;

import in.codingage.ecommerce.model.Carouser;
import in.codingage.ecommerce.service.impl.CarouserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/carouser")
public class CarouserController {
//    CarouserServiceImpl carouserService = new CarouserServiceImpl();

    @Autowired
    private CarouserServiceImpl carouserService;

    @PostMapping
    public Carouser createCarouser(@RequestBody Carouser carouser){
        return carouserService.createCarouser(carouser);
    }

    @GetMapping
    public List<Carouser> getAllCarouser(){
        return carouserService.getAllCarouser();
    }

    @PutMapping
    public Carouser updateCarouser(@RequestBody Carouser carouser){
        return carouserService.updateCarouser(carouser);
    }

    @DeleteMapping
    public boolean deleteCarouser(@RequestParam int id){
        return carouserService.deleteCarouser(id);
    }
}
