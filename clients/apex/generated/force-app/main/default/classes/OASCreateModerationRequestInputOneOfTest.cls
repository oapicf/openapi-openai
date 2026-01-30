@isTest
private class OASCreateModerationRequestInputOneOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateModerationRequestInputOneOf createModerationRequestInputOneOfInner1 = OASCreateModerationRequestInputOneOf.getExample();
        OASCreateModerationRequestInputOneOf createModerationRequestInputOneOfInner2 = createModerationRequestInputOneOfInner1;
        OASCreateModerationRequestInputOneOf createModerationRequestInputOneOfInner3 = new OASCreateModerationRequestInputOneOf();
        OASCreateModerationRequestInputOneOf createModerationRequestInputOneOfInner4 = createModerationRequestInputOneOfInner3;

        System.assert(createModerationRequestInputOneOfInner1.equals(createModerationRequestInputOneOfInner2));
        System.assert(createModerationRequestInputOneOfInner2.equals(createModerationRequestInputOneOfInner1));
        System.assert(createModerationRequestInputOneOfInner1.equals(createModerationRequestInputOneOfInner1));
        System.assert(createModerationRequestInputOneOfInner3.equals(createModerationRequestInputOneOfInner4));
        System.assert(createModerationRequestInputOneOfInner4.equals(createModerationRequestInputOneOfInner3));
        System.assert(createModerationRequestInputOneOfInner3.equals(createModerationRequestInputOneOfInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateModerationRequestInputOneOf createModerationRequestInputOneOfInner1 = OASCreateModerationRequestInputOneOf.getExample();
        OASCreateModerationRequestInputOneOf createModerationRequestInputOneOfInner2 = OASCreateModerationRequestInputOneOf.getExample();
        OASCreateModerationRequestInputOneOf createModerationRequestInputOneOfInner3 = new OASCreateModerationRequestInputOneOf();
        OASCreateModerationRequestInputOneOf createModerationRequestInputOneOfInner4 = new OASCreateModerationRequestInputOneOf();

        System.assert(createModerationRequestInputOneOfInner1.equals(createModerationRequestInputOneOfInner2));
        System.assert(createModerationRequestInputOneOfInner2.equals(createModerationRequestInputOneOfInner1));
        System.assert(createModerationRequestInputOneOfInner3.equals(createModerationRequestInputOneOfInner4));
        System.assert(createModerationRequestInputOneOfInner4.equals(createModerationRequestInputOneOfInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateModerationRequestInputOneOf createModerationRequestInputOneOfInner1 = OASCreateModerationRequestInputOneOf.getExample();
        OASCreateModerationRequestInputOneOf createModerationRequestInputOneOfInner2 = new OASCreateModerationRequestInputOneOf();

        System.assertEquals(false, createModerationRequestInputOneOfInner1.equals('foo'));
        System.assertEquals(false, createModerationRequestInputOneOfInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateModerationRequestInputOneOf createModerationRequestInputOneOfInner1 = OASCreateModerationRequestInputOneOf.getExample();
        OASCreateModerationRequestInputOneOf createModerationRequestInputOneOfInner2 = new OASCreateModerationRequestInputOneOf();
        OASCreateModerationRequestInputOneOf createModerationRequestInputOneOfInner3;

        System.assertEquals(false, createModerationRequestInputOneOfInner1.equals(createModerationRequestInputOneOfInner3));
        System.assertEquals(false, createModerationRequestInputOneOfInner2.equals(createModerationRequestInputOneOfInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateModerationRequestInputOneOf createModerationRequestInputOneOfInner1 = OASCreateModerationRequestInputOneOf.getExample();
        OASCreateModerationRequestInputOneOf createModerationRequestInputOneOfInner2 = new OASCreateModerationRequestInputOneOf();

        System.assertEquals(createModerationRequestInputOneOfInner1.hashCode(), createModerationRequestInputOneOfInner1.hashCode());
        System.assertEquals(createModerationRequestInputOneOfInner2.hashCode(), createModerationRequestInputOneOfInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateModerationRequestInputOneOf createModerationRequestInputOneOfInner1 = OASCreateModerationRequestInputOneOf.getExample();
        OASCreateModerationRequestInputOneOf createModerationRequestInputOneOfInner2 = OASCreateModerationRequestInputOneOf.getExample();
        OASCreateModerationRequestInputOneOf createModerationRequestInputOneOfInner3 = new OASCreateModerationRequestInputOneOf();
        OASCreateModerationRequestInputOneOf createModerationRequestInputOneOfInner4 = new OASCreateModerationRequestInputOneOf();

        System.assert(createModerationRequestInputOneOfInner1.equals(createModerationRequestInputOneOfInner2));
        System.assert(createModerationRequestInputOneOfInner3.equals(createModerationRequestInputOneOfInner4));
        System.assertEquals(createModerationRequestInputOneOfInner1.hashCode(), createModerationRequestInputOneOfInner2.hashCode());
        System.assertEquals(createModerationRequestInputOneOfInner3.hashCode(), createModerationRequestInputOneOfInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateModerationRequestInputOneOf createModerationRequestInputOneOfInner = new OASCreateModerationRequestInputOneOf();
        Map<String, String> x-property-mappings = createModerationRequestInputOneOfInner.getx-property-mappings();
        System.assertEquals('imageUrl', x-property-mappings.get('image_url'));
    }
}
