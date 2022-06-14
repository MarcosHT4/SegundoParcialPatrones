package examen.ejercicio1;

public class VersionadorArchivo {

    private Archivo archivo;

    public void setArchivo(Archivo archivo) {

        if(archivo.getNuevoContenido().split("\\s+").length >=5) {

            this.archivo = archivo;
            System.out.println("Backup actualizado con exito!");

        } else {

            System.out.println("ERROR! El archivo no contiene mas de 5 palabras");

        }


    }

    public BackupArchivo createBackupArchivo() {

        return new BackupArchivo(archivo);

    }

    public Archivo restoreArchivo(BackupArchivo backupArchivo) {

        this.archivo = backupArchivo.getArchivo();
        return this.archivo;

    }

}
