
// CLASE LIBRO, SOLO HACE MANEJO DE LA INFORMACION

public class Libro {

private String nombreLibro;
private String generoLibro;
private String Autor;
private int AñoPublicacion;


public Libro(String nombreLibro, String generoLibro, String Autor, int AñoPublicacion
){
    this.nombreLibro = nombreLibro;
    this.generoLibro = generoLibro;
    this.Autor = Autor;
    this.AñoPublicacion = AñoPublicacion;
}

public String getNombreLibro(){
    return this.nombreLibro;
}

public String getGeneroLibro(){
    return this.generoLibro;
}

public String getAutor(){
    return this.Autor;
}
public int getAñoPublicacion(){
    return this.AñoPublicacion;
}






}