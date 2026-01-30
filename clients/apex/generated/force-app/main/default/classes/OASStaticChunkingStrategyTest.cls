@isTest
private class OASStaticChunkingStrategyTest {
    @isTest
    private static void equalsSameInstance() {
        OASStaticChunkingStrategy staticChunkingStrategy1 = OASStaticChunkingStrategy.getExample();
        OASStaticChunkingStrategy staticChunkingStrategy2 = staticChunkingStrategy1;
        OASStaticChunkingStrategy staticChunkingStrategy3 = new OASStaticChunkingStrategy();
        OASStaticChunkingStrategy staticChunkingStrategy4 = staticChunkingStrategy3;

        System.assert(staticChunkingStrategy1.equals(staticChunkingStrategy2));
        System.assert(staticChunkingStrategy2.equals(staticChunkingStrategy1));
        System.assert(staticChunkingStrategy1.equals(staticChunkingStrategy1));
        System.assert(staticChunkingStrategy3.equals(staticChunkingStrategy4));
        System.assert(staticChunkingStrategy4.equals(staticChunkingStrategy3));
        System.assert(staticChunkingStrategy3.equals(staticChunkingStrategy3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASStaticChunkingStrategy staticChunkingStrategy1 = OASStaticChunkingStrategy.getExample();
        OASStaticChunkingStrategy staticChunkingStrategy2 = OASStaticChunkingStrategy.getExample();
        OASStaticChunkingStrategy staticChunkingStrategy3 = new OASStaticChunkingStrategy();
        OASStaticChunkingStrategy staticChunkingStrategy4 = new OASStaticChunkingStrategy();

        System.assert(staticChunkingStrategy1.equals(staticChunkingStrategy2));
        System.assert(staticChunkingStrategy2.equals(staticChunkingStrategy1));
        System.assert(staticChunkingStrategy3.equals(staticChunkingStrategy4));
        System.assert(staticChunkingStrategy4.equals(staticChunkingStrategy3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASStaticChunkingStrategy staticChunkingStrategy1 = OASStaticChunkingStrategy.getExample();
        OASStaticChunkingStrategy staticChunkingStrategy2 = new OASStaticChunkingStrategy();

        System.assertEquals(false, staticChunkingStrategy1.equals('foo'));
        System.assertEquals(false, staticChunkingStrategy2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASStaticChunkingStrategy staticChunkingStrategy1 = OASStaticChunkingStrategy.getExample();
        OASStaticChunkingStrategy staticChunkingStrategy2 = new OASStaticChunkingStrategy();
        OASStaticChunkingStrategy staticChunkingStrategy3;

        System.assertEquals(false, staticChunkingStrategy1.equals(staticChunkingStrategy3));
        System.assertEquals(false, staticChunkingStrategy2.equals(staticChunkingStrategy3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASStaticChunkingStrategy staticChunkingStrategy1 = OASStaticChunkingStrategy.getExample();
        OASStaticChunkingStrategy staticChunkingStrategy2 = new OASStaticChunkingStrategy();

        System.assertEquals(staticChunkingStrategy1.hashCode(), staticChunkingStrategy1.hashCode());
        System.assertEquals(staticChunkingStrategy2.hashCode(), staticChunkingStrategy2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASStaticChunkingStrategy staticChunkingStrategy1 = OASStaticChunkingStrategy.getExample();
        OASStaticChunkingStrategy staticChunkingStrategy2 = OASStaticChunkingStrategy.getExample();
        OASStaticChunkingStrategy staticChunkingStrategy3 = new OASStaticChunkingStrategy();
        OASStaticChunkingStrategy staticChunkingStrategy4 = new OASStaticChunkingStrategy();

        System.assert(staticChunkingStrategy1.equals(staticChunkingStrategy2));
        System.assert(staticChunkingStrategy3.equals(staticChunkingStrategy4));
        System.assertEquals(staticChunkingStrategy1.hashCode(), staticChunkingStrategy2.hashCode());
        System.assertEquals(staticChunkingStrategy3.hashCode(), staticChunkingStrategy4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASStaticChunkingStrategy staticChunkingStrategy = new OASStaticChunkingStrategy();
        Map<String, String> x-property-mappings = staticChunkingStrategy.getx-property-mappings();
        System.assertEquals('r_static', x-property-mappings.get('static'));
    }
}
