@isTest
private class OASChatCompletionRequestMessageConteTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatCompletionRequestMessageConte chatCompletionRequestMessageContentPartImageImageUrl1 = OASChatCompletionRequestMessageConte.getExample();
        OASChatCompletionRequestMessageConte chatCompletionRequestMessageContentPartImageImageUrl2 = chatCompletionRequestMessageContentPartImageImageUrl1;
        OASChatCompletionRequestMessageConte chatCompletionRequestMessageContentPartImageImageUrl3 = new OASChatCompletionRequestMessageConte();
        OASChatCompletionRequestMessageConte chatCompletionRequestMessageContentPartImageImageUrl4 = chatCompletionRequestMessageContentPartImageImageUrl3;

        System.assert(chatCompletionRequestMessageContentPartImageImageUrl1.equals(chatCompletionRequestMessageContentPartImageImageUrl2));
        System.assert(chatCompletionRequestMessageContentPartImageImageUrl2.equals(chatCompletionRequestMessageContentPartImageImageUrl1));
        System.assert(chatCompletionRequestMessageContentPartImageImageUrl1.equals(chatCompletionRequestMessageContentPartImageImageUrl1));
        System.assert(chatCompletionRequestMessageContentPartImageImageUrl3.equals(chatCompletionRequestMessageContentPartImageImageUrl4));
        System.assert(chatCompletionRequestMessageContentPartImageImageUrl4.equals(chatCompletionRequestMessageContentPartImageImageUrl3));
        System.assert(chatCompletionRequestMessageContentPartImageImageUrl3.equals(chatCompletionRequestMessageContentPartImageImageUrl3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatCompletionRequestMessageConte chatCompletionRequestMessageContentPartImageImageUrl1 = OASChatCompletionRequestMessageConte.getExample();
        OASChatCompletionRequestMessageConte chatCompletionRequestMessageContentPartImageImageUrl2 = OASChatCompletionRequestMessageConte.getExample();
        OASChatCompletionRequestMessageConte chatCompletionRequestMessageContentPartImageImageUrl3 = new OASChatCompletionRequestMessageConte();
        OASChatCompletionRequestMessageConte chatCompletionRequestMessageContentPartImageImageUrl4 = new OASChatCompletionRequestMessageConte();

        System.assert(chatCompletionRequestMessageContentPartImageImageUrl1.equals(chatCompletionRequestMessageContentPartImageImageUrl2));
        System.assert(chatCompletionRequestMessageContentPartImageImageUrl2.equals(chatCompletionRequestMessageContentPartImageImageUrl1));
        System.assert(chatCompletionRequestMessageContentPartImageImageUrl3.equals(chatCompletionRequestMessageContentPartImageImageUrl4));
        System.assert(chatCompletionRequestMessageContentPartImageImageUrl4.equals(chatCompletionRequestMessageContentPartImageImageUrl3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatCompletionRequestMessageConte chatCompletionRequestMessageContentPartImageImageUrl1 = OASChatCompletionRequestMessageConte.getExample();
        OASChatCompletionRequestMessageConte chatCompletionRequestMessageContentPartImageImageUrl2 = new OASChatCompletionRequestMessageConte();

        System.assertEquals(false, chatCompletionRequestMessageContentPartImageImageUrl1.equals('foo'));
        System.assertEquals(false, chatCompletionRequestMessageContentPartImageImageUrl2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatCompletionRequestMessageConte chatCompletionRequestMessageContentPartImageImageUrl1 = OASChatCompletionRequestMessageConte.getExample();
        OASChatCompletionRequestMessageConte chatCompletionRequestMessageContentPartImageImageUrl2 = new OASChatCompletionRequestMessageConte();
        OASChatCompletionRequestMessageConte chatCompletionRequestMessageContentPartImageImageUrl3;

        System.assertEquals(false, chatCompletionRequestMessageContentPartImageImageUrl1.equals(chatCompletionRequestMessageContentPartImageImageUrl3));
        System.assertEquals(false, chatCompletionRequestMessageContentPartImageImageUrl2.equals(chatCompletionRequestMessageContentPartImageImageUrl3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatCompletionRequestMessageConte chatCompletionRequestMessageContentPartImageImageUrl1 = OASChatCompletionRequestMessageConte.getExample();
        OASChatCompletionRequestMessageConte chatCompletionRequestMessageContentPartImageImageUrl2 = new OASChatCompletionRequestMessageConte();

        System.assertEquals(chatCompletionRequestMessageContentPartImageImageUrl1.hashCode(), chatCompletionRequestMessageContentPartImageImageUrl1.hashCode());
        System.assertEquals(chatCompletionRequestMessageContentPartImageImageUrl2.hashCode(), chatCompletionRequestMessageContentPartImageImageUrl2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatCompletionRequestMessageConte chatCompletionRequestMessageContentPartImageImageUrl1 = OASChatCompletionRequestMessageConte.getExample();
        OASChatCompletionRequestMessageConte chatCompletionRequestMessageContentPartImageImageUrl2 = OASChatCompletionRequestMessageConte.getExample();
        OASChatCompletionRequestMessageConte chatCompletionRequestMessageContentPartImageImageUrl3 = new OASChatCompletionRequestMessageConte();
        OASChatCompletionRequestMessageConte chatCompletionRequestMessageContentPartImageImageUrl4 = new OASChatCompletionRequestMessageConte();

        System.assert(chatCompletionRequestMessageContentPartImageImageUrl1.equals(chatCompletionRequestMessageContentPartImageImageUrl2));
        System.assert(chatCompletionRequestMessageContentPartImageImageUrl3.equals(chatCompletionRequestMessageContentPartImageImageUrl4));
        System.assertEquals(chatCompletionRequestMessageContentPartImageImageUrl1.hashCode(), chatCompletionRequestMessageContentPartImageImageUrl2.hashCode());
        System.assertEquals(chatCompletionRequestMessageContentPartImageImageUrl3.hashCode(), chatCompletionRequestMessageContentPartImageImageUrl4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASChatCompletionRequestMessageConte chatCompletionRequestMessageContentPartImageImageUrl = new OASChatCompletionRequestMessageConte();
        System.assertEquals(DetailEnum.AUTO, chatCompletionRequestMessageContentPartImageImageUrl.detail);
        System.assertEquals(null, chatCompletionRequestMessageContentPartImageImageUrl.url);
    }
}
