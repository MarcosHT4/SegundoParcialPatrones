package examen.ejercicio4;

import java.util.Comparator;
import java.util.List;

public class SortingCI implements ISorting {
    @Override
    public void sort(List<Estudiante> estudianteList) {

        estudianteList.sort(Comparator.comparing(Estudiante::getCi));

        for(Estudiante estudiante : estudianteList) {

            estudiante.showInfo();

        }

    }
}
