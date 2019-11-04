public class MessageProcessor{
    public static void main(String[] args) {
        JSonMessage a = new JSonMessage("ceva");

        System.out.println();
        XMLMessage b = MessageConverter.toXML(a);
        System.out.println(b);
    }
}
