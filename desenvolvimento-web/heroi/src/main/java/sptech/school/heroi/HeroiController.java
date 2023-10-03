package sptech.school.heroi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/herois")
public class HeroiController {

    private List<Heroi> listaHerois = new ArrayList<>();
    @GetMapping
    public List<Heroi> exibirHerois() {
        return listaHerois;
    }

    @GetMapping
    public
}
