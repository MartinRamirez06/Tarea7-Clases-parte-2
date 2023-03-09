public class Main {
    public static void main(String[] args) {
        //Creando el libro con el constructor por defecto
        Libro Libro1=new Libro();
        //Estableciendo los valores por los metodos de acceso
        Libro1.setEditorial("Porrua");
        Libro1.setGenero("Terror");
        Libro1.setIdioma("Español");
        //Imprime Libro1 por el metodo toString
        System.out.println("Libro 1:"+Libro1);
        //Crea el libro2 con el constructor sobrecargado
        Libro Libro2= new Libro("AlfaOmega", "Educativo","Ingles");
        //Imprime Pais por el metodo toString
        System.out.println("Libro 2:"+Libro2);
        //Utiliza metodos de uso general

        Libro1.MarcarPaginasImportantes();
        Libro1.SubrayarParrafo();

    }
}