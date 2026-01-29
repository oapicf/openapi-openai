@isTest
private class OASCreateEmbeddingResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateEmbeddingResponse createEmbeddingResponse1 = OASCreateEmbeddingResponse.getExample();
        OASCreateEmbeddingResponse createEmbeddingResponse2 = createEmbeddingResponse1;
        OASCreateEmbeddingResponse createEmbeddingResponse3 = new OASCreateEmbeddingResponse();
        OASCreateEmbeddingResponse createEmbeddingResponse4 = createEmbeddingResponse3;

        System.assert(createEmbeddingResponse1.equals(createEmbeddingResponse2));
        System.assert(createEmbeddingResponse2.equals(createEmbeddingResponse1));
        System.assert(createEmbeddingResponse1.equals(createEmbeddingResponse1));
        System.assert(createEmbeddingResponse3.equals(createEmbeddingResponse4));
        System.assert(createEmbeddingResponse4.equals(createEmbeddingResponse3));
        System.assert(createEmbeddingResponse3.equals(createEmbeddingResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateEmbeddingResponse createEmbeddingResponse1 = OASCreateEmbeddingResponse.getExample();
        OASCreateEmbeddingResponse createEmbeddingResponse2 = OASCreateEmbeddingResponse.getExample();
        OASCreateEmbeddingResponse createEmbeddingResponse3 = new OASCreateEmbeddingResponse();
        OASCreateEmbeddingResponse createEmbeddingResponse4 = new OASCreateEmbeddingResponse();

        System.assert(createEmbeddingResponse1.equals(createEmbeddingResponse2));
        System.assert(createEmbeddingResponse2.equals(createEmbeddingResponse1));
        System.assert(createEmbeddingResponse3.equals(createEmbeddingResponse4));
        System.assert(createEmbeddingResponse4.equals(createEmbeddingResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateEmbeddingResponse createEmbeddingResponse1 = OASCreateEmbeddingResponse.getExample();
        OASCreateEmbeddingResponse createEmbeddingResponse2 = new OASCreateEmbeddingResponse();

        System.assertEquals(false, createEmbeddingResponse1.equals('foo'));
        System.assertEquals(false, createEmbeddingResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateEmbeddingResponse createEmbeddingResponse1 = OASCreateEmbeddingResponse.getExample();
        OASCreateEmbeddingResponse createEmbeddingResponse2 = new OASCreateEmbeddingResponse();
        OASCreateEmbeddingResponse createEmbeddingResponse3;

        System.assertEquals(false, createEmbeddingResponse1.equals(createEmbeddingResponse3));
        System.assertEquals(false, createEmbeddingResponse2.equals(createEmbeddingResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateEmbeddingResponse createEmbeddingResponse1 = OASCreateEmbeddingResponse.getExample();
        OASCreateEmbeddingResponse createEmbeddingResponse2 = new OASCreateEmbeddingResponse();

        System.assertEquals(createEmbeddingResponse1.hashCode(), createEmbeddingResponse1.hashCode());
        System.assertEquals(createEmbeddingResponse2.hashCode(), createEmbeddingResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateEmbeddingResponse createEmbeddingResponse1 = OASCreateEmbeddingResponse.getExample();
        OASCreateEmbeddingResponse createEmbeddingResponse2 = OASCreateEmbeddingResponse.getExample();
        OASCreateEmbeddingResponse createEmbeddingResponse3 = new OASCreateEmbeddingResponse();
        OASCreateEmbeddingResponse createEmbeddingResponse4 = new OASCreateEmbeddingResponse();

        System.assert(createEmbeddingResponse1.equals(createEmbeddingResponse2));
        System.assert(createEmbeddingResponse3.equals(createEmbeddingResponse4));
        System.assertEquals(createEmbeddingResponse1.hashCode(), createEmbeddingResponse2.hashCode());
        System.assertEquals(createEmbeddingResponse3.hashCode(), createEmbeddingResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateEmbeddingResponse createEmbeddingResponse = new OASCreateEmbeddingResponse();
        Map<String, String> x-property-mappings = createEmbeddingResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateEmbeddingResponse createEmbeddingResponse = new OASCreateEmbeddingResponse();
        System.assertEquals(new List<OASEmbedding>(), createEmbeddingResponse.data);
        System.assertEquals(null, createEmbeddingResponse.model);
        System.assertEquals(null, createEmbeddingResponse.r_object);
        System.assertEquals(null, createEmbeddingResponse.usage);
    }
}
