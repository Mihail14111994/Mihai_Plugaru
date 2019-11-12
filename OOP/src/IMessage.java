public interface IMessage {

    public void prepareMessage();

    public void prepareMessage(String body);

    public void prepareMessage(String header, String body);

    public void printMessage();

    public default String getBody() {
        return null;
    }
}
