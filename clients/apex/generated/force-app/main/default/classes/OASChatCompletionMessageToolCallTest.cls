@isTest
private class OASChatCompletionMessageToolCallTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatCompletionMessageToolCall chatCompletionMessageToolCall1 = OASChatCompletionMessageToolCall.getExample();
        OASChatCompletionMessageToolCall chatCompletionMessageToolCall2 = chatCompletionMessageToolCall1;
        OASChatCompletionMessageToolCall chatCompletionMessageToolCall3 = new OASChatCompletionMessageToolCall();
        OASChatCompletionMessageToolCall chatCompletionMessageToolCall4 = chatCompletionMessageToolCall3;

        System.assert(chatCompletionMessageToolCall1.equals(chatCompletionMessageToolCall2));
        System.assert(chatCompletionMessageToolCall2.equals(chatCompletionMessageToolCall1));
        System.assert(chatCompletionMessageToolCall1.equals(chatCompletionMessageToolCall1));
        System.assert(chatCompletionMessageToolCall3.equals(chatCompletionMessageToolCall4));
        System.assert(chatCompletionMessageToolCall4.equals(chatCompletionMessageToolCall3));
        System.assert(chatCompletionMessageToolCall3.equals(chatCompletionMessageToolCall3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatCompletionMessageToolCall chatCompletionMessageToolCall1 = OASChatCompletionMessageToolCall.getExample();
        OASChatCompletionMessageToolCall chatCompletionMessageToolCall2 = OASChatCompletionMessageToolCall.getExample();
        OASChatCompletionMessageToolCall chatCompletionMessageToolCall3 = new OASChatCompletionMessageToolCall();
        OASChatCompletionMessageToolCall chatCompletionMessageToolCall4 = new OASChatCompletionMessageToolCall();

        System.assert(chatCompletionMessageToolCall1.equals(chatCompletionMessageToolCall2));
        System.assert(chatCompletionMessageToolCall2.equals(chatCompletionMessageToolCall1));
        System.assert(chatCompletionMessageToolCall3.equals(chatCompletionMessageToolCall4));
        System.assert(chatCompletionMessageToolCall4.equals(chatCompletionMessageToolCall3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatCompletionMessageToolCall chatCompletionMessageToolCall1 = OASChatCompletionMessageToolCall.getExample();
        OASChatCompletionMessageToolCall chatCompletionMessageToolCall2 = new OASChatCompletionMessageToolCall();

        System.assertEquals(false, chatCompletionMessageToolCall1.equals('foo'));
        System.assertEquals(false, chatCompletionMessageToolCall2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatCompletionMessageToolCall chatCompletionMessageToolCall1 = OASChatCompletionMessageToolCall.getExample();
        OASChatCompletionMessageToolCall chatCompletionMessageToolCall2 = new OASChatCompletionMessageToolCall();
        OASChatCompletionMessageToolCall chatCompletionMessageToolCall3;

        System.assertEquals(false, chatCompletionMessageToolCall1.equals(chatCompletionMessageToolCall3));
        System.assertEquals(false, chatCompletionMessageToolCall2.equals(chatCompletionMessageToolCall3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatCompletionMessageToolCall chatCompletionMessageToolCall1 = OASChatCompletionMessageToolCall.getExample();
        OASChatCompletionMessageToolCall chatCompletionMessageToolCall2 = new OASChatCompletionMessageToolCall();

        System.assertEquals(chatCompletionMessageToolCall1.hashCode(), chatCompletionMessageToolCall1.hashCode());
        System.assertEquals(chatCompletionMessageToolCall2.hashCode(), chatCompletionMessageToolCall2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatCompletionMessageToolCall chatCompletionMessageToolCall1 = OASChatCompletionMessageToolCall.getExample();
        OASChatCompletionMessageToolCall chatCompletionMessageToolCall2 = OASChatCompletionMessageToolCall.getExample();
        OASChatCompletionMessageToolCall chatCompletionMessageToolCall3 = new OASChatCompletionMessageToolCall();
        OASChatCompletionMessageToolCall chatCompletionMessageToolCall4 = new OASChatCompletionMessageToolCall();

        System.assert(chatCompletionMessageToolCall1.equals(chatCompletionMessageToolCall2));
        System.assert(chatCompletionMessageToolCall3.equals(chatCompletionMessageToolCall4));
        System.assertEquals(chatCompletionMessageToolCall1.hashCode(), chatCompletionMessageToolCall2.hashCode());
        System.assertEquals(chatCompletionMessageToolCall3.hashCode(), chatCompletionMessageToolCall4.hashCode());
    }
}
