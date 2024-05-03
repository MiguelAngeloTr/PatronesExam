package Strategy.Context;

import Strategy.InterfaceFiltros;

class Imagen {
        private InterfaceFiltros filtro;

        public void setFiltro(InterfaceFiltros filtro) {
            this.filtro = filtro;
        }

        public void Editar(String nombreImagen){
            filtro.aplicarFiltros(nombreImagen);
        }
    }

