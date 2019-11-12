class JsonMessageConverter implements IMessageConverter {

    @Override
    public IMessage convertMessage(IMessage message) {
        return new JsonMessage(message.getBody());
    }
}

