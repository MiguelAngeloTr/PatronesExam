package Strategy;

class Sepia implements InterfaceFiltros {
    public void aplicarFiltros(String nombreImagen) {
        System.out.println("Se va aplicar filtro de Sepia a "+ nombreImagen);
    }
}