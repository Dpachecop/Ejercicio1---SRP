public class Main {
    public static void main(String[] args) {
        ReportesLibro reportesLibro = new ReportesLibro();
        Libro libro = new Libro(
                "El poder del ahora",
                "Autoayuda",
                "Eckhart Tolle",
                1997);

       

        reportesLibro.generarReporte(libro, 1);

        libro = new Libro(
            "100 años de soledad", 
            "Literatura", 
            "Gabriel Garcia",
            1963);

        reportesLibro.generarReporte(libro, 2);
    }
}
