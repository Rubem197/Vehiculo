package principal;

import java.util.Scanner;

enum Marca {BMW, MERCEDES, AVENSIS, TOYOTA, SEAT, NISSAN, AUDI}

public class Vehiculo {

    private Marca MarcaVehiculo;
    private String Matricula;
    public Vehiculo(){
    }
    public Vehiculo(String Matricula, Marca MarcaVehiculo){
        this.Matricula= Matricula;
        this.MarcaVehiculo=MarcaVehiculo;
    }



    public Marca getMarcaVehiculo(){return MarcaVehiculo;}

    public void setMarcaVehiculo(Marca marcaVehiculo){MarcaVehiculo=marcaVehiculo;}

    public Marca getMarcaVehiculoString() {
        return MarcaVehiculo;
    }

    public void setMarcaVehiculoString(Marca marcaVehiculo){ MarcaVehiculo=marcaVehiculo;}

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {Matricula = matricula;}
}
