package br.com.alura.screenmatch.principal;

import java.util.Scanner;

import br.com.alura.screenmatch.service.ConsumoApi;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=1ae9f7fd";

    public void exibeMenu(){
        System.out.println("Digite o nome da serie para busca");
        var nomeSerie = leitura.nextLine();
		var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        
        //"https://www.omdbapi.com/?t=gilmore+girls&apikey=1ae9f7fd"
    }
}
