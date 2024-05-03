package Strategy.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Imagen imagen = new Imagen();


        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el filtro que desea aplicar a la imagen:");
        System.out.println("1. Filtro de Alto Contraste");
        System.out.println("2. Filtro de Escala de Grises");
        System.out.println("3. Filtro de Sepia");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                // Lógica para aplicar el filtro de Alto Contraste a la imagen
                imagen.setFiltro(new AltoContrasteFiltro());
                imagen.Editar("Imagen de alto contraste");
                break;
            case 2:
                // Lógica para aplicar el filtro de Escala de Grises a la imagen
                imagen.setFiltro(new EscalaGrisesFiltro());
                imagen.Editar("Imagen de Escala de grises");
                break;
            case 3:
                // Lógica para aplicar el filtro de Sepia a la imagen
                imagen.setFiltro(new Sepia());
                imagen.Editar("Imagen de Sepia");;
                break;
            default:
                System.out.println("Opción no válida. Por favor seleccione 1, 2 o 3.");
        }

        scanner.close();
    }
}