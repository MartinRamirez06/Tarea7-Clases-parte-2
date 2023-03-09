public class Balon {
    private String Marca;
    private String Equipo;
    private String Color;
    //Constructores por defecto
    public Balon(){
        this.Marca="";
        this.Equipo="";
        this.Color="";
    }
    //Constructores sobrecargados


    public Balon(String marca, String equipo, String color) {
        this.Marca = marca;
        this. Equipo = equipo;
        this.Color = color;
    }
    //Metodos de acceso

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String equipo) {
        Equipo = equipo;
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
        return "Marca='"+Marca+'\''+", Equipo='" + Equipo + '\'' +", Color='"+Color + '\'';
    }
//Metodos de uso general
    public void Botar(){
        System.out.println("El balon esta botando");
    }
    public void Rodar(){
        System.out.println("El balon esta rodando");
    }
}
