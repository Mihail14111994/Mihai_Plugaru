public class MessageProcessor{
    public static void main(String[] args) {


        JSonMessage firstJson = new  JSonMessage();

        JSonMessage secondJson = new  JSonMessage("Second Json Message");

        JSonMessage thirdJson = new  JSonMessage("Third Json Message header", "Third Json Message body");

        XMLMessage firstXML = new XMLMessage( );

        XMLMessage secondXML = new XMLMessage("Second XML Message");

        XMLMessage thirdXML = new XMLMessage("Third XML Message header", "Third XML Message body");

        XMLMessageConverter toXML = new XMLMessageConverter();
        JsonMessageConverter toJson = new JsonMessageConverter();

        XMLMessage convertedFromJson = (XMLMessage) toXML.convertMessage(secondJson);

        JSonMessage convertedFromXML = (JSonMessage) toJson.convertMessage(thirdXML);

    }
}
