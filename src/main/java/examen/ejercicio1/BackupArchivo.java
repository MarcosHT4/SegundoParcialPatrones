package examen.ejercicio1;

public class BackupArchivo {

    private Archivo state;

    public BackupArchivo(Archivo archivo) {

        state = archivo;

    }

    public Archivo getArchivo() {

        return state;

    }


}
