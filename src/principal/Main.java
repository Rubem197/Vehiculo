package principal;

import java.util.Scanner;

public class Main {
    static Marca modelo;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    Vehiculo coche = new Vehiculo("7217 LJK", Marca.TOYOTA);
        Vehiculo coche2= new Vehiculo();
        try {
            Marca modelo = Marca.valueOf(sc.next());
            coche2.setMarcaVehiculo(modelo);
            System.out.println(coche2.getMarcaVehiculo());
        }catch (IllegalArgumentException e)
        {
            System.out.println("Error esa marca no existe");
        }
    }
}
