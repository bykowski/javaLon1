package pl.bykowski.game;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CatController {

    private List<Cat> catList;

    public CatController() {
        catList = new ArrayList<>();
        catList.add(new Cat("Filemon", "Dachowiec", "white"));
        catList.add(new Cat("Bonifacy", "Dachowiec", "black"));
        catList.add(new Cat("Klakier", "Dachowiec", "#8B0000"));
    }

    @GetMapping("/cats")
    public String getCats(Model mode) {
        mode.addAttribute("catListModel", catList);
        return "catsView";
    }

    @PostMapping("/cats")
    public String addCat(@RequestBody Cat cat) {
        catList.add(cat);
        return "redirect:/cats";
    }





}
