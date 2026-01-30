@isTest
private class OASChatCompletionRequestSystemMessagTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessageContent1 = OASChatCompletionRequestSystemMessag.getExample();
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessageContent2 = chatCompletionRequestSystemMessageContent1;
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessageContent3 = new OASChatCompletionRequestSystemMessag();
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessageContent4 = chatCompletionRequestSystemMessageContent3;

        System.assert(chatCompletionRequestSystemMessageContent1.equals(chatCompletionRequestSystemMessageContent2));
        System.assert(chatCompletionRequestSystemMessageContent2.equals(chatCompletionRequestSystemMessageContent1));
        System.assert(chatCompletionRequestSystemMessageContent1.equals(chatCompletionRequestSystemMessageContent1));
        System.assert(chatCompletionRequestSystemMessageContent3.equals(chatCompletionRequestSystemMessageContent4));
        System.assert(chatCompletionRequestSystemMessageContent4.equals(chatCompletionRequestSystemMessageContent3));
        System.assert(chatCompletionRequestSystemMessageContent3.equals(chatCompletionRequestSystemMessageContent3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessageContent1 = OASChatCompletionRequestSystemMessag.getExample();
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessageContent2 = OASChatCompletionRequestSystemMessag.getExample();
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessageContent3 = new OASChatCompletionRequestSystemMessag();
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessageContent4 = new OASChatCompletionRequestSystemMessag();

        System.assert(chatCompletionRequestSystemMessageContent1.equals(chatCompletionRequestSystemMessageContent2));
        System.assert(chatCompletionRequestSystemMessageContent2.equals(chatCompletionRequestSystemMessageContent1));
        System.assert(chatCompletionRequestSystemMessageContent3.equals(chatCompletionRequestSystemMessageContent4));
        System.assert(chatCompletionRequestSystemMessageContent4.equals(chatCompletionRequestSystemMessageContent3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessageContent1 = OASChatCompletionRequestSystemMessag.getExample();
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessageContent2 = new OASChatCompletionRequestSystemMessag();

        System.assertEquals(false, chatCompletionRequestSystemMessageContent1.equals('foo'));
        System.assertEquals(false, chatCompletionRequestSystemMessageContent2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessageContent1 = OASChatCompletionRequestSystemMessag.getExample();
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessageContent2 = new OASChatCompletionRequestSystemMessag();
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessageContent3;

        System.assertEquals(false, chatCompletionRequestSystemMessageContent1.equals(chatCompletionRequestSystemMessageContent3));
        System.assertEquals(false, chatCompletionRequestSystemMessageContent2.equals(chatCompletionRequestSystemMessageContent3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessageContent1 = OASChatCompletionRequestSystemMessag.getExample();
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessageContent2 = new OASChatCompletionRequestSystemMessag();

        System.assertEquals(chatCompletionRequestSystemMessageContent1.hashCode(), chatCompletionRequestSystemMessageContent1.hashCode());
        System.assertEquals(chatCompletionRequestSystemMessageContent2.hashCode(), chatCompletionRequestSystemMessageContent2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessageContent1 = OASChatCompletionRequestSystemMessag.getExample();
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessageContent2 = OASChatCompletionRequestSystemMessag.getExample();
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessageContent3 = new OASChatCompletionRequestSystemMessag();
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessageContent4 = new OASChatCompletionRequestSystemMessag();

        System.assert(chatCompletionRequestSystemMessageContent1.equals(chatCompletionRequestSystemMessageContent2));
        System.assert(chatCompletionRequestSystemMessageContent3.equals(chatCompletionRequestSystemMessageContent4));
        System.assertEquals(chatCompletionRequestSystemMessageContent1.hashCode(), chatCompletionRequestSystemMessageContent2.hashCode());
        System.assertEquals(chatCompletionRequestSystemMessageContent3.hashCode(), chatCompletionRequestSystemMessageContent4.hashCode());
    }
}
