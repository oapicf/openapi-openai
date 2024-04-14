@isTest
private class OASChatCompletionNamedToolChoiceFuncTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatCompletionNamedToolChoiceFunc chatCompletionNamedToolChoiceFunction1 = OASChatCompletionNamedToolChoiceFunc.getExample();
        OASChatCompletionNamedToolChoiceFunc chatCompletionNamedToolChoiceFunction2 = chatCompletionNamedToolChoiceFunction1;
        OASChatCompletionNamedToolChoiceFunc chatCompletionNamedToolChoiceFunction3 = new OASChatCompletionNamedToolChoiceFunc();
        OASChatCompletionNamedToolChoiceFunc chatCompletionNamedToolChoiceFunction4 = chatCompletionNamedToolChoiceFunction3;

        System.assert(chatCompletionNamedToolChoiceFunction1.equals(chatCompletionNamedToolChoiceFunction2));
        System.assert(chatCompletionNamedToolChoiceFunction2.equals(chatCompletionNamedToolChoiceFunction1));
        System.assert(chatCompletionNamedToolChoiceFunction1.equals(chatCompletionNamedToolChoiceFunction1));
        System.assert(chatCompletionNamedToolChoiceFunction3.equals(chatCompletionNamedToolChoiceFunction4));
        System.assert(chatCompletionNamedToolChoiceFunction4.equals(chatCompletionNamedToolChoiceFunction3));
        System.assert(chatCompletionNamedToolChoiceFunction3.equals(chatCompletionNamedToolChoiceFunction3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatCompletionNamedToolChoiceFunc chatCompletionNamedToolChoiceFunction1 = OASChatCompletionNamedToolChoiceFunc.getExample();
        OASChatCompletionNamedToolChoiceFunc chatCompletionNamedToolChoiceFunction2 = OASChatCompletionNamedToolChoiceFunc.getExample();
        OASChatCompletionNamedToolChoiceFunc chatCompletionNamedToolChoiceFunction3 = new OASChatCompletionNamedToolChoiceFunc();
        OASChatCompletionNamedToolChoiceFunc chatCompletionNamedToolChoiceFunction4 = new OASChatCompletionNamedToolChoiceFunc();

        System.assert(chatCompletionNamedToolChoiceFunction1.equals(chatCompletionNamedToolChoiceFunction2));
        System.assert(chatCompletionNamedToolChoiceFunction2.equals(chatCompletionNamedToolChoiceFunction1));
        System.assert(chatCompletionNamedToolChoiceFunction3.equals(chatCompletionNamedToolChoiceFunction4));
        System.assert(chatCompletionNamedToolChoiceFunction4.equals(chatCompletionNamedToolChoiceFunction3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatCompletionNamedToolChoiceFunc chatCompletionNamedToolChoiceFunction1 = OASChatCompletionNamedToolChoiceFunc.getExample();
        OASChatCompletionNamedToolChoiceFunc chatCompletionNamedToolChoiceFunction2 = new OASChatCompletionNamedToolChoiceFunc();

        System.assertEquals(false, chatCompletionNamedToolChoiceFunction1.equals('foo'));
        System.assertEquals(false, chatCompletionNamedToolChoiceFunction2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatCompletionNamedToolChoiceFunc chatCompletionNamedToolChoiceFunction1 = OASChatCompletionNamedToolChoiceFunc.getExample();
        OASChatCompletionNamedToolChoiceFunc chatCompletionNamedToolChoiceFunction2 = new OASChatCompletionNamedToolChoiceFunc();
        OASChatCompletionNamedToolChoiceFunc chatCompletionNamedToolChoiceFunction3;

        System.assertEquals(false, chatCompletionNamedToolChoiceFunction1.equals(chatCompletionNamedToolChoiceFunction3));
        System.assertEquals(false, chatCompletionNamedToolChoiceFunction2.equals(chatCompletionNamedToolChoiceFunction3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatCompletionNamedToolChoiceFunc chatCompletionNamedToolChoiceFunction1 = OASChatCompletionNamedToolChoiceFunc.getExample();
        OASChatCompletionNamedToolChoiceFunc chatCompletionNamedToolChoiceFunction2 = new OASChatCompletionNamedToolChoiceFunc();

        System.assertEquals(chatCompletionNamedToolChoiceFunction1.hashCode(), chatCompletionNamedToolChoiceFunction1.hashCode());
        System.assertEquals(chatCompletionNamedToolChoiceFunction2.hashCode(), chatCompletionNamedToolChoiceFunction2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatCompletionNamedToolChoiceFunc chatCompletionNamedToolChoiceFunction1 = OASChatCompletionNamedToolChoiceFunc.getExample();
        OASChatCompletionNamedToolChoiceFunc chatCompletionNamedToolChoiceFunction2 = OASChatCompletionNamedToolChoiceFunc.getExample();
        OASChatCompletionNamedToolChoiceFunc chatCompletionNamedToolChoiceFunction3 = new OASChatCompletionNamedToolChoiceFunc();
        OASChatCompletionNamedToolChoiceFunc chatCompletionNamedToolChoiceFunction4 = new OASChatCompletionNamedToolChoiceFunc();

        System.assert(chatCompletionNamedToolChoiceFunction1.equals(chatCompletionNamedToolChoiceFunction2));
        System.assert(chatCompletionNamedToolChoiceFunction3.equals(chatCompletionNamedToolChoiceFunction4));
        System.assertEquals(chatCompletionNamedToolChoiceFunction1.hashCode(), chatCompletionNamedToolChoiceFunction2.hashCode());
        System.assertEquals(chatCompletionNamedToolChoiceFunction3.hashCode(), chatCompletionNamedToolChoiceFunction4.hashCode());
    }
}
