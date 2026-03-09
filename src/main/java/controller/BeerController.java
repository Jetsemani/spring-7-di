package controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import services.BeerService;

@AllArgsConstructor
@Controller
public class BeerController {
    private final BeerService beerService;
}
