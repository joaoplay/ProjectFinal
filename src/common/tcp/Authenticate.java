package common.tcp;

/**
 * Created with IntelliJ IDEA.
 * User: joaosimoes
 * Date: 10/20/13
 * Time: 4:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class Authenticate {

    public String username;
    public String password;

    public Authenticate(String username, String password) {
        this.username = username;
        this.password = password;
    }
}