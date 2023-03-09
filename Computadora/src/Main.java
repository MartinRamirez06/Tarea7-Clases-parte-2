public class Main {
    public static void main(String[] args) {
        //Creando la computadora con el constructor por defecto
        Computadora Computadora1=new Computadora();
        //Estableciendo los valores por los metodos de acceso
        Computadora1.setMarcaGeneral("ASUS");
        Computadora1.setMarcaProcesador("Intel");
        Computadora1.setMemoriaRAM(8);
        Computadora1.setMemoriaAlmacenimiento(1);
        //Imprime Computadora1 por el metodo toString
        System.out.println("Computadora 1:"+Computadora1);
        //Crea la computadora con el constructor sobrecargado
        Computadora Computadora2= new Computadora("DELL", "Ryzen", 16,1);
        //Imprime Pais por el metodo toString
        System.out.println("Computadora 2:"+Computadora2);
        //Utiliza metodos de uso general

        Computadora1.Encender();
        Computadora1.Suspender();
    }
}