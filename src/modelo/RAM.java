package modelo;

import java.io.Serializable;

public class RAM extends Componente implements Serializable {
        private enum tipo_memoria{DDR1,DDR2,DDR3,DDR4,DDR5}
        private int cant_memoria;
        private int frecuencia_GHz;

        public RAM(double precio, String nombre, String id, double peso, double altura, double anchura, String marca, String modelo,int cant_memoria,int frecuencia_GHz) {
                super(precio, nombre, id, peso, altura, anchura, marca, modelo);
                setCant_memoria(cant_memoria);
                setFrecuencia_GHz(frecuencia_GHz);
        }
        public int getCant_memoria() {
                return cant_memoria;
        }

        public void setCant_memoria(int cant_memoria) {
                this.cant_memoria = cant_memoria;
        }

        public int getFrecuencia_GHz() {
                return frecuencia_GHz;
        }

        public void setFrecuencia_GHz(int frecuencia_GHz) {
                this.frecuencia_GHz = frecuencia_GHz;
        }
}
