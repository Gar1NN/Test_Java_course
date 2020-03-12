import java.net.ConnectException;

public class DataConnector {
    String Path;
    String Login;
    String Password;
    public DataConnector(String path, String login, String password){
        Path = path;
        Login = login;
        Password = password;
    }

    public void OpenConnection() throws ConnectException {
        throw new ConnectException();
    }

    public void Close() throws ConnectException {
        throw new ConnectException();
    }
}
