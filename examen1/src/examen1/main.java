package examen1;
public class main {
     public static void main(String[] args) 
     {
         
        marca nike = new marca("Nike", "Estados Unidos");

        Sneaker airMax = new Sneaker("Air Max", "Running", 150.5, "nike");

        Usuario usuario1 = new Usuario("Juan", "Deportista");

        System.out.println("Sneaker: " + airMax.getNombre());
        System.out.println("Tipo: " + airMax.getTipo());
        System.out.println("Precio: $" + airMax.getPrecio());
        System.out.println("Marca: " + airMax.getMarca());
        System.out.println("Marca: " + airMax.getNombre());
        System.out.println("País de origen de la marca: " + airMax.getMarca());
        System.out.println("País de origen de la marca: " + airMax.getPaisOrigen());
        System.out.println("Propietario: " + usuario1.getNombre());
    }
}
