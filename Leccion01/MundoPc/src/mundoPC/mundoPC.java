package mundoPC;

import ar.com.system2023.mundopc.*;

public class mundoPC {
    public static void main(String[] args){
        Monitor monitorHP = new Monitor("HP", 13); //Importar la clase
        Teclado tecladoHP = new Teclado("Bletooth", "HP");
        Raton ratonHP = new Raton ("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora Hp", monitorHP, tecladoHP, ratonHP);
        //Creamos otros objetos de diferente marca
        Monitor monitorGamer = new Monitor("Gamer", 32);
        Teclado tecladoGamer = new Teclado("Bletooth", "Gamer");
        Raton ratonGamer = new Raton ("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        Orden orden1 = new Orden();//Iniciamos el arreglo vacio
        Orden orden2 = new Orden();//Una nueva lista para el objeto orden2
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        
        Computadora computadoraVarias = new Computadora("Computadora de diferentes marcas", monitorHP,tecladoGamer ,ratonHP);
        orden2.agregarComputadora(computadoraVarias);
        
        orden1.mostrarOrden();
        orden2.mostrarOrden();
        
    }
    
}
