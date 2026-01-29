@isTest
private class OASCreateCompletionRequestStopTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateCompletionRequestStop createCompletionRequestStop1 = OASCreateCompletionRequestStop.getExample();
        OASCreateCompletionRequestStop createCompletionRequestStop2 = createCompletionRequestStop1;
        OASCreateCompletionRequestStop createCompletionRequestStop3 = new OASCreateCompletionRequestStop();
        OASCreateCompletionRequestStop createCompletionRequestStop4 = createCompletionRequestStop3;

        System.assert(createCompletionRequestStop1.equals(createCompletionRequestStop2));
        System.assert(createCompletionRequestStop2.equals(createCompletionRequestStop1));
        System.assert(createCompletionRequestStop1.equals(createCompletionRequestStop1));
        System.assert(createCompletionRequestStop3.equals(createCompletionRequestStop4));
        System.assert(createCompletionRequestStop4.equals(createCompletionRequestStop3));
        System.assert(createCompletionRequestStop3.equals(createCompletionRequestStop3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateCompletionRequestStop createCompletionRequestStop1 = OASCreateCompletionRequestStop.getExample();
        OASCreateCompletionRequestStop createCompletionRequestStop2 = OASCreateCompletionRequestStop.getExample();
        OASCreateCompletionRequestStop createCompletionRequestStop3 = new OASCreateCompletionRequestStop();
        OASCreateCompletionRequestStop createCompletionRequestStop4 = new OASCreateCompletionRequestStop();

        System.assert(createCompletionRequestStop1.equals(createCompletionRequestStop2));
        System.assert(createCompletionRequestStop2.equals(createCompletionRequestStop1));
        System.assert(createCompletionRequestStop3.equals(createCompletionRequestStop4));
        System.assert(createCompletionRequestStop4.equals(createCompletionRequestStop3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateCompletionRequestStop createCompletionRequestStop1 = OASCreateCompletionRequestStop.getExample();
        OASCreateCompletionRequestStop createCompletionRequestStop2 = new OASCreateCompletionRequestStop();

        System.assertEquals(false, createCompletionRequestStop1.equals('foo'));
        System.assertEquals(false, createCompletionRequestStop2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateCompletionRequestStop createCompletionRequestStop1 = OASCreateCompletionRequestStop.getExample();
        OASCreateCompletionRequestStop createCompletionRequestStop2 = new OASCreateCompletionRequestStop();
        OASCreateCompletionRequestStop createCompletionRequestStop3;

        System.assertEquals(false, createCompletionRequestStop1.equals(createCompletionRequestStop3));
        System.assertEquals(false, createCompletionRequestStop2.equals(createCompletionRequestStop3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateCompletionRequestStop createCompletionRequestStop1 = OASCreateCompletionRequestStop.getExample();
        OASCreateCompletionRequestStop createCompletionRequestStop2 = new OASCreateCompletionRequestStop();

        System.assertEquals(createCompletionRequestStop1.hashCode(), createCompletionRequestStop1.hashCode());
        System.assertEquals(createCompletionRequestStop2.hashCode(), createCompletionRequestStop2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateCompletionRequestStop createCompletionRequestStop1 = OASCreateCompletionRequestStop.getExample();
        OASCreateCompletionRequestStop createCompletionRequestStop2 = OASCreateCompletionRequestStop.getExample();
        OASCreateCompletionRequestStop createCompletionRequestStop3 = new OASCreateCompletionRequestStop();
        OASCreateCompletionRequestStop createCompletionRequestStop4 = new OASCreateCompletionRequestStop();

        System.assert(createCompletionRequestStop1.equals(createCompletionRequestStop2));
        System.assert(createCompletionRequestStop3.equals(createCompletionRequestStop4));
        System.assertEquals(createCompletionRequestStop1.hashCode(), createCompletionRequestStop2.hashCode());
        System.assertEquals(createCompletionRequestStop3.hashCode(), createCompletionRequestStop4.hashCode());
    }
}
