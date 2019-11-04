public interface IMessage {

    public void prepareMessage();

    public void prepareMessage(String s);

    public void prepareMessage(String s, String t);

    public  void setName(String name);

    public  String getBody();
}
