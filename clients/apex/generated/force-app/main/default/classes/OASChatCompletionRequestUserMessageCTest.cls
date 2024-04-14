@isTest
private class OASChatCompletionRequestUserMessageCTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatCompletionRequestUserMessageC chatCompletionRequestUserMessageContent1 = OASChatCompletionRequestUserMessageC.getExample();
        OASChatCompletionRequestUserMessageC chatCompletionRequestUserMessageContent2 = chatCompletionRequestUserMessageContent1;
        OASChatCompletionRequestUserMessageC chatCompletionRequestUserMessageContent3 = new OASChatCompletionRequestUserMessageC();
        OASChatCompletionRequestUserMessageC chatCompletionRequestUserMessageContent4 = chatCompletionRequestUserMessageContent3;

        System.assert(chatCompletionRequestUserMessageContent1.equals(chatCompletionRequestUserMessageContent2));
        System.assert(chatCompletionRequestUserMessageContent2.equals(chatCompletionRequestUserMessageContent1));
        System.assert(chatCompletionRequestUserMessageContent1.equals(chatCompletionRequestUserMessageContent1));
        System.assert(chatCompletionRequestUserMessageContent3.equals(chatCompletionRequestUserMessageContent4));
        System.assert(chatCompletionRequestUserMessageContent4.equals(chatCompletionRequestUserMessageContent3));
        System.assert(chatCompletionRequestUserMessageContent3.equals(chatCompletionRequestUserMessageContent3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatCompletionRequestUserMessageC chatCompletionRequestUserMessageContent1 = OASChatCompletionRequestUserMessageC.getExample();
        OASChatCompletionRequestUserMessageC chatCompletionRequestUserMessageContent2 = OASChatCompletionRequestUserMessageC.getExample();
        OASChatCompletionRequestUserMessageC chatCompletionRequestUserMessageContent3 = new OASChatCompletionRequestUserMessageC();
        OASChatCompletionRequestUserMessageC chatCompletionRequestUserMessageContent4 = new OASChatCompletionRequestUserMessageC();

        System.assert(chatCompletionRequestUserMessageContent1.equals(chatCompletionRequestUserMessageContent2));
        System.assert(chatCompletionRequestUserMessageContent2.equals(chatCompletionRequestUserMessageContent1));
        System.assert(chatCompletionRequestUserMessageContent3.equals(chatCompletionRequestUserMessageContent4));
        System.assert(chatCompletionRequestUserMessageContent4.equals(chatCompletionRequestUserMessageContent3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatCompletionRequestUserMessageC chatCompletionRequestUserMessageContent1 = OASChatCompletionRequestUserMessageC.getExample();
        OASChatCompletionRequestUserMessageC chatCompletionRequestUserMessageContent2 = new OASChatCompletionRequestUserMessageC();

        System.assertEquals(false, chatCompletionRequestUserMessageContent1.equals('foo'));
        System.assertEquals(false, chatCompletionRequestUserMessageContent2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatCompletionRequestUserMessageC chatCompletionRequestUserMessageContent1 = OASChatCompletionRequestUserMessageC.getExample();
        OASChatCompletionRequestUserMessageC chatCompletionRequestUserMessageContent2 = new OASChatCompletionRequestUserMessageC();
        OASChatCompletionRequestUserMessageC chatCompletionRequestUserMessageContent3;

        System.assertEquals(false, chatCompletionRequestUserMessageContent1.equals(chatCompletionRequestUserMessageContent3));
        System.assertEquals(false, chatCompletionRequestUserMessageContent2.equals(chatCompletionRequestUserMessageContent3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatCompletionRequestUserMessageC chatCompletionRequestUserMessageContent1 = OASChatCompletionRequestUserMessageC.getExample();
        OASChatCompletionRequestUserMessageC chatCompletionRequestUserMessageContent2 = new OASChatCompletionRequestUserMessageC();

        System.assertEquals(chatCompletionRequestUserMessageContent1.hashCode(), chatCompletionRequestUserMessageContent1.hashCode());
        System.assertEquals(chatCompletionRequestUserMessageContent2.hashCode(), chatCompletionRequestUserMessageContent2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatCompletionRequestUserMessageC chatCompletionRequestUserMessageContent1 = OASChatCompletionRequestUserMessageC.getExample();
        OASChatCompletionRequestUserMessageC chatCompletionRequestUserMessageContent2 = OASChatCompletionRequestUserMessageC.getExample();
        OASChatCompletionRequestUserMessageC chatCompletionRequestUserMessageContent3 = new OASChatCompletionRequestUserMessageC();
        OASChatCompletionRequestUserMessageC chatCompletionRequestUserMessageContent4 = new OASChatCompletionRequestUserMessageC();

        System.assert(chatCompletionRequestUserMessageContent1.equals(chatCompletionRequestUserMessageContent2));
        System.assert(chatCompletionRequestUserMessageContent3.equals(chatCompletionRequestUserMessageContent4));
        System.assertEquals(chatCompletionRequestUserMessageContent1.hashCode(), chatCompletionRequestUserMessageContent2.hashCode());
        System.assertEquals(chatCompletionRequestUserMessageContent3.hashCode(), chatCompletionRequestUserMessageContent4.hashCode());
    }
}
