public class productoTest {

        public static void main(String[] args) {

            Producto[] productos = {
                    new Producto("jose",new double[]{8},"Informacion1"),
                    new Producto("juan",new double[]{8},"Informacion2"),
                    new Producto("gian", new double[]{4},"Informacion3")
            };

            for (Producto producto : productos) {
                System.out.println("nombre: " + producto.getNombre());
                System.out.println("informacion del producto: " + producto.getInformacion());
                System.out.println("--------------------");

            }



        }
    }
