package atr.net.servicioTrivia;

import atr.net.servicioTrivia.entities.Categories;
import atr.net.servicioTrivia.entities.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/question/{categoria}")
    public Question getQuestions(@PathVariable String categoria){

        if(categoria.equals("Arte")){}

        Question pregunta1 = new Question();

        pregunta1.setCategory("Cultura");
        pregunta1.setQuestion("¿Qué ingredintes se necesitan para hacer una michelada?");
        String[] opciones = {"Cerveza, lima/limón, sal, chile en polvo, salsa tipo inglesa, picante", "Cerveza, lima/limón y limon", "Cerveza, sal, tabasco y lima/limón"};
        pregunta1.setOptions(opciones);
        pregunta1.setAnswer(0);
        pregunta1.setExplanation("La michelada, originaria de México, nacida de la creatividad y el deseo de refrescar, se convirtió en una popular bebida que cautivó a los amantes de la cerveza con su combinación única de sabores y su espíritu festivo.");


        return pregunta1;
    }

    @GetMapping("/categories")
    public Categories[] getCategories(){

        Categories categoria1 = new Categories();
        categoria1.setCategory("Arte");
        categoria1.setDescription("Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística.");

        Categories categoria2 = new Categories();
        categoria2.setCategory("Deportes");
        categoria2.setDescription("Preguntas relacionadas con diversos deportes y eventos deportivos.");

         Categories[] categorias = {categoria1,categoria2};

        return categorias;
    }
}
