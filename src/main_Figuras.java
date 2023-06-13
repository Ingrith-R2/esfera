import java.util.Scanner;

public class main_Figuras {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        figuras_3D esfera= new figuras_3D();
        System.out.println("Ingrese el radio: ");
        double rad = entrada.nextDouble();

        esfera.imprimir_datos_esfera();


    }


}
