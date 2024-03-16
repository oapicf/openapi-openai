@isTest
private class OASChatCompletionStreamResponseDeltaTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDelta1 = OASChatCompletionStreamResponseDelta.getExample();
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDelta2 = chatCompletionStreamResponseDelta1;
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDelta3 = new OASChatCompletionStreamResponseDelta();
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDelta4 = chatCompletionStreamResponseDelta3;

        System.assert(chatCompletionStreamResponseDelta1.equals(chatCompletionStreamResponseDelta2));
        System.assert(chatCompletionStreamResponseDelta2.equals(chatCompletionStreamResponseDelta1));
        System.assert(chatCompletionStreamResponseDelta1.equals(chatCompletionStreamResponseDelta1));
        System.assert(chatCompletionStreamResponseDelta3.equals(chatCompletionStreamResponseDelta4));
        System.assert(chatCompletionStreamResponseDelta4.equals(chatCompletionStreamResponseDelta3));
        System.assert(chatCompletionStreamResponseDelta3.equals(chatCompletionStreamResponseDelta3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDelta1 = OASChatCompletionStreamResponseDelta.getExample();
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDelta2 = OASChatCompletionStreamResponseDelta.getExample();
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDelta3 = new OASChatCompletionStreamResponseDelta();
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDelta4 = new OASChatCompletionStreamResponseDelta();

        System.assert(chatCompletionStreamResponseDelta1.equals(chatCompletionStreamResponseDelta2));
        System.assert(chatCompletionStreamResponseDelta2.equals(chatCompletionStreamResponseDelta1));
        System.assert(chatCompletionStreamResponseDelta3.equals(chatCompletionStreamResponseDelta4));
        System.assert(chatCompletionStreamResponseDelta4.equals(chatCompletionStreamResponseDelta3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDelta1 = OASChatCompletionStreamResponseDelta.getExample();
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDelta2 = new OASChatCompletionStreamResponseDelta();

        System.assertEquals(false, chatCompletionStreamResponseDelta1.equals('foo'));
        System.assertEquals(false, chatCompletionStreamResponseDelta2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDelta1 = OASChatCompletionStreamResponseDelta.getExample();
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDelta2 = new OASChatCompletionStreamResponseDelta();
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDelta3;

        System.assertEquals(false, chatCompletionStreamResponseDelta1.equals(chatCompletionStreamResponseDelta3));
        System.assertEquals(false, chatCompletionStreamResponseDelta2.equals(chatCompletionStreamResponseDelta3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDelta1 = OASChatCompletionStreamResponseDelta.getExample();
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDelta2 = new OASChatCompletionStreamResponseDelta();

        System.assertEquals(chatCompletionStreamResponseDelta1.hashCode(), chatCompletionStreamResponseDelta1.hashCode());
        System.assertEquals(chatCompletionStreamResponseDelta2.hashCode(), chatCompletionStreamResponseDelta2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDelta1 = OASChatCompletionStreamResponseDelta.getExample();
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDelta2 = OASChatCompletionStreamResponseDelta.getExample();
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDelta3 = new OASChatCompletionStreamResponseDelta();
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDelta4 = new OASChatCompletionStreamResponseDelta();

        System.assert(chatCompletionStreamResponseDelta1.equals(chatCompletionStreamResponseDelta2));
        System.assert(chatCompletionStreamResponseDelta3.equals(chatCompletionStreamResponseDelta4));
        System.assertEquals(chatCompletionStreamResponseDelta1.hashCode(), chatCompletionStreamResponseDelta2.hashCode());
        System.assertEquals(chatCompletionStreamResponseDelta3.hashCode(), chatCompletionStreamResponseDelta4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDelta = new OASChatCompletionStreamResponseDelta();
        Map<String, String> x-property-mappings = chatCompletionStreamResponseDelta.getx-property-mappings();
        System.assertEquals('functionCall', x-property-mappings.get('function_call'));
    }
}
