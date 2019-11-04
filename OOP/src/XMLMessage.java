public class XMLMessage implements IMessage {
    private String name;
    private String body;

    public XMLMessage(String body) {
        name = "XML";
        this.body = body;
    }

    @Override
    public void prepareMessage() {
        System.out.println("[Name] : " + name);
    }

    @Override
    public void prepareMessage(String s) {
        System.out.println("   [Name] : " + name);
        System.out.println("[Message] : " + s);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public void prepareMessage(String s, String t) {
        System.out.println("   [Name] : " + name);
        System.out.println("[Message] : " + s + " " + t);
    }

    @Override
    public String toString() {
        return this.body + this.name;
    }
}
