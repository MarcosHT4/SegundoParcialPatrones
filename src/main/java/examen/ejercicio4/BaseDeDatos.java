package examen.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {

   private List<Estudiante> almacenamientoEstudiantes = new ArrayList<>();
   private ISorting sorting = new SortingNombre();

    public List<Estudiante> getAlmacenamientoEstudiantes() {
        return almacenamientoEstudiantes;
    }

    public void setAlmacenamientoEstudiantes(List<Estudiante> almacenamientoEstudiantes) {
        this.almacenamientoEstudiantes = almacenamientoEstudiantes;
    }

    public ISorting getSorting() {
        return sorting;
    }

    public void setSorting(ISorting sorting) {
        this.sorting = sorting;
    }

    public BaseDeDatos(ISorting sorting) {

       this.sorting = sorting;

   }

    public void addEstudiantes(Estudiante estudiante) {

       almacenamientoEstudiantes.add(estudiante);

    }

    public void sortListaEstudiantes() {

       sorting.sort(almacenamientoEstudiantes);

    }



}
