@isTest
private class OASCreateChatCompletionFunctionRespoTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateChatCompletionFunctionRespo createChatCompletionFunctionResponseChoicesInner1 = OASCreateChatCompletionFunctionRespo.getExample();
        OASCreateChatCompletionFunctionRespo createChatCompletionFunctionResponseChoicesInner2 = createChatCompletionFunctionResponseChoicesInner1;
        OASCreateChatCompletionFunctionRespo createChatCompletionFunctionResponseChoicesInner3 = new OASCreateChatCompletionFunctionRespo();
        OASCreateChatCompletionFunctionRespo createChatCompletionFunctionResponseChoicesInner4 = createChatCompletionFunctionResponseChoicesInner3;

        System.assert(createChatCompletionFunctionResponseChoicesInner1.equals(createChatCompletionFunctionResponseChoicesInner2));
        System.assert(createChatCompletionFunctionResponseChoicesInner2.equals(createChatCompletionFunctionResponseChoicesInner1));
        System.assert(createChatCompletionFunctionResponseChoicesInner1.equals(createChatCompletionFunctionResponseChoicesInner1));
        System.assert(createChatCompletionFunctionResponseChoicesInner3.equals(createChatCompletionFunctionResponseChoicesInner4));
        System.assert(createChatCompletionFunctionResponseChoicesInner4.equals(createChatCompletionFunctionResponseChoicesInner3));
        System.assert(createChatCompletionFunctionResponseChoicesInner3.equals(createChatCompletionFunctionResponseChoicesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateChatCompletionFunctionRespo createChatCompletionFunctionResponseChoicesInner1 = OASCreateChatCompletionFunctionRespo.getExample();
        OASCreateChatCompletionFunctionRespo createChatCompletionFunctionResponseChoicesInner2 = OASCreateChatCompletionFunctionRespo.getExample();
        OASCreateChatCompletionFunctionRespo createChatCompletionFunctionResponseChoicesInner3 = new OASCreateChatCompletionFunctionRespo();
        OASCreateChatCompletionFunctionRespo createChatCompletionFunctionResponseChoicesInner4 = new OASCreateChatCompletionFunctionRespo();

        System.assert(createChatCompletionFunctionResponseChoicesInner1.equals(createChatCompletionFunctionResponseChoicesInner2));
        System.assert(createChatCompletionFunctionResponseChoicesInner2.equals(createChatCompletionFunctionResponseChoicesInner1));
        System.assert(createChatCompletionFunctionResponseChoicesInner3.equals(createChatCompletionFunctionResponseChoicesInner4));
        System.assert(createChatCompletionFunctionResponseChoicesInner4.equals(createChatCompletionFunctionResponseChoicesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateChatCompletionFunctionRespo createChatCompletionFunctionResponseChoicesInner1 = OASCreateChatCompletionFunctionRespo.getExample();
        OASCreateChatCompletionFunctionRespo createChatCompletionFunctionResponseChoicesInner2 = new OASCreateChatCompletionFunctionRespo();

        System.assertEquals(false, createChatCompletionFunctionResponseChoicesInner1.equals('foo'));
        System.assertEquals(false, createChatCompletionFunctionResponseChoicesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateChatCompletionFunctionRespo createChatCompletionFunctionResponseChoicesInner1 = OASCreateChatCompletionFunctionRespo.getExample();
        OASCreateChatCompletionFunctionRespo createChatCompletionFunctionResponseChoicesInner2 = new OASCreateChatCompletionFunctionRespo();
        OASCreateChatCompletionFunctionRespo createChatCompletionFunctionResponseChoicesInner3;

        System.assertEquals(false, createChatCompletionFunctionResponseChoicesInner1.equals(createChatCompletionFunctionResponseChoicesInner3));
        System.assertEquals(false, createChatCompletionFunctionResponseChoicesInner2.equals(createChatCompletionFunctionResponseChoicesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateChatCompletionFunctionRespo createChatCompletionFunctionResponseChoicesInner1 = OASCreateChatCompletionFunctionRespo.getExample();
        OASCreateChatCompletionFunctionRespo createChatCompletionFunctionResponseChoicesInner2 = new OASCreateChatCompletionFunctionRespo();

        System.assertEquals(createChatCompletionFunctionResponseChoicesInner1.hashCode(), createChatCompletionFunctionResponseChoicesInner1.hashCode());
        System.assertEquals(createChatCompletionFunctionResponseChoicesInner2.hashCode(), createChatCompletionFunctionResponseChoicesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateChatCompletionFunctionRespo createChatCompletionFunctionResponseChoicesInner1 = OASCreateChatCompletionFunctionRespo.getExample();
        OASCreateChatCompletionFunctionRespo createChatCompletionFunctionResponseChoicesInner2 = OASCreateChatCompletionFunctionRespo.getExample();
        OASCreateChatCompletionFunctionRespo createChatCompletionFunctionResponseChoicesInner3 = new OASCreateChatCompletionFunctionRespo();
        OASCreateChatCompletionFunctionRespo createChatCompletionFunctionResponseChoicesInner4 = new OASCreateChatCompletionFunctionRespo();

        System.assert(createChatCompletionFunctionResponseChoicesInner1.equals(createChatCompletionFunctionResponseChoicesInner2));
        System.assert(createChatCompletionFunctionResponseChoicesInner3.equals(createChatCompletionFunctionResponseChoicesInner4));
        System.assertEquals(createChatCompletionFunctionResponseChoicesInner1.hashCode(), createChatCompletionFunctionResponseChoicesInner2.hashCode());
        System.assertEquals(createChatCompletionFunctionResponseChoicesInner3.hashCode(), createChatCompletionFunctionResponseChoicesInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateChatCompletionFunctionRespo createChatCompletionFunctionResponseChoicesInner = new OASCreateChatCompletionFunctionRespo();
        Map<String, String> x-property-mappings = createChatCompletionFunctionResponseChoicesInner.getx-property-mappings();
        System.assertEquals('finishReason', x-property-mappings.get('finish_reason'));
    }
}
