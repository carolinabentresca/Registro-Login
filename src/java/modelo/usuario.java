package modelo;

public class usuario {

    private String usuario;
    private String email;
    private String password;

    public usuario() {
    }

    public usuario(String usuario, String email, String password) {
        this.usuario = usuario;
        this.email = email;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
