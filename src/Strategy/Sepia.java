package Strategy.ConcreteStrategies;

import Strategy.InterfaceFiltros;

class Sepia implements InterfaceFiltros {
    public void aplicarFiltros(String nombreImagen) {
        System.out.println("Aplicando filtro de Sepia a "+ nombreImagen);
    }
}