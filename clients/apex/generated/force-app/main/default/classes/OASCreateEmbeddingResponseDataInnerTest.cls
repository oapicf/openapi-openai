@isTest
private class OASCreateEmbeddingResponseDataInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateEmbeddingResponseDataInner createEmbeddingResponseDataInner1 = OASCreateEmbeddingResponseDataInner.getExample();
        OASCreateEmbeddingResponseDataInner createEmbeddingResponseDataInner2 = createEmbeddingResponseDataInner1;
        OASCreateEmbeddingResponseDataInner createEmbeddingResponseDataInner3 = new OASCreateEmbeddingResponseDataInner();
        OASCreateEmbeddingResponseDataInner createEmbeddingResponseDataInner4 = createEmbeddingResponseDataInner3;

        System.assert(createEmbeddingResponseDataInner1.equals(createEmbeddingResponseDataInner2));
        System.assert(createEmbeddingResponseDataInner2.equals(createEmbeddingResponseDataInner1));
        System.assert(createEmbeddingResponseDataInner1.equals(createEmbeddingResponseDataInner1));
        System.assert(createEmbeddingResponseDataInner3.equals(createEmbeddingResponseDataInner4));
        System.assert(createEmbeddingResponseDataInner4.equals(createEmbeddingResponseDataInner3));
        System.assert(createEmbeddingResponseDataInner3.equals(createEmbeddingResponseDataInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateEmbeddingResponseDataInner createEmbeddingResponseDataInner1 = OASCreateEmbeddingResponseDataInner.getExample();
        OASCreateEmbeddingResponseDataInner createEmbeddingResponseDataInner2 = OASCreateEmbeddingResponseDataInner.getExample();
        OASCreateEmbeddingResponseDataInner createEmbeddingResponseDataInner3 = new OASCreateEmbeddingResponseDataInner();
        OASCreateEmbeddingResponseDataInner createEmbeddingResponseDataInner4 = new OASCreateEmbeddingResponseDataInner();

        System.assert(createEmbeddingResponseDataInner1.equals(createEmbeddingResponseDataInner2));
        System.assert(createEmbeddingResponseDataInner2.equals(createEmbeddingResponseDataInner1));
        System.assert(createEmbeddingResponseDataInner3.equals(createEmbeddingResponseDataInner4));
        System.assert(createEmbeddingResponseDataInner4.equals(createEmbeddingResponseDataInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateEmbeddingResponseDataInner createEmbeddingResponseDataInner1 = OASCreateEmbeddingResponseDataInner.getExample();
        OASCreateEmbeddingResponseDataInner createEmbeddingResponseDataInner2 = new OASCreateEmbeddingResponseDataInner();

        System.assertEquals(false, createEmbeddingResponseDataInner1.equals('foo'));
        System.assertEquals(false, createEmbeddingResponseDataInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateEmbeddingResponseDataInner createEmbeddingResponseDataInner1 = OASCreateEmbeddingResponseDataInner.getExample();
        OASCreateEmbeddingResponseDataInner createEmbeddingResponseDataInner2 = new OASCreateEmbeddingResponseDataInner();
        OASCreateEmbeddingResponseDataInner createEmbeddingResponseDataInner3;

        System.assertEquals(false, createEmbeddingResponseDataInner1.equals(createEmbeddingResponseDataInner3));
        System.assertEquals(false, createEmbeddingResponseDataInner2.equals(createEmbeddingResponseDataInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateEmbeddingResponseDataInner createEmbeddingResponseDataInner1 = OASCreateEmbeddingResponseDataInner.getExample();
        OASCreateEmbeddingResponseDataInner createEmbeddingResponseDataInner2 = new OASCreateEmbeddingResponseDataInner();

        System.assertEquals(createEmbeddingResponseDataInner1.hashCode(), createEmbeddingResponseDataInner1.hashCode());
        System.assertEquals(createEmbeddingResponseDataInner2.hashCode(), createEmbeddingResponseDataInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateEmbeddingResponseDataInner createEmbeddingResponseDataInner1 = OASCreateEmbeddingResponseDataInner.getExample();
        OASCreateEmbeddingResponseDataInner createEmbeddingResponseDataInner2 = OASCreateEmbeddingResponseDataInner.getExample();
        OASCreateEmbeddingResponseDataInner createEmbeddingResponseDataInner3 = new OASCreateEmbeddingResponseDataInner();
        OASCreateEmbeddingResponseDataInner createEmbeddingResponseDataInner4 = new OASCreateEmbeddingResponseDataInner();

        System.assert(createEmbeddingResponseDataInner1.equals(createEmbeddingResponseDataInner2));
        System.assert(createEmbeddingResponseDataInner3.equals(createEmbeddingResponseDataInner4));
        System.assertEquals(createEmbeddingResponseDataInner1.hashCode(), createEmbeddingResponseDataInner2.hashCode());
        System.assertEquals(createEmbeddingResponseDataInner3.hashCode(), createEmbeddingResponseDataInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateEmbeddingResponseDataInner createEmbeddingResponseDataInner = new OASCreateEmbeddingResponseDataInner();
        Map<String, String> x-property-mappings = createEmbeddingResponseDataInner.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateEmbeddingResponseDataInner createEmbeddingResponseDataInner = new OASCreateEmbeddingResponseDataInner();
        System.assertEquals(new List<Double>(), createEmbeddingResponseDataInner.embedding);
        System.assertEquals(null, createEmbeddingResponseDataInner.index);
        System.assertEquals(null, createEmbeddingResponseDataInner.r_object);
    }
}
