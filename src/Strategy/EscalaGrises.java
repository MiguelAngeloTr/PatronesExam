package Strategy;

class EscalaGrisesFiltro implements InterfaceFiltros {
    public void aplicarFiltros(String nombreImagen) {
        System.out.println("Filtro de escala de grises a "+ nombreImagen);
    }
}