package atr.net.servicioTrivia;

import atr.net.servicioTrivia.entities.Categories;
import atr.net.servicioTrivia.entities.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/question/{categoria}")
    public Question getQuestion(@PathVariable String categoria){

        Question pregunta = getPregunta(categoria);

        return pregunta;
    }

    @GetMapping("/categories")
    public Categories[] getCategories(){

        Categories categoriaCultura = new Categories();
        categoriaCultura.setCategory("Cultura");
        categoriaCultura.setDescription("Preguntas relacionadas con arte, literatura, música y otras expresiones culturales.");

        Categories categoriaDeportes = new Categories();
        categoriaDeportes.setCategory("Deportes");
        categoriaDeportes.setDescription("Preguntas relacionadas con diversos deportes y eventos deportivos.");

        Categories categoriaArte = new Categories();
        categoriaArte.setCategory("Arte");
        categoriaArte.setDescription("Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística.");

        Categories categoriaCine = new Categories();
        categoriaCine.setCategory("Cine");
        categoriaCine.setDescription("Preguntas relacionadas con películas, directores, actores y otros aspectos del cine.");

        Categories categoriaHistoria = new Categories();
        categoriaHistoria.setCategory("Historia");
        categoriaHistoria.setDescription("Preguntas relacionadas con eventos históricos, personajes y períodos importantes.");

        Categories categoriaCiencia = new Categories();
        categoriaCiencia.setCategory("Ciencia");
        categoriaCiencia.setDescription("Preguntas relacionadas con diferentes ramas de la ciencia, descubrimientos y avances científicos.");

         Categories[] categorias = {categoriaCultura,categoriaDeportes, categoriaArte, categoriaCine, categoriaHistoria, categoriaCiencia};

        return categorias;
    }

    private Question getPregunta(String categoria){
        Question pregunta = new Question();

        if(categoria.equals("Cultura")) pregunta = getPreguntaCultura();
        if(categoria.equals("Deportes")) pregunta = getPreguntaDeportes();
        if(categoria.equals("Arte")) pregunta = getPreguntaArte();
        if(categoria.equals("Cine")) pregunta = getPreguntaCine();
        if(categoria.equals("Historia")) pregunta = getPreguntaHistoria();
        if(categoria.equals("Ciencia")) pregunta = getPreguntaCiencia();

        return pregunta;
    }
    private Question getPreguntaCultura(){

        Question preguntaArte = new Question();

        preguntaArte.setCategory("Cultura");
        preguntaArte.setQuestion("¿Qué ingredintes se necesitan para hacer una michelada?");
        String[] opciones = {"Cerveza, lima/limón, sal, chile en polvo, salsa tipo inglesa, picante", "Cerveza, lima/limón y limon", "Cerveza, sal, tabasco y lima/limón"};
        preguntaArte.setOptions(opciones);
        preguntaArte.setAnswer(0);
        preguntaArte.setExplanation("La michelada, originaria de México, nacida de la creatividad y el deseo de refrescar, se convirtió en una popular bebida que cautivó a los amantes de la cerveza con su combinación única de sabores y su espíritu festivo.");

        return preguntaArte;
    }

    private Question getPreguntaDeportes(){
        Question preguntaDeportes = new Question();

        preguntaDeportes.setCategory("Deportes");
        preguntaDeportes.setQuestion("¿Cuál es el deporte más popular en el mundo?");
        String[] opcionesDeportes = {"Fútbol", "Baloncesto", "Tenis"};
        preguntaDeportes.setOptions(opcionesDeportes);
        preguntaDeportes.setAnswer(0);
        preguntaDeportes.setExplanation("El fútbol es ampliamente considerado como el deporte más popular en el mundo, con miles de millones de seguidores y una amplia participación a nivel mundial.");

        return preguntaDeportes;
    }
    private Question getPreguntaArte(){
        Question preguntaArte = new Question();

        preguntaArte.setCategory("Arte");
        preguntaArte.setQuestion("¿Quién pintó la Mona Lisa?");
        String[] opcionesArte = {"Leonardo da Vinci", "Pablo Picasso", "Vincent van Gogh"};
        preguntaArte.setOptions(opcionesArte);
        preguntaArte.setAnswer(0);
        preguntaArte.setExplanation("La Mona Lisa es una famosa pintura renacentista creada por el artista italiano Leonardo da Vinci.");

        return preguntaArte;
    }
    private Question getPreguntaCine(){
        Question preguntaCine = new Question();

        preguntaCine.setCategory("Cine");
        preguntaCine.setQuestion("¿Quién dirigió la película \"El Padrino\"?");
        String[] opcionesCine = {"Francis Ford Coppola", "Martin Scorsese", "Steven Spielberg"};
        preguntaCine.setOptions(opcionesCine);
        preguntaCine.setAnswer(0);
        preguntaCine.setExplanation("La película \"El Padrino\" fue dirigida por Francis Ford Coppola, y es considerada como una de las mejores películas de la historia del cine.");

        return preguntaCine;
    }
    private Question getPreguntaHistoria(){
        Question preguntaHistoria = new Question();

        preguntaHistoria.setCategory("Historia");
        preguntaHistoria.setQuestion("¿En qué año se firmó la Declaración de Independencia de los Estados Unidos?");
        String[] opcionesHistoria = {"1776", "1789", "1812"};
        preguntaHistoria.setOptions(opcionesHistoria);
        preguntaHistoria.setAnswer(0);
        preguntaHistoria.setExplanation("La Declaración de Independencia de los Estados Unidos fue firmada en el año 1776, marcando el inicio de la independencia de las colonias americanas respecto al Reino de Gran Bretaña.");

        return preguntaHistoria;
    }
    private Question getPreguntaCiencia(){
        Question preguntaCiencia = new Question();

        preguntaCiencia.setCategory("Ciencia");
        preguntaCiencia.setQuestion("¿Quién propuso la teoría de la relatividad?");
        String[] opcionesCiencia = {"Albert Einstein", "Isaac Newton", "Stephen Hawking"};
        preguntaCiencia.setOptions(opcionesCiencia);
        preguntaCiencia.setAnswer(0);
        preguntaCiencia.setExplanation("La teoría de la relatividad fue propuesta por Albert Einstein, revolucionando nuestra comprensión del espacio, el tiempo y la gravedad.");

        return preguntaCiencia;
    }
}
