@isTest
private class OASCreateVectorStoreRequestChunkingSTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateVectorStoreRequestChunkingS createVectorStoreRequestChunkingStrategy1 = OASCreateVectorStoreRequestChunkingS.getExample();
        OASCreateVectorStoreRequestChunkingS createVectorStoreRequestChunkingStrategy2 = createVectorStoreRequestChunkingStrategy1;
        OASCreateVectorStoreRequestChunkingS createVectorStoreRequestChunkingStrategy3 = new OASCreateVectorStoreRequestChunkingS();
        OASCreateVectorStoreRequestChunkingS createVectorStoreRequestChunkingStrategy4 = createVectorStoreRequestChunkingStrategy3;

        System.assert(createVectorStoreRequestChunkingStrategy1.equals(createVectorStoreRequestChunkingStrategy2));
        System.assert(createVectorStoreRequestChunkingStrategy2.equals(createVectorStoreRequestChunkingStrategy1));
        System.assert(createVectorStoreRequestChunkingStrategy1.equals(createVectorStoreRequestChunkingStrategy1));
        System.assert(createVectorStoreRequestChunkingStrategy3.equals(createVectorStoreRequestChunkingStrategy4));
        System.assert(createVectorStoreRequestChunkingStrategy4.equals(createVectorStoreRequestChunkingStrategy3));
        System.assert(createVectorStoreRequestChunkingStrategy3.equals(createVectorStoreRequestChunkingStrategy3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateVectorStoreRequestChunkingS createVectorStoreRequestChunkingStrategy1 = OASCreateVectorStoreRequestChunkingS.getExample();
        OASCreateVectorStoreRequestChunkingS createVectorStoreRequestChunkingStrategy2 = OASCreateVectorStoreRequestChunkingS.getExample();
        OASCreateVectorStoreRequestChunkingS createVectorStoreRequestChunkingStrategy3 = new OASCreateVectorStoreRequestChunkingS();
        OASCreateVectorStoreRequestChunkingS createVectorStoreRequestChunkingStrategy4 = new OASCreateVectorStoreRequestChunkingS();

        System.assert(createVectorStoreRequestChunkingStrategy1.equals(createVectorStoreRequestChunkingStrategy2));
        System.assert(createVectorStoreRequestChunkingStrategy2.equals(createVectorStoreRequestChunkingStrategy1));
        System.assert(createVectorStoreRequestChunkingStrategy3.equals(createVectorStoreRequestChunkingStrategy4));
        System.assert(createVectorStoreRequestChunkingStrategy4.equals(createVectorStoreRequestChunkingStrategy3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateVectorStoreRequestChunkingS createVectorStoreRequestChunkingStrategy1 = OASCreateVectorStoreRequestChunkingS.getExample();
        OASCreateVectorStoreRequestChunkingS createVectorStoreRequestChunkingStrategy2 = new OASCreateVectorStoreRequestChunkingS();

        System.assertEquals(false, createVectorStoreRequestChunkingStrategy1.equals('foo'));
        System.assertEquals(false, createVectorStoreRequestChunkingStrategy2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateVectorStoreRequestChunkingS createVectorStoreRequestChunkingStrategy1 = OASCreateVectorStoreRequestChunkingS.getExample();
        OASCreateVectorStoreRequestChunkingS createVectorStoreRequestChunkingStrategy2 = new OASCreateVectorStoreRequestChunkingS();
        OASCreateVectorStoreRequestChunkingS createVectorStoreRequestChunkingStrategy3;

        System.assertEquals(false, createVectorStoreRequestChunkingStrategy1.equals(createVectorStoreRequestChunkingStrategy3));
        System.assertEquals(false, createVectorStoreRequestChunkingStrategy2.equals(createVectorStoreRequestChunkingStrategy3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateVectorStoreRequestChunkingS createVectorStoreRequestChunkingStrategy1 = OASCreateVectorStoreRequestChunkingS.getExample();
        OASCreateVectorStoreRequestChunkingS createVectorStoreRequestChunkingStrategy2 = new OASCreateVectorStoreRequestChunkingS();

        System.assertEquals(createVectorStoreRequestChunkingStrategy1.hashCode(), createVectorStoreRequestChunkingStrategy1.hashCode());
        System.assertEquals(createVectorStoreRequestChunkingStrategy2.hashCode(), createVectorStoreRequestChunkingStrategy2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateVectorStoreRequestChunkingS createVectorStoreRequestChunkingStrategy1 = OASCreateVectorStoreRequestChunkingS.getExample();
        OASCreateVectorStoreRequestChunkingS createVectorStoreRequestChunkingStrategy2 = OASCreateVectorStoreRequestChunkingS.getExample();
        OASCreateVectorStoreRequestChunkingS createVectorStoreRequestChunkingStrategy3 = new OASCreateVectorStoreRequestChunkingS();
        OASCreateVectorStoreRequestChunkingS createVectorStoreRequestChunkingStrategy4 = new OASCreateVectorStoreRequestChunkingS();

        System.assert(createVectorStoreRequestChunkingStrategy1.equals(createVectorStoreRequestChunkingStrategy2));
        System.assert(createVectorStoreRequestChunkingStrategy3.equals(createVectorStoreRequestChunkingStrategy4));
        System.assertEquals(createVectorStoreRequestChunkingStrategy1.hashCode(), createVectorStoreRequestChunkingStrategy2.hashCode());
        System.assertEquals(createVectorStoreRequestChunkingStrategy3.hashCode(), createVectorStoreRequestChunkingStrategy4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateVectorStoreRequestChunkingS createVectorStoreRequestChunkingStrategy = new OASCreateVectorStoreRequestChunkingS();
        Map<String, String> x-property-mappings = createVectorStoreRequestChunkingStrategy.getx-property-mappings();
        System.assertEquals('r_static', x-property-mappings.get('static'));
    }
}
