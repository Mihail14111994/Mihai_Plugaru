class XMLMessageConverter implements IMessageConverter {

    @Override
    public IMessage convertMessage(IMessage message) {
        return new XMLMessage(message.getBody());
    }
}

