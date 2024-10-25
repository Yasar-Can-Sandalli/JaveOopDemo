package core.logging;

public class MailLogger implements BaseLogger{

    @Override
    public void log(String data) {
        System.out.println("Logged to Mail: " + data);
    }
}