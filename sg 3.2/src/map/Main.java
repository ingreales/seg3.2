package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Empleados> empleados = Arrays.asList(new Empleados(123,"juan",20,2000,"ing"),new Empleados(234,"mario",21,1000,"medico"));
        List<Double> incremento =  empleados.stream()
                .map(Empleados -> Empleados.getSalario() + (Empleados.getSalario()*0.2))
                .collect(Collectors.toList());

        System.out.println(incremento);


    }
}
