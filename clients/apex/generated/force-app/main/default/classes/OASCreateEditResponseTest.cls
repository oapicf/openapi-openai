@isTest
private class OASCreateEditResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateEditResponse createEditResponse1 = OASCreateEditResponse.getExample();
        OASCreateEditResponse createEditResponse2 = createEditResponse1;
        OASCreateEditResponse createEditResponse3 = new OASCreateEditResponse();
        OASCreateEditResponse createEditResponse4 = createEditResponse3;

        System.assert(createEditResponse1.equals(createEditResponse2));
        System.assert(createEditResponse2.equals(createEditResponse1));
        System.assert(createEditResponse1.equals(createEditResponse1));
        System.assert(createEditResponse3.equals(createEditResponse4));
        System.assert(createEditResponse4.equals(createEditResponse3));
        System.assert(createEditResponse3.equals(createEditResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateEditResponse createEditResponse1 = OASCreateEditResponse.getExample();
        OASCreateEditResponse createEditResponse2 = OASCreateEditResponse.getExample();
        OASCreateEditResponse createEditResponse3 = new OASCreateEditResponse();
        OASCreateEditResponse createEditResponse4 = new OASCreateEditResponse();

        System.assert(createEditResponse1.equals(createEditResponse2));
        System.assert(createEditResponse2.equals(createEditResponse1));
        System.assert(createEditResponse3.equals(createEditResponse4));
        System.assert(createEditResponse4.equals(createEditResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateEditResponse createEditResponse1 = OASCreateEditResponse.getExample();
        OASCreateEditResponse createEditResponse2 = new OASCreateEditResponse();

        System.assertEquals(false, createEditResponse1.equals('foo'));
        System.assertEquals(false, createEditResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateEditResponse createEditResponse1 = OASCreateEditResponse.getExample();
        OASCreateEditResponse createEditResponse2 = new OASCreateEditResponse();
        OASCreateEditResponse createEditResponse3;

        System.assertEquals(false, createEditResponse1.equals(createEditResponse3));
        System.assertEquals(false, createEditResponse2.equals(createEditResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateEditResponse createEditResponse1 = OASCreateEditResponse.getExample();
        OASCreateEditResponse createEditResponse2 = new OASCreateEditResponse();

        System.assertEquals(createEditResponse1.hashCode(), createEditResponse1.hashCode());
        System.assertEquals(createEditResponse2.hashCode(), createEditResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateEditResponse createEditResponse1 = OASCreateEditResponse.getExample();
        OASCreateEditResponse createEditResponse2 = OASCreateEditResponse.getExample();
        OASCreateEditResponse createEditResponse3 = new OASCreateEditResponse();
        OASCreateEditResponse createEditResponse4 = new OASCreateEditResponse();

        System.assert(createEditResponse1.equals(createEditResponse2));
        System.assert(createEditResponse3.equals(createEditResponse4));
        System.assertEquals(createEditResponse1.hashCode(), createEditResponse2.hashCode());
        System.assertEquals(createEditResponse3.hashCode(), createEditResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateEditResponse createEditResponse = new OASCreateEditResponse();
        Map<String, String> x-property-mappings = createEditResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateEditResponse createEditResponse = new OASCreateEditResponse();
        System.assertEquals(new List<OASCreateEditResponseChoicesInner>(), createEditResponse.choices);
        System.assertEquals(null, createEditResponse.r_object);
        System.assertEquals(null, createEditResponse.created);
        System.assertEquals(null, createEditResponse.usage);
    }
}
