@isTest
private class OASChatCompletionRequestToolMessageCTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatCompletionRequestToolMessageC chatCompletionRequestToolMessageContent1 = OASChatCompletionRequestToolMessageC.getExample();
        OASChatCompletionRequestToolMessageC chatCompletionRequestToolMessageContent2 = chatCompletionRequestToolMessageContent1;
        OASChatCompletionRequestToolMessageC chatCompletionRequestToolMessageContent3 = new OASChatCompletionRequestToolMessageC();
        OASChatCompletionRequestToolMessageC chatCompletionRequestToolMessageContent4 = chatCompletionRequestToolMessageContent3;

        System.assert(chatCompletionRequestToolMessageContent1.equals(chatCompletionRequestToolMessageContent2));
        System.assert(chatCompletionRequestToolMessageContent2.equals(chatCompletionRequestToolMessageContent1));
        System.assert(chatCompletionRequestToolMessageContent1.equals(chatCompletionRequestToolMessageContent1));
        System.assert(chatCompletionRequestToolMessageContent3.equals(chatCompletionRequestToolMessageContent4));
        System.assert(chatCompletionRequestToolMessageContent4.equals(chatCompletionRequestToolMessageContent3));
        System.assert(chatCompletionRequestToolMessageContent3.equals(chatCompletionRequestToolMessageContent3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatCompletionRequestToolMessageC chatCompletionRequestToolMessageContent1 = OASChatCompletionRequestToolMessageC.getExample();
        OASChatCompletionRequestToolMessageC chatCompletionRequestToolMessageContent2 = OASChatCompletionRequestToolMessageC.getExample();
        OASChatCompletionRequestToolMessageC chatCompletionRequestToolMessageContent3 = new OASChatCompletionRequestToolMessageC();
        OASChatCompletionRequestToolMessageC chatCompletionRequestToolMessageContent4 = new OASChatCompletionRequestToolMessageC();

        System.assert(chatCompletionRequestToolMessageContent1.equals(chatCompletionRequestToolMessageContent2));
        System.assert(chatCompletionRequestToolMessageContent2.equals(chatCompletionRequestToolMessageContent1));
        System.assert(chatCompletionRequestToolMessageContent3.equals(chatCompletionRequestToolMessageContent4));
        System.assert(chatCompletionRequestToolMessageContent4.equals(chatCompletionRequestToolMessageContent3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatCompletionRequestToolMessageC chatCompletionRequestToolMessageContent1 = OASChatCompletionRequestToolMessageC.getExample();
        OASChatCompletionRequestToolMessageC chatCompletionRequestToolMessageContent2 = new OASChatCompletionRequestToolMessageC();

        System.assertEquals(false, chatCompletionRequestToolMessageContent1.equals('foo'));
        System.assertEquals(false, chatCompletionRequestToolMessageContent2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatCompletionRequestToolMessageC chatCompletionRequestToolMessageContent1 = OASChatCompletionRequestToolMessageC.getExample();
        OASChatCompletionRequestToolMessageC chatCompletionRequestToolMessageContent2 = new OASChatCompletionRequestToolMessageC();
        OASChatCompletionRequestToolMessageC chatCompletionRequestToolMessageContent3;

        System.assertEquals(false, chatCompletionRequestToolMessageContent1.equals(chatCompletionRequestToolMessageContent3));
        System.assertEquals(false, chatCompletionRequestToolMessageContent2.equals(chatCompletionRequestToolMessageContent3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatCompletionRequestToolMessageC chatCompletionRequestToolMessageContent1 = OASChatCompletionRequestToolMessageC.getExample();
        OASChatCompletionRequestToolMessageC chatCompletionRequestToolMessageContent2 = new OASChatCompletionRequestToolMessageC();

        System.assertEquals(chatCompletionRequestToolMessageContent1.hashCode(), chatCompletionRequestToolMessageContent1.hashCode());
        System.assertEquals(chatCompletionRequestToolMessageContent2.hashCode(), chatCompletionRequestToolMessageContent2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatCompletionRequestToolMessageC chatCompletionRequestToolMessageContent1 = OASChatCompletionRequestToolMessageC.getExample();
        OASChatCompletionRequestToolMessageC chatCompletionRequestToolMessageContent2 = OASChatCompletionRequestToolMessageC.getExample();
        OASChatCompletionRequestToolMessageC chatCompletionRequestToolMessageContent3 = new OASChatCompletionRequestToolMessageC();
        OASChatCompletionRequestToolMessageC chatCompletionRequestToolMessageContent4 = new OASChatCompletionRequestToolMessageC();

        System.assert(chatCompletionRequestToolMessageContent1.equals(chatCompletionRequestToolMessageContent2));
        System.assert(chatCompletionRequestToolMessageContent3.equals(chatCompletionRequestToolMessageContent4));
        System.assertEquals(chatCompletionRequestToolMessageContent1.hashCode(), chatCompletionRequestToolMessageContent2.hashCode());
        System.assertEquals(chatCompletionRequestToolMessageContent3.hashCode(), chatCompletionRequestToolMessageContent4.hashCode());
    }
}
