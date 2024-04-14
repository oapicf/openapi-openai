@isTest
private class OASChatCompletionRequestSystemMessagTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessage1 = OASChatCompletionRequestSystemMessag.getExample();
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessage2 = chatCompletionRequestSystemMessage1;
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessage3 = new OASChatCompletionRequestSystemMessag();
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessage4 = chatCompletionRequestSystemMessage3;

        System.assert(chatCompletionRequestSystemMessage1.equals(chatCompletionRequestSystemMessage2));
        System.assert(chatCompletionRequestSystemMessage2.equals(chatCompletionRequestSystemMessage1));
        System.assert(chatCompletionRequestSystemMessage1.equals(chatCompletionRequestSystemMessage1));
        System.assert(chatCompletionRequestSystemMessage3.equals(chatCompletionRequestSystemMessage4));
        System.assert(chatCompletionRequestSystemMessage4.equals(chatCompletionRequestSystemMessage3));
        System.assert(chatCompletionRequestSystemMessage3.equals(chatCompletionRequestSystemMessage3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessage1 = OASChatCompletionRequestSystemMessag.getExample();
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessage2 = OASChatCompletionRequestSystemMessag.getExample();
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessage3 = new OASChatCompletionRequestSystemMessag();
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessage4 = new OASChatCompletionRequestSystemMessag();

        System.assert(chatCompletionRequestSystemMessage1.equals(chatCompletionRequestSystemMessage2));
        System.assert(chatCompletionRequestSystemMessage2.equals(chatCompletionRequestSystemMessage1));
        System.assert(chatCompletionRequestSystemMessage3.equals(chatCompletionRequestSystemMessage4));
        System.assert(chatCompletionRequestSystemMessage4.equals(chatCompletionRequestSystemMessage3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessage1 = OASChatCompletionRequestSystemMessag.getExample();
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessage2 = new OASChatCompletionRequestSystemMessag();

        System.assertEquals(false, chatCompletionRequestSystemMessage1.equals('foo'));
        System.assertEquals(false, chatCompletionRequestSystemMessage2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessage1 = OASChatCompletionRequestSystemMessag.getExample();
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessage2 = new OASChatCompletionRequestSystemMessag();
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessage3;

        System.assertEquals(false, chatCompletionRequestSystemMessage1.equals(chatCompletionRequestSystemMessage3));
        System.assertEquals(false, chatCompletionRequestSystemMessage2.equals(chatCompletionRequestSystemMessage3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessage1 = OASChatCompletionRequestSystemMessag.getExample();
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessage2 = new OASChatCompletionRequestSystemMessag();

        System.assertEquals(chatCompletionRequestSystemMessage1.hashCode(), chatCompletionRequestSystemMessage1.hashCode());
        System.assertEquals(chatCompletionRequestSystemMessage2.hashCode(), chatCompletionRequestSystemMessage2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessage1 = OASChatCompletionRequestSystemMessag.getExample();
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessage2 = OASChatCompletionRequestSystemMessag.getExample();
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessage3 = new OASChatCompletionRequestSystemMessag();
        OASChatCompletionRequestSystemMessag chatCompletionRequestSystemMessage4 = new OASChatCompletionRequestSystemMessag();

        System.assert(chatCompletionRequestSystemMessage1.equals(chatCompletionRequestSystemMessage2));
        System.assert(chatCompletionRequestSystemMessage3.equals(chatCompletionRequestSystemMessage4));
        System.assertEquals(chatCompletionRequestSystemMessage1.hashCode(), chatCompletionRequestSystemMessage2.hashCode());
        System.assertEquals(chatCompletionRequestSystemMessage3.hashCode(), chatCompletionRequestSystemMessage4.hashCode());
    }
}
