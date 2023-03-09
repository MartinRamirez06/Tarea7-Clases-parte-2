public class Libro {
    //Atributos
    private String Editorial;
    private String Genero;
    private String Idioma;

    //Constructores por defecto
    public Libro(){
    this.Editorial="";
    this.Genero="";
    this.Idioma="";
    }
    //Constructores sobrecargados
    public Libro(String editorial, String genero, String idioma) {
        this.Editorial = editorial;
        this.Genero = genero;
        this.Idioma = idioma;
    }
    //Metodos de acceso
    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String editorial) {
        Editorial = editorial;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String idioma) {
        Idioma = idioma;
    }
//Metodo toString
    @Override
    public String toString() {
        return "Editorial='"+Editorial+'\''+", Genero='" + Genero + '\'' + ", Idioma='"+Idioma+'\'';
    }
    public void MarcarPaginasImportantes(){
        System.out.println("Has marcado una pagina imortante");
    }
    public void SubrayarParrafo(){
        System.out.println("Has subrayado un parrafo");
    }
}
