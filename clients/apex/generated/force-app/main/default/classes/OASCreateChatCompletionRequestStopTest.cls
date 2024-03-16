@isTest
private class OASCreateChatCompletionRequestStopTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateChatCompletionRequestStop createChatCompletionRequestStop1 = OASCreateChatCompletionRequestStop.getExample();
        OASCreateChatCompletionRequestStop createChatCompletionRequestStop2 = createChatCompletionRequestStop1;
        OASCreateChatCompletionRequestStop createChatCompletionRequestStop3 = new OASCreateChatCompletionRequestStop();
        OASCreateChatCompletionRequestStop createChatCompletionRequestStop4 = createChatCompletionRequestStop3;

        System.assert(createChatCompletionRequestStop1.equals(createChatCompletionRequestStop2));
        System.assert(createChatCompletionRequestStop2.equals(createChatCompletionRequestStop1));
        System.assert(createChatCompletionRequestStop1.equals(createChatCompletionRequestStop1));
        System.assert(createChatCompletionRequestStop3.equals(createChatCompletionRequestStop4));
        System.assert(createChatCompletionRequestStop4.equals(createChatCompletionRequestStop3));
        System.assert(createChatCompletionRequestStop3.equals(createChatCompletionRequestStop3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateChatCompletionRequestStop createChatCompletionRequestStop1 = OASCreateChatCompletionRequestStop.getExample();
        OASCreateChatCompletionRequestStop createChatCompletionRequestStop2 = OASCreateChatCompletionRequestStop.getExample();
        OASCreateChatCompletionRequestStop createChatCompletionRequestStop3 = new OASCreateChatCompletionRequestStop();
        OASCreateChatCompletionRequestStop createChatCompletionRequestStop4 = new OASCreateChatCompletionRequestStop();

        System.assert(createChatCompletionRequestStop1.equals(createChatCompletionRequestStop2));
        System.assert(createChatCompletionRequestStop2.equals(createChatCompletionRequestStop1));
        System.assert(createChatCompletionRequestStop3.equals(createChatCompletionRequestStop4));
        System.assert(createChatCompletionRequestStop4.equals(createChatCompletionRequestStop3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateChatCompletionRequestStop createChatCompletionRequestStop1 = OASCreateChatCompletionRequestStop.getExample();
        OASCreateChatCompletionRequestStop createChatCompletionRequestStop2 = new OASCreateChatCompletionRequestStop();

        System.assertEquals(false, createChatCompletionRequestStop1.equals('foo'));
        System.assertEquals(false, createChatCompletionRequestStop2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateChatCompletionRequestStop createChatCompletionRequestStop1 = OASCreateChatCompletionRequestStop.getExample();
        OASCreateChatCompletionRequestStop createChatCompletionRequestStop2 = new OASCreateChatCompletionRequestStop();
        OASCreateChatCompletionRequestStop createChatCompletionRequestStop3;

        System.assertEquals(false, createChatCompletionRequestStop1.equals(createChatCompletionRequestStop3));
        System.assertEquals(false, createChatCompletionRequestStop2.equals(createChatCompletionRequestStop3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateChatCompletionRequestStop createChatCompletionRequestStop1 = OASCreateChatCompletionRequestStop.getExample();
        OASCreateChatCompletionRequestStop createChatCompletionRequestStop2 = new OASCreateChatCompletionRequestStop();

        System.assertEquals(createChatCompletionRequestStop1.hashCode(), createChatCompletionRequestStop1.hashCode());
        System.assertEquals(createChatCompletionRequestStop2.hashCode(), createChatCompletionRequestStop2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateChatCompletionRequestStop createChatCompletionRequestStop1 = OASCreateChatCompletionRequestStop.getExample();
        OASCreateChatCompletionRequestStop createChatCompletionRequestStop2 = OASCreateChatCompletionRequestStop.getExample();
        OASCreateChatCompletionRequestStop createChatCompletionRequestStop3 = new OASCreateChatCompletionRequestStop();
        OASCreateChatCompletionRequestStop createChatCompletionRequestStop4 = new OASCreateChatCompletionRequestStop();

        System.assert(createChatCompletionRequestStop1.equals(createChatCompletionRequestStop2));
        System.assert(createChatCompletionRequestStop3.equals(createChatCompletionRequestStop4));
        System.assertEquals(createChatCompletionRequestStop1.hashCode(), createChatCompletionRequestStop2.hashCode());
        System.assertEquals(createChatCompletionRequestStop3.hashCode(), createChatCompletionRequestStop4.hashCode());
    }
}
