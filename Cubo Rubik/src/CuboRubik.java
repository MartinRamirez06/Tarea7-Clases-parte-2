public class CuboRubik {
    //Atributos
    private String Marca;
    private String Forma;
    private String Material;
    //Constructores por defecto
    public CuboRubik(){
    this.Marca="";
    this.Forma="";
    this.Material="";
    }
    //Constructores sobrecargados
    public CuboRubik(String marca, String forma, String material) {
        this.Marca = marca;
        this.Forma = forma;
        this.Material = material;
    }
    //Metodos de acceso
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getForma() {
        return Forma;
    }

    public void setForma(String forma) {
        Forma = forma;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String material) {
        Material = material;
    }
//Metodo toString

    @Override
    public String toString() {
        return "Marca='" + Marca +'\''+", Forma='"+Forma +'\''+", Material='"+Material + '\'';
    }
    public void GirarColumna(){
        System.out.println("El Rubik ha girado una columna una pocision");
    }
    public void GirarFila(){
        System.out.println("El Rubik ha girado una fila una pocision");
    }
}
