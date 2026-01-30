@isTest
private class OASChatCompletionStreamOptionsTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatCompletionStreamOptions chatCompletionStreamOptions1 = OASChatCompletionStreamOptions.getExample();
        OASChatCompletionStreamOptions chatCompletionStreamOptions2 = chatCompletionStreamOptions1;
        OASChatCompletionStreamOptions chatCompletionStreamOptions3 = new OASChatCompletionStreamOptions();
        OASChatCompletionStreamOptions chatCompletionStreamOptions4 = chatCompletionStreamOptions3;

        System.assert(chatCompletionStreamOptions1.equals(chatCompletionStreamOptions2));
        System.assert(chatCompletionStreamOptions2.equals(chatCompletionStreamOptions1));
        System.assert(chatCompletionStreamOptions1.equals(chatCompletionStreamOptions1));
        System.assert(chatCompletionStreamOptions3.equals(chatCompletionStreamOptions4));
        System.assert(chatCompletionStreamOptions4.equals(chatCompletionStreamOptions3));
        System.assert(chatCompletionStreamOptions3.equals(chatCompletionStreamOptions3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatCompletionStreamOptions chatCompletionStreamOptions1 = OASChatCompletionStreamOptions.getExample();
        OASChatCompletionStreamOptions chatCompletionStreamOptions2 = OASChatCompletionStreamOptions.getExample();
        OASChatCompletionStreamOptions chatCompletionStreamOptions3 = new OASChatCompletionStreamOptions();
        OASChatCompletionStreamOptions chatCompletionStreamOptions4 = new OASChatCompletionStreamOptions();

        System.assert(chatCompletionStreamOptions1.equals(chatCompletionStreamOptions2));
        System.assert(chatCompletionStreamOptions2.equals(chatCompletionStreamOptions1));
        System.assert(chatCompletionStreamOptions3.equals(chatCompletionStreamOptions4));
        System.assert(chatCompletionStreamOptions4.equals(chatCompletionStreamOptions3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatCompletionStreamOptions chatCompletionStreamOptions1 = OASChatCompletionStreamOptions.getExample();
        OASChatCompletionStreamOptions chatCompletionStreamOptions2 = new OASChatCompletionStreamOptions();

        System.assertEquals(false, chatCompletionStreamOptions1.equals('foo'));
        System.assertEquals(false, chatCompletionStreamOptions2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatCompletionStreamOptions chatCompletionStreamOptions1 = OASChatCompletionStreamOptions.getExample();
        OASChatCompletionStreamOptions chatCompletionStreamOptions2 = new OASChatCompletionStreamOptions();
        OASChatCompletionStreamOptions chatCompletionStreamOptions3;

        System.assertEquals(false, chatCompletionStreamOptions1.equals(chatCompletionStreamOptions3));
        System.assertEquals(false, chatCompletionStreamOptions2.equals(chatCompletionStreamOptions3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatCompletionStreamOptions chatCompletionStreamOptions1 = OASChatCompletionStreamOptions.getExample();
        OASChatCompletionStreamOptions chatCompletionStreamOptions2 = new OASChatCompletionStreamOptions();

        System.assertEquals(chatCompletionStreamOptions1.hashCode(), chatCompletionStreamOptions1.hashCode());
        System.assertEquals(chatCompletionStreamOptions2.hashCode(), chatCompletionStreamOptions2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatCompletionStreamOptions chatCompletionStreamOptions1 = OASChatCompletionStreamOptions.getExample();
        OASChatCompletionStreamOptions chatCompletionStreamOptions2 = OASChatCompletionStreamOptions.getExample();
        OASChatCompletionStreamOptions chatCompletionStreamOptions3 = new OASChatCompletionStreamOptions();
        OASChatCompletionStreamOptions chatCompletionStreamOptions4 = new OASChatCompletionStreamOptions();

        System.assert(chatCompletionStreamOptions1.equals(chatCompletionStreamOptions2));
        System.assert(chatCompletionStreamOptions3.equals(chatCompletionStreamOptions4));
        System.assertEquals(chatCompletionStreamOptions1.hashCode(), chatCompletionStreamOptions2.hashCode());
        System.assertEquals(chatCompletionStreamOptions3.hashCode(), chatCompletionStreamOptions4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASChatCompletionStreamOptions chatCompletionStreamOptions = new OASChatCompletionStreamOptions();
        Map<String, String> x-property-mappings = chatCompletionStreamOptions.getx-property-mappings();
        System.assertEquals('includeUsage', x-property-mappings.get('include_usage'));
    }
}
