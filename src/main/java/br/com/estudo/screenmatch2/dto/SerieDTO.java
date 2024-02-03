package br.com.estudo.screenmatch2.dto;

import br.com.estudo.screenmatch2.enuns.Categoria;

public record SerieDTO(Long id,
        String titulo,
        Integer totalTemporadas,
        Double avaliacao,
        Categoria genero,
        String atores,
        String poster,
        String sinopse) {
}
