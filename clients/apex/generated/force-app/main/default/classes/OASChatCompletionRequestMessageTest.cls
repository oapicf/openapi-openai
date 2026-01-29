@isTest
private class OASChatCompletionRequestMessageTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatCompletionRequestMessage chatCompletionRequestMessage1 = OASChatCompletionRequestMessage.getExample();
        OASChatCompletionRequestMessage chatCompletionRequestMessage2 = chatCompletionRequestMessage1;
        OASChatCompletionRequestMessage chatCompletionRequestMessage3 = new OASChatCompletionRequestMessage();
        OASChatCompletionRequestMessage chatCompletionRequestMessage4 = chatCompletionRequestMessage3;

        System.assert(chatCompletionRequestMessage1.equals(chatCompletionRequestMessage2));
        System.assert(chatCompletionRequestMessage2.equals(chatCompletionRequestMessage1));
        System.assert(chatCompletionRequestMessage1.equals(chatCompletionRequestMessage1));
        System.assert(chatCompletionRequestMessage3.equals(chatCompletionRequestMessage4));
        System.assert(chatCompletionRequestMessage4.equals(chatCompletionRequestMessage3));
        System.assert(chatCompletionRequestMessage3.equals(chatCompletionRequestMessage3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatCompletionRequestMessage chatCompletionRequestMessage1 = OASChatCompletionRequestMessage.getExample();
        OASChatCompletionRequestMessage chatCompletionRequestMessage2 = OASChatCompletionRequestMessage.getExample();
        OASChatCompletionRequestMessage chatCompletionRequestMessage3 = new OASChatCompletionRequestMessage();
        OASChatCompletionRequestMessage chatCompletionRequestMessage4 = new OASChatCompletionRequestMessage();

        System.assert(chatCompletionRequestMessage1.equals(chatCompletionRequestMessage2));
        System.assert(chatCompletionRequestMessage2.equals(chatCompletionRequestMessage1));
        System.assert(chatCompletionRequestMessage3.equals(chatCompletionRequestMessage4));
        System.assert(chatCompletionRequestMessage4.equals(chatCompletionRequestMessage3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatCompletionRequestMessage chatCompletionRequestMessage1 = OASChatCompletionRequestMessage.getExample();
        OASChatCompletionRequestMessage chatCompletionRequestMessage2 = new OASChatCompletionRequestMessage();

        System.assertEquals(false, chatCompletionRequestMessage1.equals('foo'));
        System.assertEquals(false, chatCompletionRequestMessage2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatCompletionRequestMessage chatCompletionRequestMessage1 = OASChatCompletionRequestMessage.getExample();
        OASChatCompletionRequestMessage chatCompletionRequestMessage2 = new OASChatCompletionRequestMessage();
        OASChatCompletionRequestMessage chatCompletionRequestMessage3;

        System.assertEquals(false, chatCompletionRequestMessage1.equals(chatCompletionRequestMessage3));
        System.assertEquals(false, chatCompletionRequestMessage2.equals(chatCompletionRequestMessage3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatCompletionRequestMessage chatCompletionRequestMessage1 = OASChatCompletionRequestMessage.getExample();
        OASChatCompletionRequestMessage chatCompletionRequestMessage2 = new OASChatCompletionRequestMessage();

        System.assertEquals(chatCompletionRequestMessage1.hashCode(), chatCompletionRequestMessage1.hashCode());
        System.assertEquals(chatCompletionRequestMessage2.hashCode(), chatCompletionRequestMessage2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatCompletionRequestMessage chatCompletionRequestMessage1 = OASChatCompletionRequestMessage.getExample();
        OASChatCompletionRequestMessage chatCompletionRequestMessage2 = OASChatCompletionRequestMessage.getExample();
        OASChatCompletionRequestMessage chatCompletionRequestMessage3 = new OASChatCompletionRequestMessage();
        OASChatCompletionRequestMessage chatCompletionRequestMessage4 = new OASChatCompletionRequestMessage();

        System.assert(chatCompletionRequestMessage1.equals(chatCompletionRequestMessage2));
        System.assert(chatCompletionRequestMessage3.equals(chatCompletionRequestMessage4));
        System.assertEquals(chatCompletionRequestMessage1.hashCode(), chatCompletionRequestMessage2.hashCode());
        System.assertEquals(chatCompletionRequestMessage3.hashCode(), chatCompletionRequestMessage4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASChatCompletionRequestMessage chatCompletionRequestMessage = new OASChatCompletionRequestMessage();
        Map<String, String> x-property-mappings = chatCompletionRequestMessage.getx-property-mappings();
        System.assertEquals('toolCalls', x-property-mappings.get('tool_calls'));
        System.assertEquals('functionCall', x-property-mappings.get('function_call'));
        System.assertEquals('toolCallId', x-property-mappings.get('tool_call_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASChatCompletionRequestMessage chatCompletionRequestMessage = new OASChatCompletionRequestMessage();
        System.assertEquals(new List<OASChatCompletionMessageToolCall>(), chatCompletionRequestMessage.toolCalls);
        System.assertEquals(null, chatCompletionRequestMessage.content);
        System.assertEquals(null, chatCompletionRequestMessage.role);
        System.assertEquals(null, chatCompletionRequestMessage.name);
        System.assertEquals(null, chatCompletionRequestMessage.functionCall);
        System.assertEquals(null, chatCompletionRequestMessage.toolCallId);
    }
}
