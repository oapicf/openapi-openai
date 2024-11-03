@isTest
private class OASChatCompletionNamedToolChoiceTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatCompletionNamedToolChoice chatCompletionNamedToolChoice1 = OASChatCompletionNamedToolChoice.getExample();
        OASChatCompletionNamedToolChoice chatCompletionNamedToolChoice2 = chatCompletionNamedToolChoice1;
        OASChatCompletionNamedToolChoice chatCompletionNamedToolChoice3 = new OASChatCompletionNamedToolChoice();
        OASChatCompletionNamedToolChoice chatCompletionNamedToolChoice4 = chatCompletionNamedToolChoice3;

        System.assert(chatCompletionNamedToolChoice1.equals(chatCompletionNamedToolChoice2));
        System.assert(chatCompletionNamedToolChoice2.equals(chatCompletionNamedToolChoice1));
        System.assert(chatCompletionNamedToolChoice1.equals(chatCompletionNamedToolChoice1));
        System.assert(chatCompletionNamedToolChoice3.equals(chatCompletionNamedToolChoice4));
        System.assert(chatCompletionNamedToolChoice4.equals(chatCompletionNamedToolChoice3));
        System.assert(chatCompletionNamedToolChoice3.equals(chatCompletionNamedToolChoice3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatCompletionNamedToolChoice chatCompletionNamedToolChoice1 = OASChatCompletionNamedToolChoice.getExample();
        OASChatCompletionNamedToolChoice chatCompletionNamedToolChoice2 = OASChatCompletionNamedToolChoice.getExample();
        OASChatCompletionNamedToolChoice chatCompletionNamedToolChoice3 = new OASChatCompletionNamedToolChoice();
        OASChatCompletionNamedToolChoice chatCompletionNamedToolChoice4 = new OASChatCompletionNamedToolChoice();

        System.assert(chatCompletionNamedToolChoice1.equals(chatCompletionNamedToolChoice2));
        System.assert(chatCompletionNamedToolChoice2.equals(chatCompletionNamedToolChoice1));
        System.assert(chatCompletionNamedToolChoice3.equals(chatCompletionNamedToolChoice4));
        System.assert(chatCompletionNamedToolChoice4.equals(chatCompletionNamedToolChoice3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatCompletionNamedToolChoice chatCompletionNamedToolChoice1 = OASChatCompletionNamedToolChoice.getExample();
        OASChatCompletionNamedToolChoice chatCompletionNamedToolChoice2 = new OASChatCompletionNamedToolChoice();

        System.assertEquals(false, chatCompletionNamedToolChoice1.equals('foo'));
        System.assertEquals(false, chatCompletionNamedToolChoice2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatCompletionNamedToolChoice chatCompletionNamedToolChoice1 = OASChatCompletionNamedToolChoice.getExample();
        OASChatCompletionNamedToolChoice chatCompletionNamedToolChoice2 = new OASChatCompletionNamedToolChoice();
        OASChatCompletionNamedToolChoice chatCompletionNamedToolChoice3;

        System.assertEquals(false, chatCompletionNamedToolChoice1.equals(chatCompletionNamedToolChoice3));
        System.assertEquals(false, chatCompletionNamedToolChoice2.equals(chatCompletionNamedToolChoice3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatCompletionNamedToolChoice chatCompletionNamedToolChoice1 = OASChatCompletionNamedToolChoice.getExample();
        OASChatCompletionNamedToolChoice chatCompletionNamedToolChoice2 = new OASChatCompletionNamedToolChoice();

        System.assertEquals(chatCompletionNamedToolChoice1.hashCode(), chatCompletionNamedToolChoice1.hashCode());
        System.assertEquals(chatCompletionNamedToolChoice2.hashCode(), chatCompletionNamedToolChoice2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatCompletionNamedToolChoice chatCompletionNamedToolChoice1 = OASChatCompletionNamedToolChoice.getExample();
        OASChatCompletionNamedToolChoice chatCompletionNamedToolChoice2 = OASChatCompletionNamedToolChoice.getExample();
        OASChatCompletionNamedToolChoice chatCompletionNamedToolChoice3 = new OASChatCompletionNamedToolChoice();
        OASChatCompletionNamedToolChoice chatCompletionNamedToolChoice4 = new OASChatCompletionNamedToolChoice();

        System.assert(chatCompletionNamedToolChoice1.equals(chatCompletionNamedToolChoice2));
        System.assert(chatCompletionNamedToolChoice3.equals(chatCompletionNamedToolChoice4));
        System.assertEquals(chatCompletionNamedToolChoice1.hashCode(), chatCompletionNamedToolChoice2.hashCode());
        System.assertEquals(chatCompletionNamedToolChoice3.hashCode(), chatCompletionNamedToolChoice4.hashCode());
    }
}
