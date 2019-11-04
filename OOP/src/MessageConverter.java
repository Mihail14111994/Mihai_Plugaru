public class MessageConverter {
    public static XMLMessage toXML(IMessage message){
        return  new XMLMessage(message.getBody());
    }
}
