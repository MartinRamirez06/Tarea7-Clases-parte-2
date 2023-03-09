public class Gato {
    //Atributos
    private String Nombre;
    private int Edad;
    private String Color;

    //Constructores por defecto
    public Gato() {
        this.Nombre = "";
        this.Color = "";
        this.Edad = 0;
    }

    //Constructores sobrecargados
    public Gato(String nombre, int edad, String color) {
        this.Nombre = nombre;
        this.Color = color;
        this.Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
    //Metodo toString
    @Override
    public String toString() {
        return "Nombre='"+Nombre+'\''+", Edad en años humanos="+Edad+", Color='" + Color + '\'';
    }
//Metodos de uso general
    public void Comer(){
        System.out.println("El gato esta comiendo");
    }
    public void Dormir(){
        System.out.println("El gato esta durmiendo");
    }
}
