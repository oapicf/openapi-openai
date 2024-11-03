@isTest
private class OASChatCompletionToolChoiceOptionTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatCompletionToolChoiceOption chatCompletionToolChoiceOption1 = OASChatCompletionToolChoiceOption.getExample();
        OASChatCompletionToolChoiceOption chatCompletionToolChoiceOption2 = chatCompletionToolChoiceOption1;
        OASChatCompletionToolChoiceOption chatCompletionToolChoiceOption3 = new OASChatCompletionToolChoiceOption();
        OASChatCompletionToolChoiceOption chatCompletionToolChoiceOption4 = chatCompletionToolChoiceOption3;

        System.assert(chatCompletionToolChoiceOption1.equals(chatCompletionToolChoiceOption2));
        System.assert(chatCompletionToolChoiceOption2.equals(chatCompletionToolChoiceOption1));
        System.assert(chatCompletionToolChoiceOption1.equals(chatCompletionToolChoiceOption1));
        System.assert(chatCompletionToolChoiceOption3.equals(chatCompletionToolChoiceOption4));
        System.assert(chatCompletionToolChoiceOption4.equals(chatCompletionToolChoiceOption3));
        System.assert(chatCompletionToolChoiceOption3.equals(chatCompletionToolChoiceOption3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatCompletionToolChoiceOption chatCompletionToolChoiceOption1 = OASChatCompletionToolChoiceOption.getExample();
        OASChatCompletionToolChoiceOption chatCompletionToolChoiceOption2 = OASChatCompletionToolChoiceOption.getExample();
        OASChatCompletionToolChoiceOption chatCompletionToolChoiceOption3 = new OASChatCompletionToolChoiceOption();
        OASChatCompletionToolChoiceOption chatCompletionToolChoiceOption4 = new OASChatCompletionToolChoiceOption();

        System.assert(chatCompletionToolChoiceOption1.equals(chatCompletionToolChoiceOption2));
        System.assert(chatCompletionToolChoiceOption2.equals(chatCompletionToolChoiceOption1));
        System.assert(chatCompletionToolChoiceOption3.equals(chatCompletionToolChoiceOption4));
        System.assert(chatCompletionToolChoiceOption4.equals(chatCompletionToolChoiceOption3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatCompletionToolChoiceOption chatCompletionToolChoiceOption1 = OASChatCompletionToolChoiceOption.getExample();
        OASChatCompletionToolChoiceOption chatCompletionToolChoiceOption2 = new OASChatCompletionToolChoiceOption();

        System.assertEquals(false, chatCompletionToolChoiceOption1.equals('foo'));
        System.assertEquals(false, chatCompletionToolChoiceOption2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatCompletionToolChoiceOption chatCompletionToolChoiceOption1 = OASChatCompletionToolChoiceOption.getExample();
        OASChatCompletionToolChoiceOption chatCompletionToolChoiceOption2 = new OASChatCompletionToolChoiceOption();
        OASChatCompletionToolChoiceOption chatCompletionToolChoiceOption3;

        System.assertEquals(false, chatCompletionToolChoiceOption1.equals(chatCompletionToolChoiceOption3));
        System.assertEquals(false, chatCompletionToolChoiceOption2.equals(chatCompletionToolChoiceOption3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatCompletionToolChoiceOption chatCompletionToolChoiceOption1 = OASChatCompletionToolChoiceOption.getExample();
        OASChatCompletionToolChoiceOption chatCompletionToolChoiceOption2 = new OASChatCompletionToolChoiceOption();

        System.assertEquals(chatCompletionToolChoiceOption1.hashCode(), chatCompletionToolChoiceOption1.hashCode());
        System.assertEquals(chatCompletionToolChoiceOption2.hashCode(), chatCompletionToolChoiceOption2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatCompletionToolChoiceOption chatCompletionToolChoiceOption1 = OASChatCompletionToolChoiceOption.getExample();
        OASChatCompletionToolChoiceOption chatCompletionToolChoiceOption2 = OASChatCompletionToolChoiceOption.getExample();
        OASChatCompletionToolChoiceOption chatCompletionToolChoiceOption3 = new OASChatCompletionToolChoiceOption();
        OASChatCompletionToolChoiceOption chatCompletionToolChoiceOption4 = new OASChatCompletionToolChoiceOption();

        System.assert(chatCompletionToolChoiceOption1.equals(chatCompletionToolChoiceOption2));
        System.assert(chatCompletionToolChoiceOption3.equals(chatCompletionToolChoiceOption4));
        System.assertEquals(chatCompletionToolChoiceOption1.hashCode(), chatCompletionToolChoiceOption2.hashCode());
        System.assertEquals(chatCompletionToolChoiceOption3.hashCode(), chatCompletionToolChoiceOption4.hashCode());
    }
}
