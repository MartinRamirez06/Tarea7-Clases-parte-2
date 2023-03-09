public class Main {
    public static void main(String[] args) {
        //Creando El rubik con el constructor por defecto
        CuboRubik CuboRubik1=new CuboRubik();
        //Estableciendo los valores por los metodos de acceso
        CuboRubik1.setMarca("GAN");
        CuboRubik1.setForma("Cubica");
        CuboRubik1.setMaterial("Plastico");
        //Imprime CuboRubik1 por el metodo toString
        System.out.println("Cubo Rubik 1:"+CuboRubik1);
        //Crea el cubo 2 con el constructor sobrecargado
        CuboRubik CuboRubik2= new CuboRubik("QiYi", "Piramidal","Acero");
        //Imprime Pais por el metodo toString
        System.out.println("Cubo Rubik 2:"+CuboRubik2);
        //Utiliza metodos de uso general

        CuboRubik1.GirarColumna();
        CuboRubik1.GirarFila();
    }
}