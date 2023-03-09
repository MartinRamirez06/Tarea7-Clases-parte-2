public class Lampara {
    //Atributos
    private String Marca;
    private String TonoLuz;
    private int Precio;
    //Constructores por defecto
    public Lampara(){
    this.Marca="";
    this.TonoLuz="";
    this.Precio=0;
    }
    //Constructores sobrecargados
    public Lampara(String marca, String tonoLuz, int precio) {
        this.Marca = marca;
        this.TonoLuz = tonoLuz;
        this.Precio = precio;
    }
    //Metodos de acceso
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getTonoLuz() {
        return TonoLuz;
    }

    public void setTonoLuz(String tonoLuz) {
        TonoLuz = tonoLuz;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }
    //Metodo toString


    @Override
    public String toString() {
        return "Marca='" + Marca + '\''+", TonoLuz='" + TonoLuz+'\''+", Precio en pesos=" + Precio;
    }
//metodos de uso general
    public void Encender(){
        System.out.println("La lampara se ha prendido");
    }
    public void Apagar(){
        System.out.println("La lampara se ha apagado");
    }
}
