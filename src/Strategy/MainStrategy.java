package Strategy;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Imagen imagen = new Imagen();


        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Que filtro desea agregar a la imagen?");
        System.out.println("1. Filtro de Alto Contraste");
        System.out.println("2. Filtro de Escala de Grises");
        System.out.println("3. Filtro de Sepia");

        int op = scanner.nextInt();

        switch (op) {
            case 1:

                imagen.setFiltro(new AltoContraste());
                imagen.Editar(" Alto contraste");
                break;
            case 2:

                imagen.setFiltro(new EscalaGrises());
                imagen.Editar("Escala de grises");
                break;
            case 3:

                imagen.setFiltro(new Sepia());
                imagen.Editar("Sepia");;
                break;
            default:
                System.out.println("Seleccione 1, 2 o 3.");
        }

        scanner.close();
    }
}