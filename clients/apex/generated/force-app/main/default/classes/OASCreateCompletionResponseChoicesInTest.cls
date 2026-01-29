@isTest
private class OASCreateCompletionResponseChoicesInTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateCompletionResponseChoicesIn createCompletionResponseChoicesInner1 = OASCreateCompletionResponseChoicesIn.getExample();
        OASCreateCompletionResponseChoicesIn createCompletionResponseChoicesInner2 = createCompletionResponseChoicesInner1;
        OASCreateCompletionResponseChoicesIn createCompletionResponseChoicesInner3 = new OASCreateCompletionResponseChoicesIn();
        OASCreateCompletionResponseChoicesIn createCompletionResponseChoicesInner4 = createCompletionResponseChoicesInner3;

        System.assert(createCompletionResponseChoicesInner1.equals(createCompletionResponseChoicesInner2));
        System.assert(createCompletionResponseChoicesInner2.equals(createCompletionResponseChoicesInner1));
        System.assert(createCompletionResponseChoicesInner1.equals(createCompletionResponseChoicesInner1));
        System.assert(createCompletionResponseChoicesInner3.equals(createCompletionResponseChoicesInner4));
        System.assert(createCompletionResponseChoicesInner4.equals(createCompletionResponseChoicesInner3));
        System.assert(createCompletionResponseChoicesInner3.equals(createCompletionResponseChoicesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateCompletionResponseChoicesIn createCompletionResponseChoicesInner1 = OASCreateCompletionResponseChoicesIn.getExample();
        OASCreateCompletionResponseChoicesIn createCompletionResponseChoicesInner2 = OASCreateCompletionResponseChoicesIn.getExample();
        OASCreateCompletionResponseChoicesIn createCompletionResponseChoicesInner3 = new OASCreateCompletionResponseChoicesIn();
        OASCreateCompletionResponseChoicesIn createCompletionResponseChoicesInner4 = new OASCreateCompletionResponseChoicesIn();

        System.assert(createCompletionResponseChoicesInner1.equals(createCompletionResponseChoicesInner2));
        System.assert(createCompletionResponseChoicesInner2.equals(createCompletionResponseChoicesInner1));
        System.assert(createCompletionResponseChoicesInner3.equals(createCompletionResponseChoicesInner4));
        System.assert(createCompletionResponseChoicesInner4.equals(createCompletionResponseChoicesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateCompletionResponseChoicesIn createCompletionResponseChoicesInner1 = OASCreateCompletionResponseChoicesIn.getExample();
        OASCreateCompletionResponseChoicesIn createCompletionResponseChoicesInner2 = new OASCreateCompletionResponseChoicesIn();

        System.assertEquals(false, createCompletionResponseChoicesInner1.equals('foo'));
        System.assertEquals(false, createCompletionResponseChoicesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateCompletionResponseChoicesIn createCompletionResponseChoicesInner1 = OASCreateCompletionResponseChoicesIn.getExample();
        OASCreateCompletionResponseChoicesIn createCompletionResponseChoicesInner2 = new OASCreateCompletionResponseChoicesIn();
        OASCreateCompletionResponseChoicesIn createCompletionResponseChoicesInner3;

        System.assertEquals(false, createCompletionResponseChoicesInner1.equals(createCompletionResponseChoicesInner3));
        System.assertEquals(false, createCompletionResponseChoicesInner2.equals(createCompletionResponseChoicesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateCompletionResponseChoicesIn createCompletionResponseChoicesInner1 = OASCreateCompletionResponseChoicesIn.getExample();
        OASCreateCompletionResponseChoicesIn createCompletionResponseChoicesInner2 = new OASCreateCompletionResponseChoicesIn();

        System.assertEquals(createCompletionResponseChoicesInner1.hashCode(), createCompletionResponseChoicesInner1.hashCode());
        System.assertEquals(createCompletionResponseChoicesInner2.hashCode(), createCompletionResponseChoicesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateCompletionResponseChoicesIn createCompletionResponseChoicesInner1 = OASCreateCompletionResponseChoicesIn.getExample();
        OASCreateCompletionResponseChoicesIn createCompletionResponseChoicesInner2 = OASCreateCompletionResponseChoicesIn.getExample();
        OASCreateCompletionResponseChoicesIn createCompletionResponseChoicesInner3 = new OASCreateCompletionResponseChoicesIn();
        OASCreateCompletionResponseChoicesIn createCompletionResponseChoicesInner4 = new OASCreateCompletionResponseChoicesIn();

        System.assert(createCompletionResponseChoicesInner1.equals(createCompletionResponseChoicesInner2));
        System.assert(createCompletionResponseChoicesInner3.equals(createCompletionResponseChoicesInner4));
        System.assertEquals(createCompletionResponseChoicesInner1.hashCode(), createCompletionResponseChoicesInner2.hashCode());
        System.assertEquals(createCompletionResponseChoicesInner3.hashCode(), createCompletionResponseChoicesInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateCompletionResponseChoicesIn createCompletionResponseChoicesInner = new OASCreateCompletionResponseChoicesIn();
        Map<String, String> x-property-mappings = createCompletionResponseChoicesInner.getx-property-mappings();
        System.assertEquals('finishReason', x-property-mappings.get('finish_reason'));
    }
}
