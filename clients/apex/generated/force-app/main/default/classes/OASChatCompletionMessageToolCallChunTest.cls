@isTest
private class OASChatCompletionMessageToolCallChunTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatCompletionMessageToolCallChun chatCompletionMessageToolCallChunkFunction1 = OASChatCompletionMessageToolCallChun.getExample();
        OASChatCompletionMessageToolCallChun chatCompletionMessageToolCallChunkFunction2 = chatCompletionMessageToolCallChunkFunction1;
        OASChatCompletionMessageToolCallChun chatCompletionMessageToolCallChunkFunction3 = new OASChatCompletionMessageToolCallChun();
        OASChatCompletionMessageToolCallChun chatCompletionMessageToolCallChunkFunction4 = chatCompletionMessageToolCallChunkFunction3;

        System.assert(chatCompletionMessageToolCallChunkFunction1.equals(chatCompletionMessageToolCallChunkFunction2));
        System.assert(chatCompletionMessageToolCallChunkFunction2.equals(chatCompletionMessageToolCallChunkFunction1));
        System.assert(chatCompletionMessageToolCallChunkFunction1.equals(chatCompletionMessageToolCallChunkFunction1));
        System.assert(chatCompletionMessageToolCallChunkFunction3.equals(chatCompletionMessageToolCallChunkFunction4));
        System.assert(chatCompletionMessageToolCallChunkFunction4.equals(chatCompletionMessageToolCallChunkFunction3));
        System.assert(chatCompletionMessageToolCallChunkFunction3.equals(chatCompletionMessageToolCallChunkFunction3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatCompletionMessageToolCallChun chatCompletionMessageToolCallChunkFunction1 = OASChatCompletionMessageToolCallChun.getExample();
        OASChatCompletionMessageToolCallChun chatCompletionMessageToolCallChunkFunction2 = OASChatCompletionMessageToolCallChun.getExample();
        OASChatCompletionMessageToolCallChun chatCompletionMessageToolCallChunkFunction3 = new OASChatCompletionMessageToolCallChun();
        OASChatCompletionMessageToolCallChun chatCompletionMessageToolCallChunkFunction4 = new OASChatCompletionMessageToolCallChun();

        System.assert(chatCompletionMessageToolCallChunkFunction1.equals(chatCompletionMessageToolCallChunkFunction2));
        System.assert(chatCompletionMessageToolCallChunkFunction2.equals(chatCompletionMessageToolCallChunkFunction1));
        System.assert(chatCompletionMessageToolCallChunkFunction3.equals(chatCompletionMessageToolCallChunkFunction4));
        System.assert(chatCompletionMessageToolCallChunkFunction4.equals(chatCompletionMessageToolCallChunkFunction3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatCompletionMessageToolCallChun chatCompletionMessageToolCallChunkFunction1 = OASChatCompletionMessageToolCallChun.getExample();
        OASChatCompletionMessageToolCallChun chatCompletionMessageToolCallChunkFunction2 = new OASChatCompletionMessageToolCallChun();

        System.assertEquals(false, chatCompletionMessageToolCallChunkFunction1.equals('foo'));
        System.assertEquals(false, chatCompletionMessageToolCallChunkFunction2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatCompletionMessageToolCallChun chatCompletionMessageToolCallChunkFunction1 = OASChatCompletionMessageToolCallChun.getExample();
        OASChatCompletionMessageToolCallChun chatCompletionMessageToolCallChunkFunction2 = new OASChatCompletionMessageToolCallChun();
        OASChatCompletionMessageToolCallChun chatCompletionMessageToolCallChunkFunction3;

        System.assertEquals(false, chatCompletionMessageToolCallChunkFunction1.equals(chatCompletionMessageToolCallChunkFunction3));
        System.assertEquals(false, chatCompletionMessageToolCallChunkFunction2.equals(chatCompletionMessageToolCallChunkFunction3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatCompletionMessageToolCallChun chatCompletionMessageToolCallChunkFunction1 = OASChatCompletionMessageToolCallChun.getExample();
        OASChatCompletionMessageToolCallChun chatCompletionMessageToolCallChunkFunction2 = new OASChatCompletionMessageToolCallChun();

        System.assertEquals(chatCompletionMessageToolCallChunkFunction1.hashCode(), chatCompletionMessageToolCallChunkFunction1.hashCode());
        System.assertEquals(chatCompletionMessageToolCallChunkFunction2.hashCode(), chatCompletionMessageToolCallChunkFunction2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatCompletionMessageToolCallChun chatCompletionMessageToolCallChunkFunction1 = OASChatCompletionMessageToolCallChun.getExample();
        OASChatCompletionMessageToolCallChun chatCompletionMessageToolCallChunkFunction2 = OASChatCompletionMessageToolCallChun.getExample();
        OASChatCompletionMessageToolCallChun chatCompletionMessageToolCallChunkFunction3 = new OASChatCompletionMessageToolCallChun();
        OASChatCompletionMessageToolCallChun chatCompletionMessageToolCallChunkFunction4 = new OASChatCompletionMessageToolCallChun();

        System.assert(chatCompletionMessageToolCallChunkFunction1.equals(chatCompletionMessageToolCallChunkFunction2));
        System.assert(chatCompletionMessageToolCallChunkFunction3.equals(chatCompletionMessageToolCallChunkFunction4));
        System.assertEquals(chatCompletionMessageToolCallChunkFunction1.hashCode(), chatCompletionMessageToolCallChunkFunction2.hashCode());
        System.assertEquals(chatCompletionMessageToolCallChunkFunction3.hashCode(), chatCompletionMessageToolCallChunkFunction4.hashCode());
    }
}
