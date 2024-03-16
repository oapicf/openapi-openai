@isTest
private class OASCreateEmbeddingRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateEmbeddingRequest createEmbeddingRequest1 = OASCreateEmbeddingRequest.getExample();
        OASCreateEmbeddingRequest createEmbeddingRequest2 = createEmbeddingRequest1;
        OASCreateEmbeddingRequest createEmbeddingRequest3 = new OASCreateEmbeddingRequest();
        OASCreateEmbeddingRequest createEmbeddingRequest4 = createEmbeddingRequest3;

        System.assert(createEmbeddingRequest1.equals(createEmbeddingRequest2));
        System.assert(createEmbeddingRequest2.equals(createEmbeddingRequest1));
        System.assert(createEmbeddingRequest1.equals(createEmbeddingRequest1));
        System.assert(createEmbeddingRequest3.equals(createEmbeddingRequest4));
        System.assert(createEmbeddingRequest4.equals(createEmbeddingRequest3));
        System.assert(createEmbeddingRequest3.equals(createEmbeddingRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateEmbeddingRequest createEmbeddingRequest1 = OASCreateEmbeddingRequest.getExample();
        OASCreateEmbeddingRequest createEmbeddingRequest2 = OASCreateEmbeddingRequest.getExample();
        OASCreateEmbeddingRequest createEmbeddingRequest3 = new OASCreateEmbeddingRequest();
        OASCreateEmbeddingRequest createEmbeddingRequest4 = new OASCreateEmbeddingRequest();

        System.assert(createEmbeddingRequest1.equals(createEmbeddingRequest2));
        System.assert(createEmbeddingRequest2.equals(createEmbeddingRequest1));
        System.assert(createEmbeddingRequest3.equals(createEmbeddingRequest4));
        System.assert(createEmbeddingRequest4.equals(createEmbeddingRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateEmbeddingRequest createEmbeddingRequest1 = OASCreateEmbeddingRequest.getExample();
        OASCreateEmbeddingRequest createEmbeddingRequest2 = new OASCreateEmbeddingRequest();

        System.assertEquals(false, createEmbeddingRequest1.equals('foo'));
        System.assertEquals(false, createEmbeddingRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateEmbeddingRequest createEmbeddingRequest1 = OASCreateEmbeddingRequest.getExample();
        OASCreateEmbeddingRequest createEmbeddingRequest2 = new OASCreateEmbeddingRequest();
        OASCreateEmbeddingRequest createEmbeddingRequest3;

        System.assertEquals(false, createEmbeddingRequest1.equals(createEmbeddingRequest3));
        System.assertEquals(false, createEmbeddingRequest2.equals(createEmbeddingRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateEmbeddingRequest createEmbeddingRequest1 = OASCreateEmbeddingRequest.getExample();
        OASCreateEmbeddingRequest createEmbeddingRequest2 = new OASCreateEmbeddingRequest();

        System.assertEquals(createEmbeddingRequest1.hashCode(), createEmbeddingRequest1.hashCode());
        System.assertEquals(createEmbeddingRequest2.hashCode(), createEmbeddingRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateEmbeddingRequest createEmbeddingRequest1 = OASCreateEmbeddingRequest.getExample();
        OASCreateEmbeddingRequest createEmbeddingRequest2 = OASCreateEmbeddingRequest.getExample();
        OASCreateEmbeddingRequest createEmbeddingRequest3 = new OASCreateEmbeddingRequest();
        OASCreateEmbeddingRequest createEmbeddingRequest4 = new OASCreateEmbeddingRequest();

        System.assert(createEmbeddingRequest1.equals(createEmbeddingRequest2));
        System.assert(createEmbeddingRequest3.equals(createEmbeddingRequest4));
        System.assertEquals(createEmbeddingRequest1.hashCode(), createEmbeddingRequest2.hashCode());
        System.assertEquals(createEmbeddingRequest3.hashCode(), createEmbeddingRequest4.hashCode());
    }
}
