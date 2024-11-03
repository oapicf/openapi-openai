@isTest
private class OASChatCompletionRequestUserMessageTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatCompletionRequestUserMessage chatCompletionRequestUserMessage1 = OASChatCompletionRequestUserMessage.getExample();
        OASChatCompletionRequestUserMessage chatCompletionRequestUserMessage2 = chatCompletionRequestUserMessage1;
        OASChatCompletionRequestUserMessage chatCompletionRequestUserMessage3 = new OASChatCompletionRequestUserMessage();
        OASChatCompletionRequestUserMessage chatCompletionRequestUserMessage4 = chatCompletionRequestUserMessage3;

        System.assert(chatCompletionRequestUserMessage1.equals(chatCompletionRequestUserMessage2));
        System.assert(chatCompletionRequestUserMessage2.equals(chatCompletionRequestUserMessage1));
        System.assert(chatCompletionRequestUserMessage1.equals(chatCompletionRequestUserMessage1));
        System.assert(chatCompletionRequestUserMessage3.equals(chatCompletionRequestUserMessage4));
        System.assert(chatCompletionRequestUserMessage4.equals(chatCompletionRequestUserMessage3));
        System.assert(chatCompletionRequestUserMessage3.equals(chatCompletionRequestUserMessage3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatCompletionRequestUserMessage chatCompletionRequestUserMessage1 = OASChatCompletionRequestUserMessage.getExample();
        OASChatCompletionRequestUserMessage chatCompletionRequestUserMessage2 = OASChatCompletionRequestUserMessage.getExample();
        OASChatCompletionRequestUserMessage chatCompletionRequestUserMessage3 = new OASChatCompletionRequestUserMessage();
        OASChatCompletionRequestUserMessage chatCompletionRequestUserMessage4 = new OASChatCompletionRequestUserMessage();

        System.assert(chatCompletionRequestUserMessage1.equals(chatCompletionRequestUserMessage2));
        System.assert(chatCompletionRequestUserMessage2.equals(chatCompletionRequestUserMessage1));
        System.assert(chatCompletionRequestUserMessage3.equals(chatCompletionRequestUserMessage4));
        System.assert(chatCompletionRequestUserMessage4.equals(chatCompletionRequestUserMessage3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatCompletionRequestUserMessage chatCompletionRequestUserMessage1 = OASChatCompletionRequestUserMessage.getExample();
        OASChatCompletionRequestUserMessage chatCompletionRequestUserMessage2 = new OASChatCompletionRequestUserMessage();

        System.assertEquals(false, chatCompletionRequestUserMessage1.equals('foo'));
        System.assertEquals(false, chatCompletionRequestUserMessage2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatCompletionRequestUserMessage chatCompletionRequestUserMessage1 = OASChatCompletionRequestUserMessage.getExample();
        OASChatCompletionRequestUserMessage chatCompletionRequestUserMessage2 = new OASChatCompletionRequestUserMessage();
        OASChatCompletionRequestUserMessage chatCompletionRequestUserMessage3;

        System.assertEquals(false, chatCompletionRequestUserMessage1.equals(chatCompletionRequestUserMessage3));
        System.assertEquals(false, chatCompletionRequestUserMessage2.equals(chatCompletionRequestUserMessage3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatCompletionRequestUserMessage chatCompletionRequestUserMessage1 = OASChatCompletionRequestUserMessage.getExample();
        OASChatCompletionRequestUserMessage chatCompletionRequestUserMessage2 = new OASChatCompletionRequestUserMessage();

        System.assertEquals(chatCompletionRequestUserMessage1.hashCode(), chatCompletionRequestUserMessage1.hashCode());
        System.assertEquals(chatCompletionRequestUserMessage2.hashCode(), chatCompletionRequestUserMessage2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatCompletionRequestUserMessage chatCompletionRequestUserMessage1 = OASChatCompletionRequestUserMessage.getExample();
        OASChatCompletionRequestUserMessage chatCompletionRequestUserMessage2 = OASChatCompletionRequestUserMessage.getExample();
        OASChatCompletionRequestUserMessage chatCompletionRequestUserMessage3 = new OASChatCompletionRequestUserMessage();
        OASChatCompletionRequestUserMessage chatCompletionRequestUserMessage4 = new OASChatCompletionRequestUserMessage();

        System.assert(chatCompletionRequestUserMessage1.equals(chatCompletionRequestUserMessage2));
        System.assert(chatCompletionRequestUserMessage3.equals(chatCompletionRequestUserMessage4));
        System.assertEquals(chatCompletionRequestUserMessage1.hashCode(), chatCompletionRequestUserMessage2.hashCode());
        System.assertEquals(chatCompletionRequestUserMessage3.hashCode(), chatCompletionRequestUserMessage4.hashCode());
    }
}
