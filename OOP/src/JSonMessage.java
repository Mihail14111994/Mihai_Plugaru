public class JSonMessage implements IMessage {
    private String name;
    private String body;

    public JSonMessage(String body){
        name = "JSON";
        this.body=body;
    }

    @Override
    public void prepareMessage() {

    }

    @Override
    public void prepareMessage(String s) {

    }

    @Override
    public void prepareMessage(String s, String t) {

    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getBody() {
        return body;
    }
}
