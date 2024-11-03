@isTest
private class OASCreateChatCompletionResponseChoicTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateChatCompletionResponseChoic createChatCompletionResponseChoicesInner1 = OASCreateChatCompletionResponseChoic.getExample();
        OASCreateChatCompletionResponseChoic createChatCompletionResponseChoicesInner2 = createChatCompletionResponseChoicesInner1;
        OASCreateChatCompletionResponseChoic createChatCompletionResponseChoicesInner3 = new OASCreateChatCompletionResponseChoic();
        OASCreateChatCompletionResponseChoic createChatCompletionResponseChoicesInner4 = createChatCompletionResponseChoicesInner3;

        System.assert(createChatCompletionResponseChoicesInner1.equals(createChatCompletionResponseChoicesInner2));
        System.assert(createChatCompletionResponseChoicesInner2.equals(createChatCompletionResponseChoicesInner1));
        System.assert(createChatCompletionResponseChoicesInner1.equals(createChatCompletionResponseChoicesInner1));
        System.assert(createChatCompletionResponseChoicesInner3.equals(createChatCompletionResponseChoicesInner4));
        System.assert(createChatCompletionResponseChoicesInner4.equals(createChatCompletionResponseChoicesInner3));
        System.assert(createChatCompletionResponseChoicesInner3.equals(createChatCompletionResponseChoicesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateChatCompletionResponseChoic createChatCompletionResponseChoicesInner1 = OASCreateChatCompletionResponseChoic.getExample();
        OASCreateChatCompletionResponseChoic createChatCompletionResponseChoicesInner2 = OASCreateChatCompletionResponseChoic.getExample();
        OASCreateChatCompletionResponseChoic createChatCompletionResponseChoicesInner3 = new OASCreateChatCompletionResponseChoic();
        OASCreateChatCompletionResponseChoic createChatCompletionResponseChoicesInner4 = new OASCreateChatCompletionResponseChoic();

        System.assert(createChatCompletionResponseChoicesInner1.equals(createChatCompletionResponseChoicesInner2));
        System.assert(createChatCompletionResponseChoicesInner2.equals(createChatCompletionResponseChoicesInner1));
        System.assert(createChatCompletionResponseChoicesInner3.equals(createChatCompletionResponseChoicesInner4));
        System.assert(createChatCompletionResponseChoicesInner4.equals(createChatCompletionResponseChoicesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateChatCompletionResponseChoic createChatCompletionResponseChoicesInner1 = OASCreateChatCompletionResponseChoic.getExample();
        OASCreateChatCompletionResponseChoic createChatCompletionResponseChoicesInner2 = new OASCreateChatCompletionResponseChoic();

        System.assertEquals(false, createChatCompletionResponseChoicesInner1.equals('foo'));
        System.assertEquals(false, createChatCompletionResponseChoicesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateChatCompletionResponseChoic createChatCompletionResponseChoicesInner1 = OASCreateChatCompletionResponseChoic.getExample();
        OASCreateChatCompletionResponseChoic createChatCompletionResponseChoicesInner2 = new OASCreateChatCompletionResponseChoic();
        OASCreateChatCompletionResponseChoic createChatCompletionResponseChoicesInner3;

        System.assertEquals(false, createChatCompletionResponseChoicesInner1.equals(createChatCompletionResponseChoicesInner3));
        System.assertEquals(false, createChatCompletionResponseChoicesInner2.equals(createChatCompletionResponseChoicesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateChatCompletionResponseChoic createChatCompletionResponseChoicesInner1 = OASCreateChatCompletionResponseChoic.getExample();
        OASCreateChatCompletionResponseChoic createChatCompletionResponseChoicesInner2 = new OASCreateChatCompletionResponseChoic();

        System.assertEquals(createChatCompletionResponseChoicesInner1.hashCode(), createChatCompletionResponseChoicesInner1.hashCode());
        System.assertEquals(createChatCompletionResponseChoicesInner2.hashCode(), createChatCompletionResponseChoicesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateChatCompletionResponseChoic createChatCompletionResponseChoicesInner1 = OASCreateChatCompletionResponseChoic.getExample();
        OASCreateChatCompletionResponseChoic createChatCompletionResponseChoicesInner2 = OASCreateChatCompletionResponseChoic.getExample();
        OASCreateChatCompletionResponseChoic createChatCompletionResponseChoicesInner3 = new OASCreateChatCompletionResponseChoic();
        OASCreateChatCompletionResponseChoic createChatCompletionResponseChoicesInner4 = new OASCreateChatCompletionResponseChoic();

        System.assert(createChatCompletionResponseChoicesInner1.equals(createChatCompletionResponseChoicesInner2));
        System.assert(createChatCompletionResponseChoicesInner3.equals(createChatCompletionResponseChoicesInner4));
        System.assertEquals(createChatCompletionResponseChoicesInner1.hashCode(), createChatCompletionResponseChoicesInner2.hashCode());
        System.assertEquals(createChatCompletionResponseChoicesInner3.hashCode(), createChatCompletionResponseChoicesInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateChatCompletionResponseChoic createChatCompletionResponseChoicesInner = new OASCreateChatCompletionResponseChoic();
        Map<String, String> x-property-mappings = createChatCompletionResponseChoicesInner.getx-property-mappings();
        System.assertEquals('finishReason', x-property-mappings.get('finish_reason'));
    }
}
