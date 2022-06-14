package examen.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class PaginaWeb implements IPaginaWeb{

    private List<IUser> userList = new ArrayList<>();


    @Override
    public void attach(IUser user) {

        userList.add(user);

    }

    @Override
    public void dettach(IUser user) {

        userList.remove(user);

    }

    public void subirVideo(String msg) {

        notify(msg, new Notificacion("Nuevo video!", TipoNotificacion.VIDEO));

    }

    public void subirImagen(String msg) {

        notify(msg, new Notificacion("Nuevo video!", TipoNotificacion.IMAGEN));

    }


    @Override
    public void notify(String msg, Notificacion notificacion) {

        for(IUser user : userList) {

            if(user.getPreferenciaUsuario().equals(PreferenciaUsuario.TODO)) {

                user.update(msg, notificacion);

            } else if(user.getPreferenciaUsuario().toString().equals(notificacion.getTipoNotificacion().toString())) {

                user.update(msg, notificacion);

            }

        }


    }
}
