package examen.ejercicio4;

import java.util.Comparator;
import java.util.List;

public class SortingCarrera implements ISorting {
    @Override
    public void sort(List<Estudiante> estudianteList) {

        estudianteList.sort(Comparator.comparing(Estudiante::getCarrera));

        for(Estudiante estudiante : estudianteList) {

            estudiante.showInfo();

        }

    }
}
