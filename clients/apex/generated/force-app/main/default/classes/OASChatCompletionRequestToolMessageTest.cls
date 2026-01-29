@isTest
private class OASChatCompletionRequestToolMessageTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatCompletionRequestToolMessage chatCompletionRequestToolMessage1 = OASChatCompletionRequestToolMessage.getExample();
        OASChatCompletionRequestToolMessage chatCompletionRequestToolMessage2 = chatCompletionRequestToolMessage1;
        OASChatCompletionRequestToolMessage chatCompletionRequestToolMessage3 = new OASChatCompletionRequestToolMessage();
        OASChatCompletionRequestToolMessage chatCompletionRequestToolMessage4 = chatCompletionRequestToolMessage3;

        System.assert(chatCompletionRequestToolMessage1.equals(chatCompletionRequestToolMessage2));
        System.assert(chatCompletionRequestToolMessage2.equals(chatCompletionRequestToolMessage1));
        System.assert(chatCompletionRequestToolMessage1.equals(chatCompletionRequestToolMessage1));
        System.assert(chatCompletionRequestToolMessage3.equals(chatCompletionRequestToolMessage4));
        System.assert(chatCompletionRequestToolMessage4.equals(chatCompletionRequestToolMessage3));
        System.assert(chatCompletionRequestToolMessage3.equals(chatCompletionRequestToolMessage3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatCompletionRequestToolMessage chatCompletionRequestToolMessage1 = OASChatCompletionRequestToolMessage.getExample();
        OASChatCompletionRequestToolMessage chatCompletionRequestToolMessage2 = OASChatCompletionRequestToolMessage.getExample();
        OASChatCompletionRequestToolMessage chatCompletionRequestToolMessage3 = new OASChatCompletionRequestToolMessage();
        OASChatCompletionRequestToolMessage chatCompletionRequestToolMessage4 = new OASChatCompletionRequestToolMessage();

        System.assert(chatCompletionRequestToolMessage1.equals(chatCompletionRequestToolMessage2));
        System.assert(chatCompletionRequestToolMessage2.equals(chatCompletionRequestToolMessage1));
        System.assert(chatCompletionRequestToolMessage3.equals(chatCompletionRequestToolMessage4));
        System.assert(chatCompletionRequestToolMessage4.equals(chatCompletionRequestToolMessage3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatCompletionRequestToolMessage chatCompletionRequestToolMessage1 = OASChatCompletionRequestToolMessage.getExample();
        OASChatCompletionRequestToolMessage chatCompletionRequestToolMessage2 = new OASChatCompletionRequestToolMessage();

        System.assertEquals(false, chatCompletionRequestToolMessage1.equals('foo'));
        System.assertEquals(false, chatCompletionRequestToolMessage2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatCompletionRequestToolMessage chatCompletionRequestToolMessage1 = OASChatCompletionRequestToolMessage.getExample();
        OASChatCompletionRequestToolMessage chatCompletionRequestToolMessage2 = new OASChatCompletionRequestToolMessage();
        OASChatCompletionRequestToolMessage chatCompletionRequestToolMessage3;

        System.assertEquals(false, chatCompletionRequestToolMessage1.equals(chatCompletionRequestToolMessage3));
        System.assertEquals(false, chatCompletionRequestToolMessage2.equals(chatCompletionRequestToolMessage3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatCompletionRequestToolMessage chatCompletionRequestToolMessage1 = OASChatCompletionRequestToolMessage.getExample();
        OASChatCompletionRequestToolMessage chatCompletionRequestToolMessage2 = new OASChatCompletionRequestToolMessage();

        System.assertEquals(chatCompletionRequestToolMessage1.hashCode(), chatCompletionRequestToolMessage1.hashCode());
        System.assertEquals(chatCompletionRequestToolMessage2.hashCode(), chatCompletionRequestToolMessage2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatCompletionRequestToolMessage chatCompletionRequestToolMessage1 = OASChatCompletionRequestToolMessage.getExample();
        OASChatCompletionRequestToolMessage chatCompletionRequestToolMessage2 = OASChatCompletionRequestToolMessage.getExample();
        OASChatCompletionRequestToolMessage chatCompletionRequestToolMessage3 = new OASChatCompletionRequestToolMessage();
        OASChatCompletionRequestToolMessage chatCompletionRequestToolMessage4 = new OASChatCompletionRequestToolMessage();

        System.assert(chatCompletionRequestToolMessage1.equals(chatCompletionRequestToolMessage2));
        System.assert(chatCompletionRequestToolMessage3.equals(chatCompletionRequestToolMessage4));
        System.assertEquals(chatCompletionRequestToolMessage1.hashCode(), chatCompletionRequestToolMessage2.hashCode());
        System.assertEquals(chatCompletionRequestToolMessage3.hashCode(), chatCompletionRequestToolMessage4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASChatCompletionRequestToolMessage chatCompletionRequestToolMessage = new OASChatCompletionRequestToolMessage();
        Map<String, String> x-property-mappings = chatCompletionRequestToolMessage.getx-property-mappings();
        System.assertEquals('toolCallId', x-property-mappings.get('tool_call_id'));
    }
}
