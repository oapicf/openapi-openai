@isTest
private class OASChatCompletionResponseMessageTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatCompletionResponseMessage chatCompletionResponseMessage1 = OASChatCompletionResponseMessage.getExample();
        OASChatCompletionResponseMessage chatCompletionResponseMessage2 = chatCompletionResponseMessage1;
        OASChatCompletionResponseMessage chatCompletionResponseMessage3 = new OASChatCompletionResponseMessage();
        OASChatCompletionResponseMessage chatCompletionResponseMessage4 = chatCompletionResponseMessage3;

        System.assert(chatCompletionResponseMessage1.equals(chatCompletionResponseMessage2));
        System.assert(chatCompletionResponseMessage2.equals(chatCompletionResponseMessage1));
        System.assert(chatCompletionResponseMessage1.equals(chatCompletionResponseMessage1));
        System.assert(chatCompletionResponseMessage3.equals(chatCompletionResponseMessage4));
        System.assert(chatCompletionResponseMessage4.equals(chatCompletionResponseMessage3));
        System.assert(chatCompletionResponseMessage3.equals(chatCompletionResponseMessage3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatCompletionResponseMessage chatCompletionResponseMessage1 = OASChatCompletionResponseMessage.getExample();
        OASChatCompletionResponseMessage chatCompletionResponseMessage2 = OASChatCompletionResponseMessage.getExample();
        OASChatCompletionResponseMessage chatCompletionResponseMessage3 = new OASChatCompletionResponseMessage();
        OASChatCompletionResponseMessage chatCompletionResponseMessage4 = new OASChatCompletionResponseMessage();

        System.assert(chatCompletionResponseMessage1.equals(chatCompletionResponseMessage2));
        System.assert(chatCompletionResponseMessage2.equals(chatCompletionResponseMessage1));
        System.assert(chatCompletionResponseMessage3.equals(chatCompletionResponseMessage4));
        System.assert(chatCompletionResponseMessage4.equals(chatCompletionResponseMessage3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatCompletionResponseMessage chatCompletionResponseMessage1 = OASChatCompletionResponseMessage.getExample();
        OASChatCompletionResponseMessage chatCompletionResponseMessage2 = new OASChatCompletionResponseMessage();

        System.assertEquals(false, chatCompletionResponseMessage1.equals('foo'));
        System.assertEquals(false, chatCompletionResponseMessage2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatCompletionResponseMessage chatCompletionResponseMessage1 = OASChatCompletionResponseMessage.getExample();
        OASChatCompletionResponseMessage chatCompletionResponseMessage2 = new OASChatCompletionResponseMessage();
        OASChatCompletionResponseMessage chatCompletionResponseMessage3;

        System.assertEquals(false, chatCompletionResponseMessage1.equals(chatCompletionResponseMessage3));
        System.assertEquals(false, chatCompletionResponseMessage2.equals(chatCompletionResponseMessage3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatCompletionResponseMessage chatCompletionResponseMessage1 = OASChatCompletionResponseMessage.getExample();
        OASChatCompletionResponseMessage chatCompletionResponseMessage2 = new OASChatCompletionResponseMessage();

        System.assertEquals(chatCompletionResponseMessage1.hashCode(), chatCompletionResponseMessage1.hashCode());
        System.assertEquals(chatCompletionResponseMessage2.hashCode(), chatCompletionResponseMessage2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatCompletionResponseMessage chatCompletionResponseMessage1 = OASChatCompletionResponseMessage.getExample();
        OASChatCompletionResponseMessage chatCompletionResponseMessage2 = OASChatCompletionResponseMessage.getExample();
        OASChatCompletionResponseMessage chatCompletionResponseMessage3 = new OASChatCompletionResponseMessage();
        OASChatCompletionResponseMessage chatCompletionResponseMessage4 = new OASChatCompletionResponseMessage();

        System.assert(chatCompletionResponseMessage1.equals(chatCompletionResponseMessage2));
        System.assert(chatCompletionResponseMessage3.equals(chatCompletionResponseMessage4));
        System.assertEquals(chatCompletionResponseMessage1.hashCode(), chatCompletionResponseMessage2.hashCode());
        System.assertEquals(chatCompletionResponseMessage3.hashCode(), chatCompletionResponseMessage4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASChatCompletionResponseMessage chatCompletionResponseMessage = new OASChatCompletionResponseMessage();
        Map<String, String> x-property-mappings = chatCompletionResponseMessage.getx-property-mappings();
        System.assertEquals('toolCalls', x-property-mappings.get('tool_calls'));
        System.assertEquals('functionCall', x-property-mappings.get('function_call'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASChatCompletionResponseMessage chatCompletionResponseMessage = new OASChatCompletionResponseMessage();
        System.assertEquals(new List<OASChatCompletionMessageToolCall>(), chatCompletionResponseMessage.toolCalls);
        System.assertEquals(null, chatCompletionResponseMessage.content);
        System.assertEquals(null, chatCompletionResponseMessage.role);
        System.assertEquals(null, chatCompletionResponseMessage.functionCall);
    }
}
