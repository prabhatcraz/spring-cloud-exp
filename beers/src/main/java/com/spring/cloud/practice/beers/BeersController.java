package com.spring.cloud.practice.beers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Slf4j
@RestController
public class BeersController {
  private final List<String> beers = new ArrayList<String>() {{
    this.add("heineken");
    this.add("Guinness");
    this.add("Blue Moon");
    this.add("Budweiser");
    this.add("Amstel Lager");
    this.add("Labatt Blue");
    this.add("Grolsch");
  }};

  @RequestMapping(path = "/beer")
  public String getAJoke() {
    final Random random = new Random();
    final  String beerName = beers.get(random.nextInt(7));
    log.info("Beer request {}", beerName);
    return beerName;
  }
}
