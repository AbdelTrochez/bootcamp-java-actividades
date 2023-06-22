package atr.net.googleAutocomplete;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @GetMapping("/busqueda-usuario/{busqueda}")
    public String[] obtenerPalabrasAutocompletar(@PathVariable String busqueda){

        String[] frasesBusqueda={"bootcamp de java","bootcamp de python","curso de nodejs","curso de C", "bootcamp avanzado de java"};

        String[] resultadoBusqueda = new String[10];
        int contador=0;

        for(String frase : frasesBusqueda){
            if(frase.toUpperCase().contains(busqueda.toUpperCase())){
                resultadoBusqueda[contador] = frase;
                contador++;
            }
        }

    return resultadoBusqueda;
    }
}
