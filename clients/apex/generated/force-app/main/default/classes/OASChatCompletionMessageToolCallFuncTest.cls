@isTest
private class OASChatCompletionMessageToolCallFuncTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatCompletionMessageToolCallFunc chatCompletionMessageToolCallFunction1 = OASChatCompletionMessageToolCallFunc.getExample();
        OASChatCompletionMessageToolCallFunc chatCompletionMessageToolCallFunction2 = chatCompletionMessageToolCallFunction1;
        OASChatCompletionMessageToolCallFunc chatCompletionMessageToolCallFunction3 = new OASChatCompletionMessageToolCallFunc();
        OASChatCompletionMessageToolCallFunc chatCompletionMessageToolCallFunction4 = chatCompletionMessageToolCallFunction3;

        System.assert(chatCompletionMessageToolCallFunction1.equals(chatCompletionMessageToolCallFunction2));
        System.assert(chatCompletionMessageToolCallFunction2.equals(chatCompletionMessageToolCallFunction1));
        System.assert(chatCompletionMessageToolCallFunction1.equals(chatCompletionMessageToolCallFunction1));
        System.assert(chatCompletionMessageToolCallFunction3.equals(chatCompletionMessageToolCallFunction4));
        System.assert(chatCompletionMessageToolCallFunction4.equals(chatCompletionMessageToolCallFunction3));
        System.assert(chatCompletionMessageToolCallFunction3.equals(chatCompletionMessageToolCallFunction3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatCompletionMessageToolCallFunc chatCompletionMessageToolCallFunction1 = OASChatCompletionMessageToolCallFunc.getExample();
        OASChatCompletionMessageToolCallFunc chatCompletionMessageToolCallFunction2 = OASChatCompletionMessageToolCallFunc.getExample();
        OASChatCompletionMessageToolCallFunc chatCompletionMessageToolCallFunction3 = new OASChatCompletionMessageToolCallFunc();
        OASChatCompletionMessageToolCallFunc chatCompletionMessageToolCallFunction4 = new OASChatCompletionMessageToolCallFunc();

        System.assert(chatCompletionMessageToolCallFunction1.equals(chatCompletionMessageToolCallFunction2));
        System.assert(chatCompletionMessageToolCallFunction2.equals(chatCompletionMessageToolCallFunction1));
        System.assert(chatCompletionMessageToolCallFunction3.equals(chatCompletionMessageToolCallFunction4));
        System.assert(chatCompletionMessageToolCallFunction4.equals(chatCompletionMessageToolCallFunction3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatCompletionMessageToolCallFunc chatCompletionMessageToolCallFunction1 = OASChatCompletionMessageToolCallFunc.getExample();
        OASChatCompletionMessageToolCallFunc chatCompletionMessageToolCallFunction2 = new OASChatCompletionMessageToolCallFunc();

        System.assertEquals(false, chatCompletionMessageToolCallFunction1.equals('foo'));
        System.assertEquals(false, chatCompletionMessageToolCallFunction2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatCompletionMessageToolCallFunc chatCompletionMessageToolCallFunction1 = OASChatCompletionMessageToolCallFunc.getExample();
        OASChatCompletionMessageToolCallFunc chatCompletionMessageToolCallFunction2 = new OASChatCompletionMessageToolCallFunc();
        OASChatCompletionMessageToolCallFunc chatCompletionMessageToolCallFunction3;

        System.assertEquals(false, chatCompletionMessageToolCallFunction1.equals(chatCompletionMessageToolCallFunction3));
        System.assertEquals(false, chatCompletionMessageToolCallFunction2.equals(chatCompletionMessageToolCallFunction3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatCompletionMessageToolCallFunc chatCompletionMessageToolCallFunction1 = OASChatCompletionMessageToolCallFunc.getExample();
        OASChatCompletionMessageToolCallFunc chatCompletionMessageToolCallFunction2 = new OASChatCompletionMessageToolCallFunc();

        System.assertEquals(chatCompletionMessageToolCallFunction1.hashCode(), chatCompletionMessageToolCallFunction1.hashCode());
        System.assertEquals(chatCompletionMessageToolCallFunction2.hashCode(), chatCompletionMessageToolCallFunction2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatCompletionMessageToolCallFunc chatCompletionMessageToolCallFunction1 = OASChatCompletionMessageToolCallFunc.getExample();
        OASChatCompletionMessageToolCallFunc chatCompletionMessageToolCallFunction2 = OASChatCompletionMessageToolCallFunc.getExample();
        OASChatCompletionMessageToolCallFunc chatCompletionMessageToolCallFunction3 = new OASChatCompletionMessageToolCallFunc();
        OASChatCompletionMessageToolCallFunc chatCompletionMessageToolCallFunction4 = new OASChatCompletionMessageToolCallFunc();

        System.assert(chatCompletionMessageToolCallFunction1.equals(chatCompletionMessageToolCallFunction2));
        System.assert(chatCompletionMessageToolCallFunction3.equals(chatCompletionMessageToolCallFunction4));
        System.assertEquals(chatCompletionMessageToolCallFunction1.hashCode(), chatCompletionMessageToolCallFunction2.hashCode());
        System.assertEquals(chatCompletionMessageToolCallFunction3.hashCode(), chatCompletionMessageToolCallFunction4.hashCode());
    }
}
