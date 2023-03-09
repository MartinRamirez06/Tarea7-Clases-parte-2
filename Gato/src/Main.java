public class Main {
    public static void main(String[] args) {
        //Creando Gato1 con el constructor por defecto
        Gato Gato1=new Gato();
        //Estableciendo los valores por los metodos de acceso
        Gato1.setNombre("Willson");
        Gato1.setEdad(3);
        Gato1.setColor("Negro");
        //Imprime Gato1 por el metodo toString
        System.out.println("Gato 1:"+Gato1);
        //Crea Gato2 con el constructor sobrecargado
        Gato Gato2= new Gato("Kylo", 5,"Gris");
        //Imprime Gato2 por el metodo toString
        System.out.println("Gato 2:"+Gato2);
        //Utiliza metodos de uso general

        Gato1.Comer();
        Gato1.Dormir();



    }
}