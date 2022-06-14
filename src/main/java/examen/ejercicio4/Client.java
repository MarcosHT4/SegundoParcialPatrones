package examen.ejercicio4;

public class Client {

    public static void main(String[] args) {

        BaseDeDatos baseDeDatos = new BaseDeDatos(new SortingNombre());

        Estudiante estudiante1 = new Estudiante("2658471456", "Dalas", "1968/12/14", "Ing. Sistemas");
        Estudiante estudiante2 = new Estudiante("4523698741", "Javi", "1985/04/11", "Ing. Comercial");
        Estudiante estudiante3 = new Estudiante("9658412365", "Lada", "1996/03/22", "Zapatera");
        Estudiante estudiante4 = new Estudiante("6985214785", "Nauter", "2001/05/21", "Admin. Empresas");
        Estudiante estudiante5 = new Estudiante("1254785698", "Shur", "1981/06/07", "Actuacion");

        baseDeDatos.addEstudiantes(estudiante1);
        baseDeDatos.addEstudiantes(estudiante2);
        baseDeDatos.addEstudiantes(estudiante3);
        baseDeDatos.addEstudiantes(estudiante4);
        baseDeDatos.addEstudiantes(estudiante5);

        System.out.println("******POR NOMBRE******");

        baseDeDatos.sortListaEstudiantes();
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");
        baseDeDatos.setSorting(new SortingCI());
        System.out.println("******POR CI******");
        baseDeDatos.sortListaEstudiantes();
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");
        System.out.println("******POR CARRERA******");
        baseDeDatos.setSorting(new SortingCarrera());
        baseDeDatos.sortListaEstudiantes();

    }


}
