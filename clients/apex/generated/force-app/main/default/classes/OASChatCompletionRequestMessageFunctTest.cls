@isTest
private class OASChatCompletionRequestMessageFunctTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatCompletionRequestMessageFunct chatCompletionRequestMessageFunctionCall1 = OASChatCompletionRequestMessageFunct.getExample();
        OASChatCompletionRequestMessageFunct chatCompletionRequestMessageFunctionCall2 = chatCompletionRequestMessageFunctionCall1;
        OASChatCompletionRequestMessageFunct chatCompletionRequestMessageFunctionCall3 = new OASChatCompletionRequestMessageFunct();
        OASChatCompletionRequestMessageFunct chatCompletionRequestMessageFunctionCall4 = chatCompletionRequestMessageFunctionCall3;

        System.assert(chatCompletionRequestMessageFunctionCall1.equals(chatCompletionRequestMessageFunctionCall2));
        System.assert(chatCompletionRequestMessageFunctionCall2.equals(chatCompletionRequestMessageFunctionCall1));
        System.assert(chatCompletionRequestMessageFunctionCall1.equals(chatCompletionRequestMessageFunctionCall1));
        System.assert(chatCompletionRequestMessageFunctionCall3.equals(chatCompletionRequestMessageFunctionCall4));
        System.assert(chatCompletionRequestMessageFunctionCall4.equals(chatCompletionRequestMessageFunctionCall3));
        System.assert(chatCompletionRequestMessageFunctionCall3.equals(chatCompletionRequestMessageFunctionCall3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatCompletionRequestMessageFunct chatCompletionRequestMessageFunctionCall1 = OASChatCompletionRequestMessageFunct.getExample();
        OASChatCompletionRequestMessageFunct chatCompletionRequestMessageFunctionCall2 = OASChatCompletionRequestMessageFunct.getExample();
        OASChatCompletionRequestMessageFunct chatCompletionRequestMessageFunctionCall3 = new OASChatCompletionRequestMessageFunct();
        OASChatCompletionRequestMessageFunct chatCompletionRequestMessageFunctionCall4 = new OASChatCompletionRequestMessageFunct();

        System.assert(chatCompletionRequestMessageFunctionCall1.equals(chatCompletionRequestMessageFunctionCall2));
        System.assert(chatCompletionRequestMessageFunctionCall2.equals(chatCompletionRequestMessageFunctionCall1));
        System.assert(chatCompletionRequestMessageFunctionCall3.equals(chatCompletionRequestMessageFunctionCall4));
        System.assert(chatCompletionRequestMessageFunctionCall4.equals(chatCompletionRequestMessageFunctionCall3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatCompletionRequestMessageFunct chatCompletionRequestMessageFunctionCall1 = OASChatCompletionRequestMessageFunct.getExample();
        OASChatCompletionRequestMessageFunct chatCompletionRequestMessageFunctionCall2 = new OASChatCompletionRequestMessageFunct();

        System.assertEquals(false, chatCompletionRequestMessageFunctionCall1.equals('foo'));
        System.assertEquals(false, chatCompletionRequestMessageFunctionCall2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatCompletionRequestMessageFunct chatCompletionRequestMessageFunctionCall1 = OASChatCompletionRequestMessageFunct.getExample();
        OASChatCompletionRequestMessageFunct chatCompletionRequestMessageFunctionCall2 = new OASChatCompletionRequestMessageFunct();
        OASChatCompletionRequestMessageFunct chatCompletionRequestMessageFunctionCall3;

        System.assertEquals(false, chatCompletionRequestMessageFunctionCall1.equals(chatCompletionRequestMessageFunctionCall3));
        System.assertEquals(false, chatCompletionRequestMessageFunctionCall2.equals(chatCompletionRequestMessageFunctionCall3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatCompletionRequestMessageFunct chatCompletionRequestMessageFunctionCall1 = OASChatCompletionRequestMessageFunct.getExample();
        OASChatCompletionRequestMessageFunct chatCompletionRequestMessageFunctionCall2 = new OASChatCompletionRequestMessageFunct();

        System.assertEquals(chatCompletionRequestMessageFunctionCall1.hashCode(), chatCompletionRequestMessageFunctionCall1.hashCode());
        System.assertEquals(chatCompletionRequestMessageFunctionCall2.hashCode(), chatCompletionRequestMessageFunctionCall2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatCompletionRequestMessageFunct chatCompletionRequestMessageFunctionCall1 = OASChatCompletionRequestMessageFunct.getExample();
        OASChatCompletionRequestMessageFunct chatCompletionRequestMessageFunctionCall2 = OASChatCompletionRequestMessageFunct.getExample();
        OASChatCompletionRequestMessageFunct chatCompletionRequestMessageFunctionCall3 = new OASChatCompletionRequestMessageFunct();
        OASChatCompletionRequestMessageFunct chatCompletionRequestMessageFunctionCall4 = new OASChatCompletionRequestMessageFunct();

        System.assert(chatCompletionRequestMessageFunctionCall1.equals(chatCompletionRequestMessageFunctionCall2));
        System.assert(chatCompletionRequestMessageFunctionCall3.equals(chatCompletionRequestMessageFunctionCall4));
        System.assertEquals(chatCompletionRequestMessageFunctionCall1.hashCode(), chatCompletionRequestMessageFunctionCall2.hashCode());
        System.assertEquals(chatCompletionRequestMessageFunctionCall3.hashCode(), chatCompletionRequestMessageFunctionCall4.hashCode());
    }
}
