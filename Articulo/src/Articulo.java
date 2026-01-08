
import java.time.LocalDate;

public class Articulo {
    private String titulo;
    private Author autor;
    private LocalDate fechaPublicacion;
    private Categoria categoria;

    public Articulo(Author autor, Categoria categoria, LocalDate fechaPublicacion, String titulo) {
        this.autor = autor;
        this.categoria = categoria;
        this.fechaPublicacion = fechaPublicacion;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Author getAutor() {
        return autor;
    }

    public void setAutor(Author autor) {
        this.autor = autor;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Articulo [titulo=" + titulo + ", autor=" + autor.getName() + ", fechaPublicacion=" + fechaPublicacion
                + ", categoria=" + categoria + "]";
    }

    
    

}
