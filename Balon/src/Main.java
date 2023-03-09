public class Main {
    public static void main(String[] args) {
        //Creando el balon con el constructor por defecto
        Balon Balon1=new Balon();
        //Estableciendo los valores por los metodos de acceso
        Balon1.setMarca("Adidas");
        Balon1.setEquipo("America");
        Balon1.setColor("Amarillo");
        //Imprime Balon1 por el metodo toString
        System.out.println("Balon 1:"+Balon1);
        //Crea el balon2 con el constructor sobrecargado
        Balon Balon2= new Balon("Adidas", "Farcelona FC","Rojo con amarrillo");
        //Imprime Balon por el metodo toString
        System.out.println("Balon 2:"+Balon2);
        //Utiliza metodos de uso general

        Balon1.Botar();
        Balon1.Rodar();



    }
}