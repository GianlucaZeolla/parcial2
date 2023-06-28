public class Producto {
        private String nombre;
        private double[] precio;
        private String metodo;

        public Producto(String nombre, double[] precio, String metodo) {
            this.nombre = nombre;
            this.precio = precio;
            this.metodo = metodo;
        }
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public double[] getPrecio() {
            return precio;
        }

        public void setPrecio(double[] precio) {
            this.precio = precio;
        }
        public String getMetodo() {
            return metodo;
        }

        public void setMetodo(String metodo) {
            this.metodo = metodo;
        }
        public String getInformacion() {
            return metodo;
        }


    }
