@isTest
private class OASCreateChatCompletionStreamResponsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseUsage1 = OASCreateChatCompletionStreamRespons.getExample();
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseUsage2 = createChatCompletionStreamResponseUsage1;
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseUsage3 = new OASCreateChatCompletionStreamRespons();
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseUsage4 = createChatCompletionStreamResponseUsage3;

        System.assert(createChatCompletionStreamResponseUsage1.equals(createChatCompletionStreamResponseUsage2));
        System.assert(createChatCompletionStreamResponseUsage2.equals(createChatCompletionStreamResponseUsage1));
        System.assert(createChatCompletionStreamResponseUsage1.equals(createChatCompletionStreamResponseUsage1));
        System.assert(createChatCompletionStreamResponseUsage3.equals(createChatCompletionStreamResponseUsage4));
        System.assert(createChatCompletionStreamResponseUsage4.equals(createChatCompletionStreamResponseUsage3));
        System.assert(createChatCompletionStreamResponseUsage3.equals(createChatCompletionStreamResponseUsage3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseUsage1 = OASCreateChatCompletionStreamRespons.getExample();
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseUsage2 = OASCreateChatCompletionStreamRespons.getExample();
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseUsage3 = new OASCreateChatCompletionStreamRespons();
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseUsage4 = new OASCreateChatCompletionStreamRespons();

        System.assert(createChatCompletionStreamResponseUsage1.equals(createChatCompletionStreamResponseUsage2));
        System.assert(createChatCompletionStreamResponseUsage2.equals(createChatCompletionStreamResponseUsage1));
        System.assert(createChatCompletionStreamResponseUsage3.equals(createChatCompletionStreamResponseUsage4));
        System.assert(createChatCompletionStreamResponseUsage4.equals(createChatCompletionStreamResponseUsage3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseUsage1 = OASCreateChatCompletionStreamRespons.getExample();
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseUsage2 = new OASCreateChatCompletionStreamRespons();

        System.assertEquals(false, createChatCompletionStreamResponseUsage1.equals('foo'));
        System.assertEquals(false, createChatCompletionStreamResponseUsage2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseUsage1 = OASCreateChatCompletionStreamRespons.getExample();
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseUsage2 = new OASCreateChatCompletionStreamRespons();
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseUsage3;

        System.assertEquals(false, createChatCompletionStreamResponseUsage1.equals(createChatCompletionStreamResponseUsage3));
        System.assertEquals(false, createChatCompletionStreamResponseUsage2.equals(createChatCompletionStreamResponseUsage3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseUsage1 = OASCreateChatCompletionStreamRespons.getExample();
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseUsage2 = new OASCreateChatCompletionStreamRespons();

        System.assertEquals(createChatCompletionStreamResponseUsage1.hashCode(), createChatCompletionStreamResponseUsage1.hashCode());
        System.assertEquals(createChatCompletionStreamResponseUsage2.hashCode(), createChatCompletionStreamResponseUsage2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseUsage1 = OASCreateChatCompletionStreamRespons.getExample();
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseUsage2 = OASCreateChatCompletionStreamRespons.getExample();
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseUsage3 = new OASCreateChatCompletionStreamRespons();
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseUsage4 = new OASCreateChatCompletionStreamRespons();

        System.assert(createChatCompletionStreamResponseUsage1.equals(createChatCompletionStreamResponseUsage2));
        System.assert(createChatCompletionStreamResponseUsage3.equals(createChatCompletionStreamResponseUsage4));
        System.assertEquals(createChatCompletionStreamResponseUsage1.hashCode(), createChatCompletionStreamResponseUsage2.hashCode());
        System.assertEquals(createChatCompletionStreamResponseUsage3.hashCode(), createChatCompletionStreamResponseUsage4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseUsage = new OASCreateChatCompletionStreamRespons();
        Map<String, String> x-property-mappings = createChatCompletionStreamResponseUsage.getx-property-mappings();
        System.assertEquals('completionTokens', x-property-mappings.get('completion_tokens'));
        System.assertEquals('promptTokens', x-property-mappings.get('prompt_tokens'));
        System.assertEquals('totalTokens', x-property-mappings.get('total_tokens'));
    }
}
