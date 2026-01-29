@isTest
private class OASChatCompletionRequestAssistantMesTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatCompletionRequestAssistantMes chatCompletionRequestAssistantMessageFunctionCall1 = OASChatCompletionRequestAssistantMes.getExample();
        OASChatCompletionRequestAssistantMes chatCompletionRequestAssistantMessageFunctionCall2 = chatCompletionRequestAssistantMessageFunctionCall1;
        OASChatCompletionRequestAssistantMes chatCompletionRequestAssistantMessageFunctionCall3 = new OASChatCompletionRequestAssistantMes();
        OASChatCompletionRequestAssistantMes chatCompletionRequestAssistantMessageFunctionCall4 = chatCompletionRequestAssistantMessageFunctionCall3;

        System.assert(chatCompletionRequestAssistantMessageFunctionCall1.equals(chatCompletionRequestAssistantMessageFunctionCall2));
        System.assert(chatCompletionRequestAssistantMessageFunctionCall2.equals(chatCompletionRequestAssistantMessageFunctionCall1));
        System.assert(chatCompletionRequestAssistantMessageFunctionCall1.equals(chatCompletionRequestAssistantMessageFunctionCall1));
        System.assert(chatCompletionRequestAssistantMessageFunctionCall3.equals(chatCompletionRequestAssistantMessageFunctionCall4));
        System.assert(chatCompletionRequestAssistantMessageFunctionCall4.equals(chatCompletionRequestAssistantMessageFunctionCall3));
        System.assert(chatCompletionRequestAssistantMessageFunctionCall3.equals(chatCompletionRequestAssistantMessageFunctionCall3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatCompletionRequestAssistantMes chatCompletionRequestAssistantMessageFunctionCall1 = OASChatCompletionRequestAssistantMes.getExample();
        OASChatCompletionRequestAssistantMes chatCompletionRequestAssistantMessageFunctionCall2 = OASChatCompletionRequestAssistantMes.getExample();
        OASChatCompletionRequestAssistantMes chatCompletionRequestAssistantMessageFunctionCall3 = new OASChatCompletionRequestAssistantMes();
        OASChatCompletionRequestAssistantMes chatCompletionRequestAssistantMessageFunctionCall4 = new OASChatCompletionRequestAssistantMes();

        System.assert(chatCompletionRequestAssistantMessageFunctionCall1.equals(chatCompletionRequestAssistantMessageFunctionCall2));
        System.assert(chatCompletionRequestAssistantMessageFunctionCall2.equals(chatCompletionRequestAssistantMessageFunctionCall1));
        System.assert(chatCompletionRequestAssistantMessageFunctionCall3.equals(chatCompletionRequestAssistantMessageFunctionCall4));
        System.assert(chatCompletionRequestAssistantMessageFunctionCall4.equals(chatCompletionRequestAssistantMessageFunctionCall3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatCompletionRequestAssistantMes chatCompletionRequestAssistantMessageFunctionCall1 = OASChatCompletionRequestAssistantMes.getExample();
        OASChatCompletionRequestAssistantMes chatCompletionRequestAssistantMessageFunctionCall2 = new OASChatCompletionRequestAssistantMes();

        System.assertEquals(false, chatCompletionRequestAssistantMessageFunctionCall1.equals('foo'));
        System.assertEquals(false, chatCompletionRequestAssistantMessageFunctionCall2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatCompletionRequestAssistantMes chatCompletionRequestAssistantMessageFunctionCall1 = OASChatCompletionRequestAssistantMes.getExample();
        OASChatCompletionRequestAssistantMes chatCompletionRequestAssistantMessageFunctionCall2 = new OASChatCompletionRequestAssistantMes();
        OASChatCompletionRequestAssistantMes chatCompletionRequestAssistantMessageFunctionCall3;

        System.assertEquals(false, chatCompletionRequestAssistantMessageFunctionCall1.equals(chatCompletionRequestAssistantMessageFunctionCall3));
        System.assertEquals(false, chatCompletionRequestAssistantMessageFunctionCall2.equals(chatCompletionRequestAssistantMessageFunctionCall3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatCompletionRequestAssistantMes chatCompletionRequestAssistantMessageFunctionCall1 = OASChatCompletionRequestAssistantMes.getExample();
        OASChatCompletionRequestAssistantMes chatCompletionRequestAssistantMessageFunctionCall2 = new OASChatCompletionRequestAssistantMes();

        System.assertEquals(chatCompletionRequestAssistantMessageFunctionCall1.hashCode(), chatCompletionRequestAssistantMessageFunctionCall1.hashCode());
        System.assertEquals(chatCompletionRequestAssistantMessageFunctionCall2.hashCode(), chatCompletionRequestAssistantMessageFunctionCall2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatCompletionRequestAssistantMes chatCompletionRequestAssistantMessageFunctionCall1 = OASChatCompletionRequestAssistantMes.getExample();
        OASChatCompletionRequestAssistantMes chatCompletionRequestAssistantMessageFunctionCall2 = OASChatCompletionRequestAssistantMes.getExample();
        OASChatCompletionRequestAssistantMes chatCompletionRequestAssistantMessageFunctionCall3 = new OASChatCompletionRequestAssistantMes();
        OASChatCompletionRequestAssistantMes chatCompletionRequestAssistantMessageFunctionCall4 = new OASChatCompletionRequestAssistantMes();

        System.assert(chatCompletionRequestAssistantMessageFunctionCall1.equals(chatCompletionRequestAssistantMessageFunctionCall2));
        System.assert(chatCompletionRequestAssistantMessageFunctionCall3.equals(chatCompletionRequestAssistantMessageFunctionCall4));
        System.assertEquals(chatCompletionRequestAssistantMessageFunctionCall1.hashCode(), chatCompletionRequestAssistantMessageFunctionCall2.hashCode());
        System.assertEquals(chatCompletionRequestAssistantMessageFunctionCall3.hashCode(), chatCompletionRequestAssistantMessageFunctionCall4.hashCode());
    }
}
