package Strategy.ConcreteStrategies;

import Strategy.InterfaceFiltros;

class AltoContrasteFiltro implements InterfaceFiltros {
    public void aplicarFiltros(String nombreImagen) {
        System.out.println("Filtro de alto contraste  " + nombreImagen);
    }
}