@isTest
private class OASChatCompletionRequestFunctionMessTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatCompletionRequestFunctionMess chatCompletionRequestFunctionMessage1 = OASChatCompletionRequestFunctionMess.getExample();
        OASChatCompletionRequestFunctionMess chatCompletionRequestFunctionMessage2 = chatCompletionRequestFunctionMessage1;
        OASChatCompletionRequestFunctionMess chatCompletionRequestFunctionMessage3 = new OASChatCompletionRequestFunctionMess();
        OASChatCompletionRequestFunctionMess chatCompletionRequestFunctionMessage4 = chatCompletionRequestFunctionMessage3;

        System.assert(chatCompletionRequestFunctionMessage1.equals(chatCompletionRequestFunctionMessage2));
        System.assert(chatCompletionRequestFunctionMessage2.equals(chatCompletionRequestFunctionMessage1));
        System.assert(chatCompletionRequestFunctionMessage1.equals(chatCompletionRequestFunctionMessage1));
        System.assert(chatCompletionRequestFunctionMessage3.equals(chatCompletionRequestFunctionMessage4));
        System.assert(chatCompletionRequestFunctionMessage4.equals(chatCompletionRequestFunctionMessage3));
        System.assert(chatCompletionRequestFunctionMessage3.equals(chatCompletionRequestFunctionMessage3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatCompletionRequestFunctionMess chatCompletionRequestFunctionMessage1 = OASChatCompletionRequestFunctionMess.getExample();
        OASChatCompletionRequestFunctionMess chatCompletionRequestFunctionMessage2 = OASChatCompletionRequestFunctionMess.getExample();
        OASChatCompletionRequestFunctionMess chatCompletionRequestFunctionMessage3 = new OASChatCompletionRequestFunctionMess();
        OASChatCompletionRequestFunctionMess chatCompletionRequestFunctionMessage4 = new OASChatCompletionRequestFunctionMess();

        System.assert(chatCompletionRequestFunctionMessage1.equals(chatCompletionRequestFunctionMessage2));
        System.assert(chatCompletionRequestFunctionMessage2.equals(chatCompletionRequestFunctionMessage1));
        System.assert(chatCompletionRequestFunctionMessage3.equals(chatCompletionRequestFunctionMessage4));
        System.assert(chatCompletionRequestFunctionMessage4.equals(chatCompletionRequestFunctionMessage3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatCompletionRequestFunctionMess chatCompletionRequestFunctionMessage1 = OASChatCompletionRequestFunctionMess.getExample();
        OASChatCompletionRequestFunctionMess chatCompletionRequestFunctionMessage2 = new OASChatCompletionRequestFunctionMess();

        System.assertEquals(false, chatCompletionRequestFunctionMessage1.equals('foo'));
        System.assertEquals(false, chatCompletionRequestFunctionMessage2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatCompletionRequestFunctionMess chatCompletionRequestFunctionMessage1 = OASChatCompletionRequestFunctionMess.getExample();
        OASChatCompletionRequestFunctionMess chatCompletionRequestFunctionMessage2 = new OASChatCompletionRequestFunctionMess();
        OASChatCompletionRequestFunctionMess chatCompletionRequestFunctionMessage3;

        System.assertEquals(false, chatCompletionRequestFunctionMessage1.equals(chatCompletionRequestFunctionMessage3));
        System.assertEquals(false, chatCompletionRequestFunctionMessage2.equals(chatCompletionRequestFunctionMessage3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatCompletionRequestFunctionMess chatCompletionRequestFunctionMessage1 = OASChatCompletionRequestFunctionMess.getExample();
        OASChatCompletionRequestFunctionMess chatCompletionRequestFunctionMessage2 = new OASChatCompletionRequestFunctionMess();

        System.assertEquals(chatCompletionRequestFunctionMessage1.hashCode(), chatCompletionRequestFunctionMessage1.hashCode());
        System.assertEquals(chatCompletionRequestFunctionMessage2.hashCode(), chatCompletionRequestFunctionMessage2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatCompletionRequestFunctionMess chatCompletionRequestFunctionMessage1 = OASChatCompletionRequestFunctionMess.getExample();
        OASChatCompletionRequestFunctionMess chatCompletionRequestFunctionMessage2 = OASChatCompletionRequestFunctionMess.getExample();
        OASChatCompletionRequestFunctionMess chatCompletionRequestFunctionMessage3 = new OASChatCompletionRequestFunctionMess();
        OASChatCompletionRequestFunctionMess chatCompletionRequestFunctionMessage4 = new OASChatCompletionRequestFunctionMess();

        System.assert(chatCompletionRequestFunctionMessage1.equals(chatCompletionRequestFunctionMessage2));
        System.assert(chatCompletionRequestFunctionMessage3.equals(chatCompletionRequestFunctionMessage4));
        System.assertEquals(chatCompletionRequestFunctionMessage1.hashCode(), chatCompletionRequestFunctionMessage2.hashCode());
        System.assertEquals(chatCompletionRequestFunctionMessage3.hashCode(), chatCompletionRequestFunctionMessage4.hashCode());
    }
}
