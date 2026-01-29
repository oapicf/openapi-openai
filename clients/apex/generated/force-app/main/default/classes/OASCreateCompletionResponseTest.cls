@isTest
private class OASCreateCompletionResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateCompletionResponse createCompletionResponse1 = OASCreateCompletionResponse.getExample();
        OASCreateCompletionResponse createCompletionResponse2 = createCompletionResponse1;
        OASCreateCompletionResponse createCompletionResponse3 = new OASCreateCompletionResponse();
        OASCreateCompletionResponse createCompletionResponse4 = createCompletionResponse3;

        System.assert(createCompletionResponse1.equals(createCompletionResponse2));
        System.assert(createCompletionResponse2.equals(createCompletionResponse1));
        System.assert(createCompletionResponse1.equals(createCompletionResponse1));
        System.assert(createCompletionResponse3.equals(createCompletionResponse4));
        System.assert(createCompletionResponse4.equals(createCompletionResponse3));
        System.assert(createCompletionResponse3.equals(createCompletionResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateCompletionResponse createCompletionResponse1 = OASCreateCompletionResponse.getExample();
        OASCreateCompletionResponse createCompletionResponse2 = OASCreateCompletionResponse.getExample();
        OASCreateCompletionResponse createCompletionResponse3 = new OASCreateCompletionResponse();
        OASCreateCompletionResponse createCompletionResponse4 = new OASCreateCompletionResponse();

        System.assert(createCompletionResponse1.equals(createCompletionResponse2));
        System.assert(createCompletionResponse2.equals(createCompletionResponse1));
        System.assert(createCompletionResponse3.equals(createCompletionResponse4));
        System.assert(createCompletionResponse4.equals(createCompletionResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateCompletionResponse createCompletionResponse1 = OASCreateCompletionResponse.getExample();
        OASCreateCompletionResponse createCompletionResponse2 = new OASCreateCompletionResponse();

        System.assertEquals(false, createCompletionResponse1.equals('foo'));
        System.assertEquals(false, createCompletionResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateCompletionResponse createCompletionResponse1 = OASCreateCompletionResponse.getExample();
        OASCreateCompletionResponse createCompletionResponse2 = new OASCreateCompletionResponse();
        OASCreateCompletionResponse createCompletionResponse3;

        System.assertEquals(false, createCompletionResponse1.equals(createCompletionResponse3));
        System.assertEquals(false, createCompletionResponse2.equals(createCompletionResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateCompletionResponse createCompletionResponse1 = OASCreateCompletionResponse.getExample();
        OASCreateCompletionResponse createCompletionResponse2 = new OASCreateCompletionResponse();

        System.assertEquals(createCompletionResponse1.hashCode(), createCompletionResponse1.hashCode());
        System.assertEquals(createCompletionResponse2.hashCode(), createCompletionResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateCompletionResponse createCompletionResponse1 = OASCreateCompletionResponse.getExample();
        OASCreateCompletionResponse createCompletionResponse2 = OASCreateCompletionResponse.getExample();
        OASCreateCompletionResponse createCompletionResponse3 = new OASCreateCompletionResponse();
        OASCreateCompletionResponse createCompletionResponse4 = new OASCreateCompletionResponse();

        System.assert(createCompletionResponse1.equals(createCompletionResponse2));
        System.assert(createCompletionResponse3.equals(createCompletionResponse4));
        System.assertEquals(createCompletionResponse1.hashCode(), createCompletionResponse2.hashCode());
        System.assertEquals(createCompletionResponse3.hashCode(), createCompletionResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateCompletionResponse createCompletionResponse = new OASCreateCompletionResponse();
        Map<String, String> x-property-mappings = createCompletionResponse.getx-property-mappings();
        System.assertEquals('systemFingerprint', x-property-mappings.get('system_fingerprint'));
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateCompletionResponse createCompletionResponse = new OASCreateCompletionResponse();
        System.assertEquals(new List<OASCreateCompletionResponseChoicesIn>(), createCompletionResponse.choices);
        System.assertEquals(null, createCompletionResponse.id);
        System.assertEquals(null, createCompletionResponse.created);
        System.assertEquals(null, createCompletionResponse.model);
        System.assertEquals(null, createCompletionResponse.systemFingerprint);
        System.assertEquals(null, createCompletionResponse.r_object);
        System.assertEquals(null, createCompletionResponse.usage);
    }
}
