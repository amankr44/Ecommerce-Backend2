package in.codingage.ecommerce.controller;

import in.codingage.ecommerce.model.Carouser;
import in.codingage.ecommerce.service.CarouserService;
import in.codingage.ecommerce.service.impl.CarouserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/carouser")
public class CarouserController {


    @Autowired
//    private CarouserServiceImpl carouserService;
    private CarouserService carouserService;

    @PostMapping
    public Carouser createCarouser(@RequestBody Carouser carouser){
        return carouserService.createCarouser(carouser);
    }

    @GetMapping
    public List<Carouser> getAllCarouser(){
        return carouserService.getAllCarouser();
    }

    @GetMapping("/carouserDetail")
    public Optional<Carouser> getCarouserDetail(@RequestParam String id){
        return carouserService.getCarouserDetail(id);
    }

    @GetMapping("/name")
    public Carouser findCarouserByHeader(@RequestParam String header){
        return carouserService.findCarouserByHeader(header);
    }

    @PutMapping
    public Carouser updateCarouser(@RequestBody Carouser carouser){
        return carouserService.updateCarouser(carouser);
    }

    @DeleteMapping
    public void deleteCarouser(@RequestParam String id){
         carouserService.deleteCarouser(id);
    }
}
