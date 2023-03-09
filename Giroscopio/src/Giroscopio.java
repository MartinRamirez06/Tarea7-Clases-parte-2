public class Giroscopio {
    //Atributos
    private double Tamaño;//esta en cm
    private double Peso;//esta en gr
    private double TiempoRespuesta;//esta en segundos

    //constructores por defecto
    public Giroscopio(){
        this.Peso=0.0;
        this.Tamaño=0.0;
        this.TiempoRespuesta=0.0;
    }
    //Constructores sobrecargados
    public Giroscopio(double tamaño, double peso, double tiempoRespuesta) {
        this.Tamaño= tamaño;
        this.Peso = peso;
        this.TiempoRespuesta = tiempoRespuesta;
    }
    //metodos de acceso


    public double getTamaño() {
        return Tamaño;
    }

    public void setTamaño(double tamaño) {
        Tamaño = tamaño;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public double getTiempoRespuesta() {
        return TiempoRespuesta;
    }

    public void setTiempoRespuesta(double tiempoRespuesta) {
        TiempoRespuesta = tiempoRespuesta;
    }

    @Override
    public String toString() {
        return " Tamaño en cm="+Tamaño+", Peso en gr=" +Peso+", Tiempo de Respuesta en seg=" + TiempoRespuesta+'}';
    }
    //Metodos de uso general
    public void DeteccionMoviento(){
        System.out.println("El giroscopio ha detectado un movimiento");
    }

    public void AlarmaEventos(){
        System.out.println("El giroscopio esta empezando a vibrar por la deteccion del movimiento");
    }
}
