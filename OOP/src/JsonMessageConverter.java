class JsonMessageConverter implements IMessageConverter {

    @Override
    public IMessage convertMessage(IMessage message) {
        return new JSonMessage(message.getBody());
    }
}

