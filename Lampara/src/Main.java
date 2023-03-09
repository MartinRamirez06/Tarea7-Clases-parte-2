public class Main {
    public static void main(String[] args) {
        //Creando la lampara con el constructor por defecto
        Lampara Lampara1=new Lampara();
        //Estableciendo los valores por los metodos de acceso
        Lampara1.setMarca("ULINE");
        Lampara1.setTonoLuz("Clara");
        Lampara1.setPrecio(800);
        //Imprime Lampara1 por el metodo toString
        System.out.println("Lampara 1:"+Lampara1);
        //Crea lampara2 con el constructor sobrecargado
        Lampara Lampara2= new Lampara("Tecnolite", "Amarillo",900);
        //Imprime Lampara2 por el metodo toString
        System.out.println("Lampara 2:"+Lampara2);
        //Utiliza metodos de uso general

        Lampara1.Encender();
        Lampara1.Apagar();



    }
}
