@isTest
private class OASEmbeddingTest {
    @isTest
    private static void equalsSameInstance() {
        OASEmbedding embedding1 = OASEmbedding.getExample();
        OASEmbedding embedding2 = embedding1;
        OASEmbedding embedding3 = new OASEmbedding();
        OASEmbedding embedding4 = embedding3;

        System.assert(embedding1.equals(embedding2));
        System.assert(embedding2.equals(embedding1));
        System.assert(embedding1.equals(embedding1));
        System.assert(embedding3.equals(embedding4));
        System.assert(embedding4.equals(embedding3));
        System.assert(embedding3.equals(embedding3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEmbedding embedding1 = OASEmbedding.getExample();
        OASEmbedding embedding2 = OASEmbedding.getExample();
        OASEmbedding embedding3 = new OASEmbedding();
        OASEmbedding embedding4 = new OASEmbedding();

        System.assert(embedding1.equals(embedding2));
        System.assert(embedding2.equals(embedding1));
        System.assert(embedding3.equals(embedding4));
        System.assert(embedding4.equals(embedding3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEmbedding embedding1 = OASEmbedding.getExample();
        OASEmbedding embedding2 = new OASEmbedding();

        System.assertEquals(false, embedding1.equals('foo'));
        System.assertEquals(false, embedding2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEmbedding embedding1 = OASEmbedding.getExample();
        OASEmbedding embedding2 = new OASEmbedding();
        OASEmbedding embedding3;

        System.assertEquals(false, embedding1.equals(embedding3));
        System.assertEquals(false, embedding2.equals(embedding3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEmbedding embedding1 = OASEmbedding.getExample();
        OASEmbedding embedding2 = new OASEmbedding();

        System.assertEquals(embedding1.hashCode(), embedding1.hashCode());
        System.assertEquals(embedding2.hashCode(), embedding2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEmbedding embedding1 = OASEmbedding.getExample();
        OASEmbedding embedding2 = OASEmbedding.getExample();
        OASEmbedding embedding3 = new OASEmbedding();
        OASEmbedding embedding4 = new OASEmbedding();

        System.assert(embedding1.equals(embedding2));
        System.assert(embedding3.equals(embedding4));
        System.assertEquals(embedding1.hashCode(), embedding2.hashCode());
        System.assertEquals(embedding3.hashCode(), embedding4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASEmbedding embedding = new OASEmbedding();
        Map<String, String> x-property-mappings = embedding.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASEmbedding embedding = new OASEmbedding();
        System.assertEquals(new List<Double>(), embedding.embedding);
        System.assertEquals(null, embedding.index);
        System.assertEquals(null, embedding.r_object);
    }
}
