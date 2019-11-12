import com.sun.org.apache.xpath.internal.objects.XString;

public class XMLMessage implements IMessage {
    private String name = "XML";
    private String body;

    XMLMessage() {
        prepareMessage();
    }

    XMLMessage(String body) {
        prepareMessage(body);
    }

    XMLMessage(String header, String body) {
        prepareMessage(header, body);
    }

    @Override
    public void prepareMessage() {
        this.body = " ";
        printMessage();
    }

    @Override
    public void prepareMessage(String body) {
        this.body = body;
        printMessage();
    }

    @Override
    public void prepareMessage(String header, String body) {
        this.body = header + "\n" + "\t\t" + body;
        printMessage();
    }

    public void printMessage() {
        System.out.println(" [" + this.name + "]" + "  : " + this.body);
    }

    @Override
    public String getBody() {
        return body;
    }
}




