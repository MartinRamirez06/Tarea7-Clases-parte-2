public class Main {
    public static void main(String[] args) {
    //Creando el giroscopio con constructor por defecto
        Giroscopio Giroscopio1 =new Giroscopio();
        //Estableciendo valores con los metodos de acceso
        Giroscopio1.setPeso(100);
        Giroscopio1.setTamaño(20.05);
        Giroscopio1.setTiempoRespuesta(0.50 );
        //Imprime el giroscopio con toString
        System.out.println("Giroscopio 1:"+Giroscopio1);
        //Crea el giroscopio con el constructor sobrecargado
        Giroscopio Giroscopio2= new Giroscopio(25.3,0.4,0.2);
        //Imprime pais 2 con toString
        //Imprime Pais por el metodo toString
        System.out.println("Giroscopio 2:"+Giroscopio2);
        //Utiliza metodos de uso general

        Giroscopio1.DeteccionMoviento();
        Giroscopio1.AlarmaEventos();







    }
}