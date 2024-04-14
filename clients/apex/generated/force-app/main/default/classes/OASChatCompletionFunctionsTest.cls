@isTest
private class OASChatCompletionFunctionsTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatCompletionFunctions chatCompletionFunctions1 = OASChatCompletionFunctions.getExample();
        OASChatCompletionFunctions chatCompletionFunctions2 = chatCompletionFunctions1;
        OASChatCompletionFunctions chatCompletionFunctions3 = new OASChatCompletionFunctions();
        OASChatCompletionFunctions chatCompletionFunctions4 = chatCompletionFunctions3;

        System.assert(chatCompletionFunctions1.equals(chatCompletionFunctions2));
        System.assert(chatCompletionFunctions2.equals(chatCompletionFunctions1));
        System.assert(chatCompletionFunctions1.equals(chatCompletionFunctions1));
        System.assert(chatCompletionFunctions3.equals(chatCompletionFunctions4));
        System.assert(chatCompletionFunctions4.equals(chatCompletionFunctions3));
        System.assert(chatCompletionFunctions3.equals(chatCompletionFunctions3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatCompletionFunctions chatCompletionFunctions1 = OASChatCompletionFunctions.getExample();
        OASChatCompletionFunctions chatCompletionFunctions2 = OASChatCompletionFunctions.getExample();
        OASChatCompletionFunctions chatCompletionFunctions3 = new OASChatCompletionFunctions();
        OASChatCompletionFunctions chatCompletionFunctions4 = new OASChatCompletionFunctions();

        System.assert(chatCompletionFunctions1.equals(chatCompletionFunctions2));
        System.assert(chatCompletionFunctions2.equals(chatCompletionFunctions1));
        System.assert(chatCompletionFunctions3.equals(chatCompletionFunctions4));
        System.assert(chatCompletionFunctions4.equals(chatCompletionFunctions3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatCompletionFunctions chatCompletionFunctions1 = OASChatCompletionFunctions.getExample();
        OASChatCompletionFunctions chatCompletionFunctions2 = new OASChatCompletionFunctions();

        System.assertEquals(false, chatCompletionFunctions1.equals('foo'));
        System.assertEquals(false, chatCompletionFunctions2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatCompletionFunctions chatCompletionFunctions1 = OASChatCompletionFunctions.getExample();
        OASChatCompletionFunctions chatCompletionFunctions2 = new OASChatCompletionFunctions();
        OASChatCompletionFunctions chatCompletionFunctions3;

        System.assertEquals(false, chatCompletionFunctions1.equals(chatCompletionFunctions3));
        System.assertEquals(false, chatCompletionFunctions2.equals(chatCompletionFunctions3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatCompletionFunctions chatCompletionFunctions1 = OASChatCompletionFunctions.getExample();
        OASChatCompletionFunctions chatCompletionFunctions2 = new OASChatCompletionFunctions();

        System.assertEquals(chatCompletionFunctions1.hashCode(), chatCompletionFunctions1.hashCode());
        System.assertEquals(chatCompletionFunctions2.hashCode(), chatCompletionFunctions2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatCompletionFunctions chatCompletionFunctions1 = OASChatCompletionFunctions.getExample();
        OASChatCompletionFunctions chatCompletionFunctions2 = OASChatCompletionFunctions.getExample();
        OASChatCompletionFunctions chatCompletionFunctions3 = new OASChatCompletionFunctions();
        OASChatCompletionFunctions chatCompletionFunctions4 = new OASChatCompletionFunctions();

        System.assert(chatCompletionFunctions1.equals(chatCompletionFunctions2));
        System.assert(chatCompletionFunctions3.equals(chatCompletionFunctions4));
        System.assertEquals(chatCompletionFunctions1.hashCode(), chatCompletionFunctions2.hashCode());
        System.assertEquals(chatCompletionFunctions3.hashCode(), chatCompletionFunctions4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASChatCompletionFunctions chatCompletionFunctions = new OASChatCompletionFunctions();
        System.assertEquals(new Map<String, oas_any_type_not_mapped>(), chatCompletionFunctions.parameters);
        System.assertEquals(null, chatCompletionFunctions.description);
        System.assertEquals(null, chatCompletionFunctions.name);
    }
}
