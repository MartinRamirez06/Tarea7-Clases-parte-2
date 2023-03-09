public class Main {
    public static void main(String[] args) {
        //Creando el pais con el constructor por defecto
        Pais Pais1=new Pais();
        //Estableciendo los valores por los metodos de acceso
        Pais1.setNacion("Andorra");
        Pais1.setGeografia("Montaña");
        Pais1.setPolitica("Monarquia");
        Pais1.setPoblacion(79.034);
        //Imprime Pais por el metodo toString
        System.out.println("Pais 1:"+Pais1);
        //Crea el pais con el constructor sobrecargado
        Pais Pais2= new Pais("Peru", "Montañosa", "Sistema Elctoral",33.072 );//La poblacion esta en millones
        //Imprime pais 2 con toString
        //Imprime Pais por el metodo toString
        System.out.println("Pais 2:"+Pais2);
        //Utiliza metodos de uso general

        Pais1.PagarImpuestos();
        Pais1.Turismo();
    }
}