package br.com.estudo.screenmatch2.controller;

import br.com.estudo.screenmatch2.dto.SerieDTO;
import br.com.estudo.screenmatch2.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SerieController {

    @Autowired
    private SerieService service;

    @GetMapping("/series")
    public List<SerieDTO> obterSeries() {
        return service.obterTodasAsSeries();
    }

    @GetMapping("/series/top5")
    public List<SerieDTO> obterTop5Series() {
        return service.obterTop5Series();
    }
}
