@isTest
private class OASChatCompletionStreamResponseDeltaTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDeltaFunctionCall1 = OASChatCompletionStreamResponseDelta.getExample();
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDeltaFunctionCall2 = chatCompletionStreamResponseDeltaFunctionCall1;
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDeltaFunctionCall3 = new OASChatCompletionStreamResponseDelta();
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDeltaFunctionCall4 = chatCompletionStreamResponseDeltaFunctionCall3;

        System.assert(chatCompletionStreamResponseDeltaFunctionCall1.equals(chatCompletionStreamResponseDeltaFunctionCall2));
        System.assert(chatCompletionStreamResponseDeltaFunctionCall2.equals(chatCompletionStreamResponseDeltaFunctionCall1));
        System.assert(chatCompletionStreamResponseDeltaFunctionCall1.equals(chatCompletionStreamResponseDeltaFunctionCall1));
        System.assert(chatCompletionStreamResponseDeltaFunctionCall3.equals(chatCompletionStreamResponseDeltaFunctionCall4));
        System.assert(chatCompletionStreamResponseDeltaFunctionCall4.equals(chatCompletionStreamResponseDeltaFunctionCall3));
        System.assert(chatCompletionStreamResponseDeltaFunctionCall3.equals(chatCompletionStreamResponseDeltaFunctionCall3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDeltaFunctionCall1 = OASChatCompletionStreamResponseDelta.getExample();
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDeltaFunctionCall2 = OASChatCompletionStreamResponseDelta.getExample();
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDeltaFunctionCall3 = new OASChatCompletionStreamResponseDelta();
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDeltaFunctionCall4 = new OASChatCompletionStreamResponseDelta();

        System.assert(chatCompletionStreamResponseDeltaFunctionCall1.equals(chatCompletionStreamResponseDeltaFunctionCall2));
        System.assert(chatCompletionStreamResponseDeltaFunctionCall2.equals(chatCompletionStreamResponseDeltaFunctionCall1));
        System.assert(chatCompletionStreamResponseDeltaFunctionCall3.equals(chatCompletionStreamResponseDeltaFunctionCall4));
        System.assert(chatCompletionStreamResponseDeltaFunctionCall4.equals(chatCompletionStreamResponseDeltaFunctionCall3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDeltaFunctionCall1 = OASChatCompletionStreamResponseDelta.getExample();
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDeltaFunctionCall2 = new OASChatCompletionStreamResponseDelta();

        System.assertEquals(false, chatCompletionStreamResponseDeltaFunctionCall1.equals('foo'));
        System.assertEquals(false, chatCompletionStreamResponseDeltaFunctionCall2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDeltaFunctionCall1 = OASChatCompletionStreamResponseDelta.getExample();
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDeltaFunctionCall2 = new OASChatCompletionStreamResponseDelta();
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDeltaFunctionCall3;

        System.assertEquals(false, chatCompletionStreamResponseDeltaFunctionCall1.equals(chatCompletionStreamResponseDeltaFunctionCall3));
        System.assertEquals(false, chatCompletionStreamResponseDeltaFunctionCall2.equals(chatCompletionStreamResponseDeltaFunctionCall3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDeltaFunctionCall1 = OASChatCompletionStreamResponseDelta.getExample();
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDeltaFunctionCall2 = new OASChatCompletionStreamResponseDelta();

        System.assertEquals(chatCompletionStreamResponseDeltaFunctionCall1.hashCode(), chatCompletionStreamResponseDeltaFunctionCall1.hashCode());
        System.assertEquals(chatCompletionStreamResponseDeltaFunctionCall2.hashCode(), chatCompletionStreamResponseDeltaFunctionCall2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDeltaFunctionCall1 = OASChatCompletionStreamResponseDelta.getExample();
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDeltaFunctionCall2 = OASChatCompletionStreamResponseDelta.getExample();
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDeltaFunctionCall3 = new OASChatCompletionStreamResponseDelta();
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDeltaFunctionCall4 = new OASChatCompletionStreamResponseDelta();

        System.assert(chatCompletionStreamResponseDeltaFunctionCall1.equals(chatCompletionStreamResponseDeltaFunctionCall2));
        System.assert(chatCompletionStreamResponseDeltaFunctionCall3.equals(chatCompletionStreamResponseDeltaFunctionCall4));
        System.assertEquals(chatCompletionStreamResponseDeltaFunctionCall1.hashCode(), chatCompletionStreamResponseDeltaFunctionCall2.hashCode());
        System.assertEquals(chatCompletionStreamResponseDeltaFunctionCall3.hashCode(), chatCompletionStreamResponseDeltaFunctionCall4.hashCode());
    }
}
