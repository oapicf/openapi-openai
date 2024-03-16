@isTest
private class OASCreateEditResponseChoicesInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateEditResponseChoicesInner createEditResponseChoicesInner1 = OASCreateEditResponseChoicesInner.getExample();
        OASCreateEditResponseChoicesInner createEditResponseChoicesInner2 = createEditResponseChoicesInner1;
        OASCreateEditResponseChoicesInner createEditResponseChoicesInner3 = new OASCreateEditResponseChoicesInner();
        OASCreateEditResponseChoicesInner createEditResponseChoicesInner4 = createEditResponseChoicesInner3;

        System.assert(createEditResponseChoicesInner1.equals(createEditResponseChoicesInner2));
        System.assert(createEditResponseChoicesInner2.equals(createEditResponseChoicesInner1));
        System.assert(createEditResponseChoicesInner1.equals(createEditResponseChoicesInner1));
        System.assert(createEditResponseChoicesInner3.equals(createEditResponseChoicesInner4));
        System.assert(createEditResponseChoicesInner4.equals(createEditResponseChoicesInner3));
        System.assert(createEditResponseChoicesInner3.equals(createEditResponseChoicesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateEditResponseChoicesInner createEditResponseChoicesInner1 = OASCreateEditResponseChoicesInner.getExample();
        OASCreateEditResponseChoicesInner createEditResponseChoicesInner2 = OASCreateEditResponseChoicesInner.getExample();
        OASCreateEditResponseChoicesInner createEditResponseChoicesInner3 = new OASCreateEditResponseChoicesInner();
        OASCreateEditResponseChoicesInner createEditResponseChoicesInner4 = new OASCreateEditResponseChoicesInner();

        System.assert(createEditResponseChoicesInner1.equals(createEditResponseChoicesInner2));
        System.assert(createEditResponseChoicesInner2.equals(createEditResponseChoicesInner1));
        System.assert(createEditResponseChoicesInner3.equals(createEditResponseChoicesInner4));
        System.assert(createEditResponseChoicesInner4.equals(createEditResponseChoicesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateEditResponseChoicesInner createEditResponseChoicesInner1 = OASCreateEditResponseChoicesInner.getExample();
        OASCreateEditResponseChoicesInner createEditResponseChoicesInner2 = new OASCreateEditResponseChoicesInner();

        System.assertEquals(false, createEditResponseChoicesInner1.equals('foo'));
        System.assertEquals(false, createEditResponseChoicesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateEditResponseChoicesInner createEditResponseChoicesInner1 = OASCreateEditResponseChoicesInner.getExample();
        OASCreateEditResponseChoicesInner createEditResponseChoicesInner2 = new OASCreateEditResponseChoicesInner();
        OASCreateEditResponseChoicesInner createEditResponseChoicesInner3;

        System.assertEquals(false, createEditResponseChoicesInner1.equals(createEditResponseChoicesInner3));
        System.assertEquals(false, createEditResponseChoicesInner2.equals(createEditResponseChoicesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateEditResponseChoicesInner createEditResponseChoicesInner1 = OASCreateEditResponseChoicesInner.getExample();
        OASCreateEditResponseChoicesInner createEditResponseChoicesInner2 = new OASCreateEditResponseChoicesInner();

        System.assertEquals(createEditResponseChoicesInner1.hashCode(), createEditResponseChoicesInner1.hashCode());
        System.assertEquals(createEditResponseChoicesInner2.hashCode(), createEditResponseChoicesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateEditResponseChoicesInner createEditResponseChoicesInner1 = OASCreateEditResponseChoicesInner.getExample();
        OASCreateEditResponseChoicesInner createEditResponseChoicesInner2 = OASCreateEditResponseChoicesInner.getExample();
        OASCreateEditResponseChoicesInner createEditResponseChoicesInner3 = new OASCreateEditResponseChoicesInner();
        OASCreateEditResponseChoicesInner createEditResponseChoicesInner4 = new OASCreateEditResponseChoicesInner();

        System.assert(createEditResponseChoicesInner1.equals(createEditResponseChoicesInner2));
        System.assert(createEditResponseChoicesInner3.equals(createEditResponseChoicesInner4));
        System.assertEquals(createEditResponseChoicesInner1.hashCode(), createEditResponseChoicesInner2.hashCode());
        System.assertEquals(createEditResponseChoicesInner3.hashCode(), createEditResponseChoicesInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateEditResponseChoicesInner createEditResponseChoicesInner = new OASCreateEditResponseChoicesInner();
        Map<String, String> x-property-mappings = createEditResponseChoicesInner.getx-property-mappings();
        System.assertEquals('finishReason', x-property-mappings.get('finish_reason'));
    }
}
