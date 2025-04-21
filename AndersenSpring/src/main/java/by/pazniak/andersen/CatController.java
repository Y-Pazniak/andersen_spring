package by.pazniak.andersen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cats")
public class CatController {
    @Autowired
    private CatRepository catRepository;

    @PostMapping
    public Cat createCat(@RequestBody Cat cat) {
        return catRepository.save(cat);
    }

    @GetMapping
    public List<Cat> getAllCats() {
        return catRepository.findAll();
    }
}
