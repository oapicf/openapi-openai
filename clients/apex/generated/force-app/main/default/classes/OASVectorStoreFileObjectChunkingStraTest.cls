@isTest
private class OASVectorStoreFileObjectChunkingStraTest {
    @isTest
    private static void equalsSameInstance() {
        OASVectorStoreFileObjectChunkingStra vectorStoreFileObjectChunkingStrategy1 = OASVectorStoreFileObjectChunkingStra.getExample();
        OASVectorStoreFileObjectChunkingStra vectorStoreFileObjectChunkingStrategy2 = vectorStoreFileObjectChunkingStrategy1;
        OASVectorStoreFileObjectChunkingStra vectorStoreFileObjectChunkingStrategy3 = new OASVectorStoreFileObjectChunkingStra();
        OASVectorStoreFileObjectChunkingStra vectorStoreFileObjectChunkingStrategy4 = vectorStoreFileObjectChunkingStrategy3;

        System.assert(vectorStoreFileObjectChunkingStrategy1.equals(vectorStoreFileObjectChunkingStrategy2));
        System.assert(vectorStoreFileObjectChunkingStrategy2.equals(vectorStoreFileObjectChunkingStrategy1));
        System.assert(vectorStoreFileObjectChunkingStrategy1.equals(vectorStoreFileObjectChunkingStrategy1));
        System.assert(vectorStoreFileObjectChunkingStrategy3.equals(vectorStoreFileObjectChunkingStrategy4));
        System.assert(vectorStoreFileObjectChunkingStrategy4.equals(vectorStoreFileObjectChunkingStrategy3));
        System.assert(vectorStoreFileObjectChunkingStrategy3.equals(vectorStoreFileObjectChunkingStrategy3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVectorStoreFileObjectChunkingStra vectorStoreFileObjectChunkingStrategy1 = OASVectorStoreFileObjectChunkingStra.getExample();
        OASVectorStoreFileObjectChunkingStra vectorStoreFileObjectChunkingStrategy2 = OASVectorStoreFileObjectChunkingStra.getExample();
        OASVectorStoreFileObjectChunkingStra vectorStoreFileObjectChunkingStrategy3 = new OASVectorStoreFileObjectChunkingStra();
        OASVectorStoreFileObjectChunkingStra vectorStoreFileObjectChunkingStrategy4 = new OASVectorStoreFileObjectChunkingStra();

        System.assert(vectorStoreFileObjectChunkingStrategy1.equals(vectorStoreFileObjectChunkingStrategy2));
        System.assert(vectorStoreFileObjectChunkingStrategy2.equals(vectorStoreFileObjectChunkingStrategy1));
        System.assert(vectorStoreFileObjectChunkingStrategy3.equals(vectorStoreFileObjectChunkingStrategy4));
        System.assert(vectorStoreFileObjectChunkingStrategy4.equals(vectorStoreFileObjectChunkingStrategy3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVectorStoreFileObjectChunkingStra vectorStoreFileObjectChunkingStrategy1 = OASVectorStoreFileObjectChunkingStra.getExample();
        OASVectorStoreFileObjectChunkingStra vectorStoreFileObjectChunkingStrategy2 = new OASVectorStoreFileObjectChunkingStra();

        System.assertEquals(false, vectorStoreFileObjectChunkingStrategy1.equals('foo'));
        System.assertEquals(false, vectorStoreFileObjectChunkingStrategy2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVectorStoreFileObjectChunkingStra vectorStoreFileObjectChunkingStrategy1 = OASVectorStoreFileObjectChunkingStra.getExample();
        OASVectorStoreFileObjectChunkingStra vectorStoreFileObjectChunkingStrategy2 = new OASVectorStoreFileObjectChunkingStra();
        OASVectorStoreFileObjectChunkingStra vectorStoreFileObjectChunkingStrategy3;

        System.assertEquals(false, vectorStoreFileObjectChunkingStrategy1.equals(vectorStoreFileObjectChunkingStrategy3));
        System.assertEquals(false, vectorStoreFileObjectChunkingStrategy2.equals(vectorStoreFileObjectChunkingStrategy3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVectorStoreFileObjectChunkingStra vectorStoreFileObjectChunkingStrategy1 = OASVectorStoreFileObjectChunkingStra.getExample();
        OASVectorStoreFileObjectChunkingStra vectorStoreFileObjectChunkingStrategy2 = new OASVectorStoreFileObjectChunkingStra();

        System.assertEquals(vectorStoreFileObjectChunkingStrategy1.hashCode(), vectorStoreFileObjectChunkingStrategy1.hashCode());
        System.assertEquals(vectorStoreFileObjectChunkingStrategy2.hashCode(), vectorStoreFileObjectChunkingStrategy2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVectorStoreFileObjectChunkingStra vectorStoreFileObjectChunkingStrategy1 = OASVectorStoreFileObjectChunkingStra.getExample();
        OASVectorStoreFileObjectChunkingStra vectorStoreFileObjectChunkingStrategy2 = OASVectorStoreFileObjectChunkingStra.getExample();
        OASVectorStoreFileObjectChunkingStra vectorStoreFileObjectChunkingStrategy3 = new OASVectorStoreFileObjectChunkingStra();
        OASVectorStoreFileObjectChunkingStra vectorStoreFileObjectChunkingStrategy4 = new OASVectorStoreFileObjectChunkingStra();

        System.assert(vectorStoreFileObjectChunkingStrategy1.equals(vectorStoreFileObjectChunkingStrategy2));
        System.assert(vectorStoreFileObjectChunkingStrategy3.equals(vectorStoreFileObjectChunkingStrategy4));
        System.assertEquals(vectorStoreFileObjectChunkingStrategy1.hashCode(), vectorStoreFileObjectChunkingStrategy2.hashCode());
        System.assertEquals(vectorStoreFileObjectChunkingStrategy3.hashCode(), vectorStoreFileObjectChunkingStrategy4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASVectorStoreFileObjectChunkingStra vectorStoreFileObjectChunkingStrategy = new OASVectorStoreFileObjectChunkingStra();
        Map<String, String> x-property-mappings = vectorStoreFileObjectChunkingStrategy.getx-property-mappings();
        System.assertEquals('r_static', x-property-mappings.get('static'));
    }
}
