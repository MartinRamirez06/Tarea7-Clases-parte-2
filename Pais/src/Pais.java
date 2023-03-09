public class Pais {

    //Atributos
    private String Nacion;
    private String Geografia;
    private String Politica;
    private double Poblacion;


    //Constructores por defecto
    public Pais (){
    this.Nacion="";
    this.Poblacion=0.0;
    this.Politica="";
    this.Geografia="";
    }

    //Constructores sobrecargado
    public Pais(String nacion, String geografia, String politica, double poblacion) {
        this.Nacion= nacion;
        this.Geografia = geografia;
        this.Politica= politica;
        this.Poblacion = poblacion;

    }

    //Metodos de acceso

    public String getNacion() {
        return Nacion;
    }

    public void setNacion(String nacion) {
        Nacion = nacion;
    }

    public String getGeografia() {
        return Geografia;
    }

    public void setGeografia(String geografia) {
        Geografia = geografia;
    }

    public String getPolitica() {
        return Politica;
    }

    public void setPolitica(String politica) {
        Politica = politica;
    }

    public double getPoblacion() {
        return Poblacion;
    }

    public void setPoblacion(double poblacion) {
        Poblacion = poblacion;
    }

    //Metodo toString
    @Override

    public String toString() {
        return "Nacion='"+Nacion+'\''+" Geografia='"+Geografia+'\''+", Politica='"+Politica+'\''+", Poblacion="+Poblacion;
    }

    //Metodos de uso general
    //Pagar Impuestos, Turismo
    public void PagarImpuestos() {
        System.out.println("El pais ha recibido tus impuestos");
    }

    public void Turismo() {
        System.out.println("El pais te brinda su servicio Turistico");
    }

}
