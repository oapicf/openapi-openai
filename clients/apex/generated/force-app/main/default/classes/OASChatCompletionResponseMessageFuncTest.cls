@isTest
private class OASChatCompletionResponseMessageFuncTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatCompletionResponseMessageFunc chatCompletionResponseMessageFunctionCall1 = OASChatCompletionResponseMessageFunc.getExample();
        OASChatCompletionResponseMessageFunc chatCompletionResponseMessageFunctionCall2 = chatCompletionResponseMessageFunctionCall1;
        OASChatCompletionResponseMessageFunc chatCompletionResponseMessageFunctionCall3 = new OASChatCompletionResponseMessageFunc();
        OASChatCompletionResponseMessageFunc chatCompletionResponseMessageFunctionCall4 = chatCompletionResponseMessageFunctionCall3;

        System.assert(chatCompletionResponseMessageFunctionCall1.equals(chatCompletionResponseMessageFunctionCall2));
        System.assert(chatCompletionResponseMessageFunctionCall2.equals(chatCompletionResponseMessageFunctionCall1));
        System.assert(chatCompletionResponseMessageFunctionCall1.equals(chatCompletionResponseMessageFunctionCall1));
        System.assert(chatCompletionResponseMessageFunctionCall3.equals(chatCompletionResponseMessageFunctionCall4));
        System.assert(chatCompletionResponseMessageFunctionCall4.equals(chatCompletionResponseMessageFunctionCall3));
        System.assert(chatCompletionResponseMessageFunctionCall3.equals(chatCompletionResponseMessageFunctionCall3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatCompletionResponseMessageFunc chatCompletionResponseMessageFunctionCall1 = OASChatCompletionResponseMessageFunc.getExample();
        OASChatCompletionResponseMessageFunc chatCompletionResponseMessageFunctionCall2 = OASChatCompletionResponseMessageFunc.getExample();
        OASChatCompletionResponseMessageFunc chatCompletionResponseMessageFunctionCall3 = new OASChatCompletionResponseMessageFunc();
        OASChatCompletionResponseMessageFunc chatCompletionResponseMessageFunctionCall4 = new OASChatCompletionResponseMessageFunc();

        System.assert(chatCompletionResponseMessageFunctionCall1.equals(chatCompletionResponseMessageFunctionCall2));
        System.assert(chatCompletionResponseMessageFunctionCall2.equals(chatCompletionResponseMessageFunctionCall1));
        System.assert(chatCompletionResponseMessageFunctionCall3.equals(chatCompletionResponseMessageFunctionCall4));
        System.assert(chatCompletionResponseMessageFunctionCall4.equals(chatCompletionResponseMessageFunctionCall3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatCompletionResponseMessageFunc chatCompletionResponseMessageFunctionCall1 = OASChatCompletionResponseMessageFunc.getExample();
        OASChatCompletionResponseMessageFunc chatCompletionResponseMessageFunctionCall2 = new OASChatCompletionResponseMessageFunc();

        System.assertEquals(false, chatCompletionResponseMessageFunctionCall1.equals('foo'));
        System.assertEquals(false, chatCompletionResponseMessageFunctionCall2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatCompletionResponseMessageFunc chatCompletionResponseMessageFunctionCall1 = OASChatCompletionResponseMessageFunc.getExample();
        OASChatCompletionResponseMessageFunc chatCompletionResponseMessageFunctionCall2 = new OASChatCompletionResponseMessageFunc();
        OASChatCompletionResponseMessageFunc chatCompletionResponseMessageFunctionCall3;

        System.assertEquals(false, chatCompletionResponseMessageFunctionCall1.equals(chatCompletionResponseMessageFunctionCall3));
        System.assertEquals(false, chatCompletionResponseMessageFunctionCall2.equals(chatCompletionResponseMessageFunctionCall3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatCompletionResponseMessageFunc chatCompletionResponseMessageFunctionCall1 = OASChatCompletionResponseMessageFunc.getExample();
        OASChatCompletionResponseMessageFunc chatCompletionResponseMessageFunctionCall2 = new OASChatCompletionResponseMessageFunc();

        System.assertEquals(chatCompletionResponseMessageFunctionCall1.hashCode(), chatCompletionResponseMessageFunctionCall1.hashCode());
        System.assertEquals(chatCompletionResponseMessageFunctionCall2.hashCode(), chatCompletionResponseMessageFunctionCall2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatCompletionResponseMessageFunc chatCompletionResponseMessageFunctionCall1 = OASChatCompletionResponseMessageFunc.getExample();
        OASChatCompletionResponseMessageFunc chatCompletionResponseMessageFunctionCall2 = OASChatCompletionResponseMessageFunc.getExample();
        OASChatCompletionResponseMessageFunc chatCompletionResponseMessageFunctionCall3 = new OASChatCompletionResponseMessageFunc();
        OASChatCompletionResponseMessageFunc chatCompletionResponseMessageFunctionCall4 = new OASChatCompletionResponseMessageFunc();

        System.assert(chatCompletionResponseMessageFunctionCall1.equals(chatCompletionResponseMessageFunctionCall2));
        System.assert(chatCompletionResponseMessageFunctionCall3.equals(chatCompletionResponseMessageFunctionCall4));
        System.assertEquals(chatCompletionResponseMessageFunctionCall1.hashCode(), chatCompletionResponseMessageFunctionCall2.hashCode());
        System.assertEquals(chatCompletionResponseMessageFunctionCall3.hashCode(), chatCompletionResponseMessageFunctionCall4.hashCode());
    }
}
