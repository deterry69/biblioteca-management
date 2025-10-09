class exercise1java {
    public static void main(String[] args) {
//1) Declaro variables con los datos de varios artículos (libro, película, videojuego y tema).
// Después los muestro por consola usando System.out.println.
        String namelibro = "La historia interminable";
        int yearlibro = 1979;
        double preciolibro = 1.50;
        System.out.println("Título: " + namelibro + " Año : " + yearlibro + " Precio: " + preciolibro +"€/día");

        String peli = "Ali G anda suelto";
        int yearpeli = 2002;
        int preciopeli = 3;
        System.out.println("Título: " + peli + " | Año : " + yearpeli + " | Precio: " + preciopeli +"€/día");

        String game = "Pokémon Negro";
        int yeargame = 2010;
        int preciogame = 4;
        System.out.println("Título: " + game + " | Año : " + yeargame + " | Precio: " + preciogame +"€/día");

        String tema = "ADROMICFMS 4";
        int yeartema = 2018;
        int preciotema = 2;
        System.out.println("Título: " + tema + " | Año : " + yeartema + " | Precio: " + preciotema +"€/día");
        int uds = 35;
 //2 Calculo el dinero total que se ganaría si se alquilan todas las unidades disponibles.
 // Multiplico el precio total de los artículos por la cantidad de unidades (uds).
        double dinero = (preciogame + preciolibro + preciotema + preciopeli) * uds;
        System.out.println("Contando que hay " + uds + " unidades. El dinero ganado alquilando todas las unidades al día, sería de " + dinero + "€/día");
 //3 Aplico un descuento del 15% al total de los precios sumados.
 // Muestro el precio con descuento y el precio normal sin descuento.
 double porciento = 0.15;
        double descuento = (preciogame + preciolibro + preciotema + preciopeli) * porciento;
        double sindescuento = preciogame + preciolibro + preciotema + preciopeli;
        System.out.println("Hay un 15% de descuento en toda la tienda, y te quieres llevar un artículo de cada, saldría a " + descuento + "€/día. Sin descuento serían " + sindescuento + "€/día");
//4 Calculo el precio medio de los artículos de la tienda.
// Sumo todos los precios y los divido entre 4 (número de artículos).
        double preciomedio = (preciogame + preciolibro + preciotema + preciopeli) / 4;
        System.out.println("La media de los precios de la tienda es de " + preciomedio + "€/día");
//5 Calculo el porcentaje de ventas de cada tipo de artículo respecto al total vendido.
// Primero obtengo el total posible (4 artículos * 35 unidades) y el total vendido.
int total = 4*uds;
int ventaslibro = 22;
int ventaspeli = 27;
int ventasgame = 33;
int ventastema = 29;
    int ventas = ventasgame + ventaslibro + ventastema + ventaspeli;
        System.out.println("Total de compras " + ventas + " de " + total);
// Calculo el porcentaje de cada artículo de las ventas totales.
        double porcenlibro =(double) (ventaslibro * 100) / ventas;
        double porcenpeli =(double) (ventaspeli * 100) / ventas;
        double porcengame =(double) (ventasgame * 100) / ventas;
        double porcentema =(double) (ventastema * 100) / ventas;
// Finalmente, muestro los porcentajes de venta por consola.
        System.out.println("% Total de ventas:");
        System.out.println("Los libros se vendieron un " + porcenlibro + " %");
        System.out.println("Las películas se vendieron un " + porcenpeli + " %");
        System.out.println("Los juegos se vendieron un " + porcengame + " %");
        System.out.println("Los temas se vendieron un " + porcentema + " %");
    }
}