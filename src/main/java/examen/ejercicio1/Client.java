package examen.ejercicio1;

public class Client {

    public static void main(String[] args) {

        VersionadorArchivo versionadorArchivo = new VersionadorArchivo();
        AlmacenamientoArchivo almacenamientoArchivo = new AlmacenamientoArchivo();

        Archivo archivo;

        archivo = new Archivo("4h4b8K","este documento es una prueba \n","este documento es una prueba");
        versionadorArchivo.setArchivo(archivo);
        almacenamientoArchivo.addBackupArchivo("version1", versionadorArchivo.createBackupArchivo());

        archivo = new Archivo(archivo.getId(), archivo.getContenidoDocumento() + "el exito solo depende de tu esfuerzo \n","el exito solo depende de tu esfuerzo");
        versionadorArchivo.setArchivo(archivo);
        almacenamientoArchivo.addBackupArchivo("version2", versionadorArchivo.createBackupArchivo());

        archivo = new Archivo(archivo.getId(), archivo.getContenidoDocumento() + "prologo \n","prologo");
        versionadorArchivo.setArchivo(archivo);

        archivo = new Archivo(archivo.getId(), archivo.getContenidoDocumento() + "este documento fue actualizado satisfactoriamente \n","este documento fue actualizado satisfactoriamente");
        versionadorArchivo.setArchivo(archivo);
        almacenamientoArchivo.addBackupArchivo("version3", versionadorArchivo.createBackupArchivo());

        archivo.showInfo();

        System.out.println("RESTAURANDO");

        archivo = versionadorArchivo.restoreArchivo(almacenamientoArchivo.getBackupArchivo("version1"));

        archivo.showInfo();
    }

}
