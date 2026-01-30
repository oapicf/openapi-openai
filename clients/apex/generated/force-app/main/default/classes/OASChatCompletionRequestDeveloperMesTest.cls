@isTest
private class OASChatCompletionRequestDeveloperMesTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatCompletionRequestDeveloperMes chatCompletionRequestDeveloperMessageContent1 = OASChatCompletionRequestDeveloperMes.getExample();
        OASChatCompletionRequestDeveloperMes chatCompletionRequestDeveloperMessageContent2 = chatCompletionRequestDeveloperMessageContent1;
        OASChatCompletionRequestDeveloperMes chatCompletionRequestDeveloperMessageContent3 = new OASChatCompletionRequestDeveloperMes();
        OASChatCompletionRequestDeveloperMes chatCompletionRequestDeveloperMessageContent4 = chatCompletionRequestDeveloperMessageContent3;

        System.assert(chatCompletionRequestDeveloperMessageContent1.equals(chatCompletionRequestDeveloperMessageContent2));
        System.assert(chatCompletionRequestDeveloperMessageContent2.equals(chatCompletionRequestDeveloperMessageContent1));
        System.assert(chatCompletionRequestDeveloperMessageContent1.equals(chatCompletionRequestDeveloperMessageContent1));
        System.assert(chatCompletionRequestDeveloperMessageContent3.equals(chatCompletionRequestDeveloperMessageContent4));
        System.assert(chatCompletionRequestDeveloperMessageContent4.equals(chatCompletionRequestDeveloperMessageContent3));
        System.assert(chatCompletionRequestDeveloperMessageContent3.equals(chatCompletionRequestDeveloperMessageContent3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatCompletionRequestDeveloperMes chatCompletionRequestDeveloperMessageContent1 = OASChatCompletionRequestDeveloperMes.getExample();
        OASChatCompletionRequestDeveloperMes chatCompletionRequestDeveloperMessageContent2 = OASChatCompletionRequestDeveloperMes.getExample();
        OASChatCompletionRequestDeveloperMes chatCompletionRequestDeveloperMessageContent3 = new OASChatCompletionRequestDeveloperMes();
        OASChatCompletionRequestDeveloperMes chatCompletionRequestDeveloperMessageContent4 = new OASChatCompletionRequestDeveloperMes();

        System.assert(chatCompletionRequestDeveloperMessageContent1.equals(chatCompletionRequestDeveloperMessageContent2));
        System.assert(chatCompletionRequestDeveloperMessageContent2.equals(chatCompletionRequestDeveloperMessageContent1));
        System.assert(chatCompletionRequestDeveloperMessageContent3.equals(chatCompletionRequestDeveloperMessageContent4));
        System.assert(chatCompletionRequestDeveloperMessageContent4.equals(chatCompletionRequestDeveloperMessageContent3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatCompletionRequestDeveloperMes chatCompletionRequestDeveloperMessageContent1 = OASChatCompletionRequestDeveloperMes.getExample();
        OASChatCompletionRequestDeveloperMes chatCompletionRequestDeveloperMessageContent2 = new OASChatCompletionRequestDeveloperMes();

        System.assertEquals(false, chatCompletionRequestDeveloperMessageContent1.equals('foo'));
        System.assertEquals(false, chatCompletionRequestDeveloperMessageContent2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatCompletionRequestDeveloperMes chatCompletionRequestDeveloperMessageContent1 = OASChatCompletionRequestDeveloperMes.getExample();
        OASChatCompletionRequestDeveloperMes chatCompletionRequestDeveloperMessageContent2 = new OASChatCompletionRequestDeveloperMes();
        OASChatCompletionRequestDeveloperMes chatCompletionRequestDeveloperMessageContent3;

        System.assertEquals(false, chatCompletionRequestDeveloperMessageContent1.equals(chatCompletionRequestDeveloperMessageContent3));
        System.assertEquals(false, chatCompletionRequestDeveloperMessageContent2.equals(chatCompletionRequestDeveloperMessageContent3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatCompletionRequestDeveloperMes chatCompletionRequestDeveloperMessageContent1 = OASChatCompletionRequestDeveloperMes.getExample();
        OASChatCompletionRequestDeveloperMes chatCompletionRequestDeveloperMessageContent2 = new OASChatCompletionRequestDeveloperMes();

        System.assertEquals(chatCompletionRequestDeveloperMessageContent1.hashCode(), chatCompletionRequestDeveloperMessageContent1.hashCode());
        System.assertEquals(chatCompletionRequestDeveloperMessageContent2.hashCode(), chatCompletionRequestDeveloperMessageContent2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatCompletionRequestDeveloperMes chatCompletionRequestDeveloperMessageContent1 = OASChatCompletionRequestDeveloperMes.getExample();
        OASChatCompletionRequestDeveloperMes chatCompletionRequestDeveloperMessageContent2 = OASChatCompletionRequestDeveloperMes.getExample();
        OASChatCompletionRequestDeveloperMes chatCompletionRequestDeveloperMessageContent3 = new OASChatCompletionRequestDeveloperMes();
        OASChatCompletionRequestDeveloperMes chatCompletionRequestDeveloperMessageContent4 = new OASChatCompletionRequestDeveloperMes();

        System.assert(chatCompletionRequestDeveloperMessageContent1.equals(chatCompletionRequestDeveloperMessageContent2));
        System.assert(chatCompletionRequestDeveloperMessageContent3.equals(chatCompletionRequestDeveloperMessageContent4));
        System.assertEquals(chatCompletionRequestDeveloperMessageContent1.hashCode(), chatCompletionRequestDeveloperMessageContent2.hashCode());
        System.assertEquals(chatCompletionRequestDeveloperMessageContent3.hashCode(), chatCompletionRequestDeveloperMessageContent4.hashCode());
    }
}
