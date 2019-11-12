public class MessageProcessor{
    public static void main(String[] args) {


        JsonMessage firstJson = new JsonMessage();

        JsonMessage secondJson = new JsonMessage("Second Json Message");

        JsonMessage thirdJson = new JsonMessage("Third Json Message header", "Third Json Message body");

        XMLMessage firstXML = new XMLMessage( );

        XMLMessage secondXML = new XMLMessage("Second XML Message");

        XMLMessage thirdXML = new XMLMessage("Third XML Message header", "Third XML Message body");

        XMLMessageConverter toXML = new XMLMessageConverter();
        JsonMessageConverter toJson = new JsonMessageConverter();

        XMLMessage convertedFromJson = (XMLMessage) toXML.convertMessage(secondJson);

        JsonMessage convertedFromXML = (JsonMessage) toJson.convertMessage(thirdXML);

    }
}
