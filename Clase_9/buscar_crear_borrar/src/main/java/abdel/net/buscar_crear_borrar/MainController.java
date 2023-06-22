package abdel.net.buscar_crear_borrar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {

    public List<String> LISTA_PERSONAS = new ArrayList<>();

    public void listaInicial(){
        LISTA_PERSONAS.add("Maria Alvarez");
        LISTA_PERSONAS.add("Juan Perez");
        LISTA_PERSONAS.add("Ana Garcia");
        LISTA_PERSONAS.add("Luis Rodriguez");
        LISTA_PERSONAS.add("Carolina Torres");
        LISTA_PERSONAS.add("Pedro Ramirez");
        LISTA_PERSONAS.add("Laura Hernandez");
        LISTA_PERSONAS.add("Andres Lopez");
        LISTA_PERSONAS.add("Sofia Martinez");
        LISTA_PERSONAS.add("Javier Fernandez");
    }
    @GetMapping("/personas")
    public List<String> getNombres(){
        if (LISTA_PERSONAS.isEmpty()) listaInicial();

        return LISTA_PERSONAS;
    }

    @GetMapping("/buscar-personas/{nombre}")
    public List<String> buscarPersonas(@PathVariable String nombre){

        if (LISTA_PERSONAS.isEmpty()) listaInicial();

        List<String> coincidencias = new ArrayList<>();

        for(String persona:LISTA_PERSONAS){
            if(persona.toUpperCase().contains(nombre.toUpperCase())){
                coincidencias.add(persona);
            }
        }

        return coincidencias;
    }

    @GetMapping("/agregar-personas/{nombre}")
    public List<String> agregarPersonas(@PathVariable String nombre){

        if (LISTA_PERSONAS.isEmpty()) listaInicial();

        if(!LISTA_PERSONAS.contains(nombre)){
            LISTA_PERSONAS.add(nombre);
        }
        return LISTA_PERSONAS;
    }

    @GetMapping("/borrar-personas/{nombre}")
    public List<String> borrarPersonas(@PathVariable String nombre){

        if (LISTA_PERSONAS.isEmpty()) listaInicial();

        if(LISTA_PERSONAS.contains(nombre)){
            LISTA_PERSONAS.remove(nombre);
        }
        return LISTA_PERSONAS;
    }
}
