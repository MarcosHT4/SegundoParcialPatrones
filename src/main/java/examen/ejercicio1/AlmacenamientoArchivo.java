package examen.ejercicio1;

import java.util.LinkedHashMap;
import java.util.Map;

public class AlmacenamientoArchivo {

    private Map<String, BackupArchivo> almacenadorArchivos = new LinkedHashMap<>();

    public void addBackupArchivo(String idBackup, BackupArchivo backupArchivo) {

        almacenadorArchivos.put(idBackup, backupArchivo);

    }

    public BackupArchivo getBackupArchivo(String idBackup) {

        return almacenadorArchivos.get(idBackup);

    }


}
