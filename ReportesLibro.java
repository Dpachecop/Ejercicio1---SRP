
//CLASE REPORTES, SOLO IMPRIME LOS DATOS DEL LIBRO

public class ReportesLibro {
    
public void generarReporte(Libro libro, int numeroReporte){

System.out.println("             Reporte del libro "+numeroReporte );
System.out.println("******************************************* "  );
System.out.println("Titulo: " + libro.getNombreLibro() );
System.out.println("Genero: " + libro.getGeneroLibro()  );
System.out.println("autor: " + libro.getAutor()  );
System.out.println("Año de publicacion: " + libro.getAñoPublicacion()  );


}


}
