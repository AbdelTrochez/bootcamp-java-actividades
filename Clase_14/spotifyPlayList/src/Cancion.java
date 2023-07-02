public class Cancion {
    private int codigo;
    private String titulo;
    private String artista;
    private String genero;
    private String duracion;

    public Cancion(int codigo, String titulo, String artista, String genero, String duracion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
    }

    public int getCodigo() {
        return codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getArtista() {
        return artista;
    }
    public String getGenero() {
        return genero;
    }
    public String getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return  "Código='" + codigo + '\'' +
                ", Titulo='" + titulo + '\'' +
                ", Artista='" + artista + '\'' +
                ", Género='" + genero + '\'' +
                ", Duración='" + duracion + '\'';
    }
}
