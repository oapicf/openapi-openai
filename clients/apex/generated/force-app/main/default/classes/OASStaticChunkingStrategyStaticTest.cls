@isTest
private class OASStaticChunkingStrategyStaticTest {
    @isTest
    private static void equalsSameInstance() {
        OASStaticChunkingStrategyStatic staticChunkingStrategyStatic1 = OASStaticChunkingStrategyStatic.getExample();
        OASStaticChunkingStrategyStatic staticChunkingStrategyStatic2 = staticChunkingStrategyStatic1;
        OASStaticChunkingStrategyStatic staticChunkingStrategyStatic3 = new OASStaticChunkingStrategyStatic();
        OASStaticChunkingStrategyStatic staticChunkingStrategyStatic4 = staticChunkingStrategyStatic3;

        System.assert(staticChunkingStrategyStatic1.equals(staticChunkingStrategyStatic2));
        System.assert(staticChunkingStrategyStatic2.equals(staticChunkingStrategyStatic1));
        System.assert(staticChunkingStrategyStatic1.equals(staticChunkingStrategyStatic1));
        System.assert(staticChunkingStrategyStatic3.equals(staticChunkingStrategyStatic4));
        System.assert(staticChunkingStrategyStatic4.equals(staticChunkingStrategyStatic3));
        System.assert(staticChunkingStrategyStatic3.equals(staticChunkingStrategyStatic3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASStaticChunkingStrategyStatic staticChunkingStrategyStatic1 = OASStaticChunkingStrategyStatic.getExample();
        OASStaticChunkingStrategyStatic staticChunkingStrategyStatic2 = OASStaticChunkingStrategyStatic.getExample();
        OASStaticChunkingStrategyStatic staticChunkingStrategyStatic3 = new OASStaticChunkingStrategyStatic();
        OASStaticChunkingStrategyStatic staticChunkingStrategyStatic4 = new OASStaticChunkingStrategyStatic();

        System.assert(staticChunkingStrategyStatic1.equals(staticChunkingStrategyStatic2));
        System.assert(staticChunkingStrategyStatic2.equals(staticChunkingStrategyStatic1));
        System.assert(staticChunkingStrategyStatic3.equals(staticChunkingStrategyStatic4));
        System.assert(staticChunkingStrategyStatic4.equals(staticChunkingStrategyStatic3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASStaticChunkingStrategyStatic staticChunkingStrategyStatic1 = OASStaticChunkingStrategyStatic.getExample();
        OASStaticChunkingStrategyStatic staticChunkingStrategyStatic2 = new OASStaticChunkingStrategyStatic();

        System.assertEquals(false, staticChunkingStrategyStatic1.equals('foo'));
        System.assertEquals(false, staticChunkingStrategyStatic2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASStaticChunkingStrategyStatic staticChunkingStrategyStatic1 = OASStaticChunkingStrategyStatic.getExample();
        OASStaticChunkingStrategyStatic staticChunkingStrategyStatic2 = new OASStaticChunkingStrategyStatic();
        OASStaticChunkingStrategyStatic staticChunkingStrategyStatic3;

        System.assertEquals(false, staticChunkingStrategyStatic1.equals(staticChunkingStrategyStatic3));
        System.assertEquals(false, staticChunkingStrategyStatic2.equals(staticChunkingStrategyStatic3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASStaticChunkingStrategyStatic staticChunkingStrategyStatic1 = OASStaticChunkingStrategyStatic.getExample();
        OASStaticChunkingStrategyStatic staticChunkingStrategyStatic2 = new OASStaticChunkingStrategyStatic();

        System.assertEquals(staticChunkingStrategyStatic1.hashCode(), staticChunkingStrategyStatic1.hashCode());
        System.assertEquals(staticChunkingStrategyStatic2.hashCode(), staticChunkingStrategyStatic2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASStaticChunkingStrategyStatic staticChunkingStrategyStatic1 = OASStaticChunkingStrategyStatic.getExample();
        OASStaticChunkingStrategyStatic staticChunkingStrategyStatic2 = OASStaticChunkingStrategyStatic.getExample();
        OASStaticChunkingStrategyStatic staticChunkingStrategyStatic3 = new OASStaticChunkingStrategyStatic();
        OASStaticChunkingStrategyStatic staticChunkingStrategyStatic4 = new OASStaticChunkingStrategyStatic();

        System.assert(staticChunkingStrategyStatic1.equals(staticChunkingStrategyStatic2));
        System.assert(staticChunkingStrategyStatic3.equals(staticChunkingStrategyStatic4));
        System.assertEquals(staticChunkingStrategyStatic1.hashCode(), staticChunkingStrategyStatic2.hashCode());
        System.assertEquals(staticChunkingStrategyStatic3.hashCode(), staticChunkingStrategyStatic4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASStaticChunkingStrategyStatic staticChunkingStrategyStatic = new OASStaticChunkingStrategyStatic();
        Map<String, String> x-property-mappings = staticChunkingStrategyStatic.getx-property-mappings();
        System.assertEquals('maxChunkSizeTokens', x-property-mappings.get('max_chunk_size_tokens'));
        System.assertEquals('chunkOverlapTokens', x-property-mappings.get('chunk_overlap_tokens'));
    }
}
