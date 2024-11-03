@isTest
private class OASCreateChatCompletionStreamResponsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseChoicesInner1 = OASCreateChatCompletionStreamRespons.getExample();
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseChoicesInner2 = createChatCompletionStreamResponseChoicesInner1;
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseChoicesInner3 = new OASCreateChatCompletionStreamRespons();
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseChoicesInner4 = createChatCompletionStreamResponseChoicesInner3;

        System.assert(createChatCompletionStreamResponseChoicesInner1.equals(createChatCompletionStreamResponseChoicesInner2));
        System.assert(createChatCompletionStreamResponseChoicesInner2.equals(createChatCompletionStreamResponseChoicesInner1));
        System.assert(createChatCompletionStreamResponseChoicesInner1.equals(createChatCompletionStreamResponseChoicesInner1));
        System.assert(createChatCompletionStreamResponseChoicesInner3.equals(createChatCompletionStreamResponseChoicesInner4));
        System.assert(createChatCompletionStreamResponseChoicesInner4.equals(createChatCompletionStreamResponseChoicesInner3));
        System.assert(createChatCompletionStreamResponseChoicesInner3.equals(createChatCompletionStreamResponseChoicesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseChoicesInner1 = OASCreateChatCompletionStreamRespons.getExample();
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseChoicesInner2 = OASCreateChatCompletionStreamRespons.getExample();
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseChoicesInner3 = new OASCreateChatCompletionStreamRespons();
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseChoicesInner4 = new OASCreateChatCompletionStreamRespons();

        System.assert(createChatCompletionStreamResponseChoicesInner1.equals(createChatCompletionStreamResponseChoicesInner2));
        System.assert(createChatCompletionStreamResponseChoicesInner2.equals(createChatCompletionStreamResponseChoicesInner1));
        System.assert(createChatCompletionStreamResponseChoicesInner3.equals(createChatCompletionStreamResponseChoicesInner4));
        System.assert(createChatCompletionStreamResponseChoicesInner4.equals(createChatCompletionStreamResponseChoicesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseChoicesInner1 = OASCreateChatCompletionStreamRespons.getExample();
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseChoicesInner2 = new OASCreateChatCompletionStreamRespons();

        System.assertEquals(false, createChatCompletionStreamResponseChoicesInner1.equals('foo'));
        System.assertEquals(false, createChatCompletionStreamResponseChoicesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseChoicesInner1 = OASCreateChatCompletionStreamRespons.getExample();
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseChoicesInner2 = new OASCreateChatCompletionStreamRespons();
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseChoicesInner3;

        System.assertEquals(false, createChatCompletionStreamResponseChoicesInner1.equals(createChatCompletionStreamResponseChoicesInner3));
        System.assertEquals(false, createChatCompletionStreamResponseChoicesInner2.equals(createChatCompletionStreamResponseChoicesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseChoicesInner1 = OASCreateChatCompletionStreamRespons.getExample();
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseChoicesInner2 = new OASCreateChatCompletionStreamRespons();

        System.assertEquals(createChatCompletionStreamResponseChoicesInner1.hashCode(), createChatCompletionStreamResponseChoicesInner1.hashCode());
        System.assertEquals(createChatCompletionStreamResponseChoicesInner2.hashCode(), createChatCompletionStreamResponseChoicesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseChoicesInner1 = OASCreateChatCompletionStreamRespons.getExample();
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseChoicesInner2 = OASCreateChatCompletionStreamRespons.getExample();
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseChoicesInner3 = new OASCreateChatCompletionStreamRespons();
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseChoicesInner4 = new OASCreateChatCompletionStreamRespons();

        System.assert(createChatCompletionStreamResponseChoicesInner1.equals(createChatCompletionStreamResponseChoicesInner2));
        System.assert(createChatCompletionStreamResponseChoicesInner3.equals(createChatCompletionStreamResponseChoicesInner4));
        System.assertEquals(createChatCompletionStreamResponseChoicesInner1.hashCode(), createChatCompletionStreamResponseChoicesInner2.hashCode());
        System.assertEquals(createChatCompletionStreamResponseChoicesInner3.hashCode(), createChatCompletionStreamResponseChoicesInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseChoicesInner = new OASCreateChatCompletionStreamRespons();
        Map<String, String> x-property-mappings = createChatCompletionStreamResponseChoicesInner.getx-property-mappings();
        System.assertEquals('finishReason', x-property-mappings.get('finish_reason'));
    }
}
