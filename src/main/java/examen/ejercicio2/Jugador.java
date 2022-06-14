package examen.ejercicio2;

public abstract class Jugador {

    protected IChatJuegos chatJuegos;

    private String alias;
    private String nombre;
    private String ranking;

    public Jugador(IChatJuegos chatJuegos, String alias, String nombre, String ranking) {
        this.chatJuegos = chatJuegos;
        this.alias = alias;
        this.nombre = nombre;
        this.ranking = ranking;
    }

    public IChatJuegos getChatJuegos() {
        return chatJuegos;
    }

    public void setChatJuegos(IChatJuegos chatJuegos) {
        this.chatJuegos = chatJuegos;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public abstract void send(String msg);
    public abstract void received(String msg);

}
