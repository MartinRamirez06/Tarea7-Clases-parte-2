public class Computadora {
//Atributos
    private String MarcaGeneral;
    private String MarcaProcesador;
    private int MemoriaRAM;
    private int MemoriaAlmacenimiento;

    //Constructores por defecto
    public Computadora(){
    this.MarcaGeneral="";
    this.MarcaProcesador="";
    this.MemoriaRAM=0;
    this.MemoriaAlmacenimiento=0;
    }
    //Constructores sobrecargados
    public Computadora(String marcaGeneral, String marcaProcesador, int memoriaRAM, int memoriaAlmacenimiento) {
        this.MarcaGeneral = marcaGeneral;
        this.MarcaProcesador = marcaProcesador;
        this.MemoriaRAM = memoriaRAM;
        this.MemoriaAlmacenimiento = memoriaAlmacenimiento;
    }
    //Metodos de acceso
    public String getMarcaGeneral() {
        return MarcaGeneral;
    }

    public void setMarcaGeneral(String marcaGeneral) {
        MarcaGeneral = marcaGeneral;
    }

    public String getMarcaProcesador() {
        return MarcaProcesador;
    }

    public void setMarcaProcesador(String marcaProcesador) {
        MarcaProcesador = marcaProcesador;
    }

    public int getMemoriaRAM() {
        return MemoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        MemoriaRAM = memoriaRAM;
    }

    public int getMemoriaAlmacenimiento() {
        return MemoriaAlmacenimiento;
    }

    public void setMemoriaAlmacenimiento(int memoriaAlmacenimiento) {
        MemoriaAlmacenimiento = memoriaAlmacenimiento;
    }
//Metodo toString


    @Override
    public String toString() {
        return "MarcaGeneral='"+MarcaGeneral+'\''+", MarcaProcesador='"+MarcaProcesador+'\''+", Capacidad de la memoria RAM en GB="+MemoriaRAM+", Capacidad de la memoria de Almacenimiento en Tb="+MemoriaAlmacenimiento;
    }
    //Metodos de uso general
    public void Encender(){
        System.out.println("La computadora se ha encendido");
    }
    public void Suspender(){
        System.out.println("La computadora se esta entrando en modo suspendido");
    }


}
