package br.com.alura.screenmatch.model;

import java.util.List;

public record DadosTemporada(@JsonAliasInteger numero, 
                            List<DadosEpisodio> episodios,
                            )) {

}
