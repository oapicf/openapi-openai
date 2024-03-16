@isTest
private class OASCreateEmbeddingResponseUsageTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateEmbeddingResponseUsage createEmbeddingResponseUsage1 = OASCreateEmbeddingResponseUsage.getExample();
        OASCreateEmbeddingResponseUsage createEmbeddingResponseUsage2 = createEmbeddingResponseUsage1;
        OASCreateEmbeddingResponseUsage createEmbeddingResponseUsage3 = new OASCreateEmbeddingResponseUsage();
        OASCreateEmbeddingResponseUsage createEmbeddingResponseUsage4 = createEmbeddingResponseUsage3;

        System.assert(createEmbeddingResponseUsage1.equals(createEmbeddingResponseUsage2));
        System.assert(createEmbeddingResponseUsage2.equals(createEmbeddingResponseUsage1));
        System.assert(createEmbeddingResponseUsage1.equals(createEmbeddingResponseUsage1));
        System.assert(createEmbeddingResponseUsage3.equals(createEmbeddingResponseUsage4));
        System.assert(createEmbeddingResponseUsage4.equals(createEmbeddingResponseUsage3));
        System.assert(createEmbeddingResponseUsage3.equals(createEmbeddingResponseUsage3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateEmbeddingResponseUsage createEmbeddingResponseUsage1 = OASCreateEmbeddingResponseUsage.getExample();
        OASCreateEmbeddingResponseUsage createEmbeddingResponseUsage2 = OASCreateEmbeddingResponseUsage.getExample();
        OASCreateEmbeddingResponseUsage createEmbeddingResponseUsage3 = new OASCreateEmbeddingResponseUsage();
        OASCreateEmbeddingResponseUsage createEmbeddingResponseUsage4 = new OASCreateEmbeddingResponseUsage();

        System.assert(createEmbeddingResponseUsage1.equals(createEmbeddingResponseUsage2));
        System.assert(createEmbeddingResponseUsage2.equals(createEmbeddingResponseUsage1));
        System.assert(createEmbeddingResponseUsage3.equals(createEmbeddingResponseUsage4));
        System.assert(createEmbeddingResponseUsage4.equals(createEmbeddingResponseUsage3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateEmbeddingResponseUsage createEmbeddingResponseUsage1 = OASCreateEmbeddingResponseUsage.getExample();
        OASCreateEmbeddingResponseUsage createEmbeddingResponseUsage2 = new OASCreateEmbeddingResponseUsage();

        System.assertEquals(false, createEmbeddingResponseUsage1.equals('foo'));
        System.assertEquals(false, createEmbeddingResponseUsage2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateEmbeddingResponseUsage createEmbeddingResponseUsage1 = OASCreateEmbeddingResponseUsage.getExample();
        OASCreateEmbeddingResponseUsage createEmbeddingResponseUsage2 = new OASCreateEmbeddingResponseUsage();
        OASCreateEmbeddingResponseUsage createEmbeddingResponseUsage3;

        System.assertEquals(false, createEmbeddingResponseUsage1.equals(createEmbeddingResponseUsage3));
        System.assertEquals(false, createEmbeddingResponseUsage2.equals(createEmbeddingResponseUsage3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateEmbeddingResponseUsage createEmbeddingResponseUsage1 = OASCreateEmbeddingResponseUsage.getExample();
        OASCreateEmbeddingResponseUsage createEmbeddingResponseUsage2 = new OASCreateEmbeddingResponseUsage();

        System.assertEquals(createEmbeddingResponseUsage1.hashCode(), createEmbeddingResponseUsage1.hashCode());
        System.assertEquals(createEmbeddingResponseUsage2.hashCode(), createEmbeddingResponseUsage2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateEmbeddingResponseUsage createEmbeddingResponseUsage1 = OASCreateEmbeddingResponseUsage.getExample();
        OASCreateEmbeddingResponseUsage createEmbeddingResponseUsage2 = OASCreateEmbeddingResponseUsage.getExample();
        OASCreateEmbeddingResponseUsage createEmbeddingResponseUsage3 = new OASCreateEmbeddingResponseUsage();
        OASCreateEmbeddingResponseUsage createEmbeddingResponseUsage4 = new OASCreateEmbeddingResponseUsage();

        System.assert(createEmbeddingResponseUsage1.equals(createEmbeddingResponseUsage2));
        System.assert(createEmbeddingResponseUsage3.equals(createEmbeddingResponseUsage4));
        System.assertEquals(createEmbeddingResponseUsage1.hashCode(), createEmbeddingResponseUsage2.hashCode());
        System.assertEquals(createEmbeddingResponseUsage3.hashCode(), createEmbeddingResponseUsage4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateEmbeddingResponseUsage createEmbeddingResponseUsage = new OASCreateEmbeddingResponseUsage();
        Map<String, String> x-property-mappings = createEmbeddingResponseUsage.getx-property-mappings();
        System.assertEquals('promptTokens', x-property-mappings.get('prompt_tokens'));
        System.assertEquals('totalTokens', x-property-mappings.get('total_tokens'));
    }
}
