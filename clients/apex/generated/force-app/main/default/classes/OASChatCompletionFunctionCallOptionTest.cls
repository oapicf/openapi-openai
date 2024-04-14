@isTest
private class OASChatCompletionFunctionCallOptionTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatCompletionFunctionCallOption chatCompletionFunctionCallOption1 = OASChatCompletionFunctionCallOption.getExample();
        OASChatCompletionFunctionCallOption chatCompletionFunctionCallOption2 = chatCompletionFunctionCallOption1;
        OASChatCompletionFunctionCallOption chatCompletionFunctionCallOption3 = new OASChatCompletionFunctionCallOption();
        OASChatCompletionFunctionCallOption chatCompletionFunctionCallOption4 = chatCompletionFunctionCallOption3;

        System.assert(chatCompletionFunctionCallOption1.equals(chatCompletionFunctionCallOption2));
        System.assert(chatCompletionFunctionCallOption2.equals(chatCompletionFunctionCallOption1));
        System.assert(chatCompletionFunctionCallOption1.equals(chatCompletionFunctionCallOption1));
        System.assert(chatCompletionFunctionCallOption3.equals(chatCompletionFunctionCallOption4));
        System.assert(chatCompletionFunctionCallOption4.equals(chatCompletionFunctionCallOption3));
        System.assert(chatCompletionFunctionCallOption3.equals(chatCompletionFunctionCallOption3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatCompletionFunctionCallOption chatCompletionFunctionCallOption1 = OASChatCompletionFunctionCallOption.getExample();
        OASChatCompletionFunctionCallOption chatCompletionFunctionCallOption2 = OASChatCompletionFunctionCallOption.getExample();
        OASChatCompletionFunctionCallOption chatCompletionFunctionCallOption3 = new OASChatCompletionFunctionCallOption();
        OASChatCompletionFunctionCallOption chatCompletionFunctionCallOption4 = new OASChatCompletionFunctionCallOption();

        System.assert(chatCompletionFunctionCallOption1.equals(chatCompletionFunctionCallOption2));
        System.assert(chatCompletionFunctionCallOption2.equals(chatCompletionFunctionCallOption1));
        System.assert(chatCompletionFunctionCallOption3.equals(chatCompletionFunctionCallOption4));
        System.assert(chatCompletionFunctionCallOption4.equals(chatCompletionFunctionCallOption3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatCompletionFunctionCallOption chatCompletionFunctionCallOption1 = OASChatCompletionFunctionCallOption.getExample();
        OASChatCompletionFunctionCallOption chatCompletionFunctionCallOption2 = new OASChatCompletionFunctionCallOption();

        System.assertEquals(false, chatCompletionFunctionCallOption1.equals('foo'));
        System.assertEquals(false, chatCompletionFunctionCallOption2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatCompletionFunctionCallOption chatCompletionFunctionCallOption1 = OASChatCompletionFunctionCallOption.getExample();
        OASChatCompletionFunctionCallOption chatCompletionFunctionCallOption2 = new OASChatCompletionFunctionCallOption();
        OASChatCompletionFunctionCallOption chatCompletionFunctionCallOption3;

        System.assertEquals(false, chatCompletionFunctionCallOption1.equals(chatCompletionFunctionCallOption3));
        System.assertEquals(false, chatCompletionFunctionCallOption2.equals(chatCompletionFunctionCallOption3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatCompletionFunctionCallOption chatCompletionFunctionCallOption1 = OASChatCompletionFunctionCallOption.getExample();
        OASChatCompletionFunctionCallOption chatCompletionFunctionCallOption2 = new OASChatCompletionFunctionCallOption();

        System.assertEquals(chatCompletionFunctionCallOption1.hashCode(), chatCompletionFunctionCallOption1.hashCode());
        System.assertEquals(chatCompletionFunctionCallOption2.hashCode(), chatCompletionFunctionCallOption2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatCompletionFunctionCallOption chatCompletionFunctionCallOption1 = OASChatCompletionFunctionCallOption.getExample();
        OASChatCompletionFunctionCallOption chatCompletionFunctionCallOption2 = OASChatCompletionFunctionCallOption.getExample();
        OASChatCompletionFunctionCallOption chatCompletionFunctionCallOption3 = new OASChatCompletionFunctionCallOption();
        OASChatCompletionFunctionCallOption chatCompletionFunctionCallOption4 = new OASChatCompletionFunctionCallOption();

        System.assert(chatCompletionFunctionCallOption1.equals(chatCompletionFunctionCallOption2));
        System.assert(chatCompletionFunctionCallOption3.equals(chatCompletionFunctionCallOption4));
        System.assertEquals(chatCompletionFunctionCallOption1.hashCode(), chatCompletionFunctionCallOption2.hashCode());
        System.assertEquals(chatCompletionFunctionCallOption3.hashCode(), chatCompletionFunctionCallOption4.hashCode());
    }
}
