package pl.bykowski.game;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CatController {

    private Cat cat;

    public CatController() {
        cat = new Cat("Filemon", "Dachowiec", "#8B0000");
    }

    @GetMapping("/cats")
    public String getCats(Model mode) {
        mode.addAttribute("nameModel", cat.getName());
        mode.addAttribute("breedModel", cat.getBreed());
        mode.addAttribute("colorModel", cat.getColor());
        return "catsView";
    }

}
